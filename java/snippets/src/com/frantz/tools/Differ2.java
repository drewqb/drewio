package com.frantz.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.Files;

public class Differ2 {
	private List<String> m_Diffs = new ArrayList<String>();
	private List<String> m_onlyRight = new ArrayList<String>();
	private List<String> m_onlyLeft = new ArrayList<String>();
	private String m_righBase = "";
	private String m_leftBase = "";
	private boolean m_bDiffs = true;
	private boolean m_bonlyRight = true;
	private boolean m_bonlyLeft = false;

	public Differ2(String sLeft, String sRight) {
		m_leftBase = sLeft;
		m_righBase = sRight;
	}

	public static void main(String... args) {
		if (args.length < 2) {
			System.out.println("args required: leftDirectory rightDirectory");
			return;
		}
		File theFile0 = new File(args[0]);
		File theFile1 = new File(args[1]);
		if (!theFile0.exists() || !theFile0.isDirectory()) {
			System.out.println("Error: invalid directory "
					+ theFile0.getAbsolutePath());
			return;
		}
		if (!theFile1.exists() || !theFile1.isDirectory()) {
			System.out.println("Error: invalid directory "
					+ theFile1.getAbsolutePath());
			return;
		}

		Differ2 compare = new Differ2(args[0], args[1]);
		compare.run();
		compare.printResults2();
	}

	public void printResults2() {
		Collections.sort(m_Diffs, new StrComp());
		Collections.sort(m_onlyRight, new StrComp());
		Collections.sort(m_onlyLeft, new StrComp());
		if (m_bDiffs) {
			for (String s : m_Diffs) {
				String theKey = s;
				theKey = theKey.substring(m_righBase.length() + 1);
				System.out.println("xcopy   " + s + " %TARGET_DIR%\\" + theKey
						+ "* /s");
			}
		}
		if (m_bonlyRight) {
			for (String s : m_onlyRight) {
				String theKey = s;
				theKey = theKey.substring(m_righBase.length() + 1);
				System.out.println("xcopy   " + s + " %TARGET_DIR%\\" + theKey
						+ "* /s");
			}
		}
		if (m_bonlyLeft) {
			for (String s : m_onlyLeft) {
				String theKey = s;
				theKey = theKey.substring(m_leftBase.length() + 1);
				System.out.println("xcopy   " + s + " %TARGET_DIR%\\" + theKey
						+ "* /s");
			}
		}

		System.out.println("rem ===========Done==============");
	}

	public void printResults() {
		Collections.sort(m_Diffs, new StrComp());
		Collections.sort(m_onlyRight, new StrComp());
		Collections.sort(m_onlyLeft, new StrComp());

		if (m_bDiffs) {
			System.out.println("===========DIFFS============");

			for (String s : m_Diffs) {
				System.out.println("   " + s);
			}
		}
		if (m_bonlyRight) {
			System.out.println("======Only Right");
			for (String s : m_onlyRight) {

				System.out.println("   " + s);

			}
		}
		if (m_bonlyLeft) {
			System.out.println("======Only Left");
			for (String s : m_onlyLeft) {
				System.out.println("   " + s);
			}
		}
		System.out.println("===========Done==============");

	}

	public void run() {
		try {

			HashMap<String, File> theLMap = new HashMap<String, File>();
			HashMap<String, File> theRMap = new HashMap<String, File>();

			String commonDirs[] = {	"cpp","java"};
			for (String s : commonDirs) {
				File theFile = new File(m_righBase + "\\" + s);
				collectFiles(theFile, theRMap, m_righBase);
			}
			for (String s : commonDirs) {
				File theFile = new File(m_leftBase + "\\" + s);
				collectFiles(theFile, theLMap, m_leftBase);
			}
			getDiff(theLMap, theRMap);
		} catch (Exception ie) {
			ie.printStackTrace();
		}
	}

	public boolean isSource(File theFile) {
		String thePath = theFile.getName().toLowerCase();

		String filters[] = { ".java", ".cpp", ".h", ".hpp", ".sql", ".bat",	".js", ".vbs", ".gradle", ".xml", ".html", ".css", ".conf", ".vcxproj", ".sln", ".filters"};
		
		for (String s : filters) {
			if (thePath.endsWith(s)) 
			{
				return true;
			}
		}
		return false;
	}

	public boolean isValidDir(File theFile) {

		String filters[] = { "bin", "lib", "obj"};
		String thePath = theFile.getPath().toLowerCase();
		for (String s : filters) {
			if (thePath.endsWith(s.toLowerCase())) {
				return false;
			}
		}
		return true;
	}

	public void collectFiles(File theDir, HashMap<String, File> theMap,
			String base) {
		File[] theFiles = theDir.listFiles();
		for (int i = 0; i < theFiles.length; i++) {
			if (theFiles[i].isDirectory() && isValidDir(theFiles[i])) {
				collectFiles(theFiles[i], theMap, base);
			} else {
				if (isSource(theFiles[i])) {
					String theKey = theFiles[i].getAbsolutePath();
					theKey = theKey.substring(base.length() + 1);

					theMap.put(theKey.toLowerCase(), theFiles[i]);
				}
			}
		}
	}

	public void getDiff(HashMap<String, File> theInputMap,
			HashMap<String, File> theTestMap, List<String> theValues,
			boolean bCheckDiff) throws IOException {
		for (Map.Entry<String, File> entry : theInputMap.entrySet()) {
			String rKey = entry.getKey();
			File rFile = entry.getValue();
			File lFile = theTestMap.get(rKey);
			if (lFile == null) {
				// only
				theValues.add(rFile.getAbsolutePath());
			} else {
				if (bCheckDiff) {
			
					long cSum1 = checksumLong(rFile);
					long cSum2 = checksumLong(lFile);
					if (cSum1 != cSum2) {
						m_Diffs.add(rFile.getAbsolutePath());
					}
				}
			}
		}
	}

	public void getDiff(HashMap<String, File> theLMap,
			HashMap<String, File> theRMap) throws IOException {
		getDiff(theRMap, theLMap, m_onlyRight, true);
		getDiff(theLMap, theRMap, m_onlyLeft, false);
	}

	public String checksum(File theFile) {
		try {
			HashCode theCode = Files.hash(theFile, Hashing.crc32());// .md5());
			return theCode.toString();
		} catch (Exception e) {
			return "";
		}
	}

	public long checksumLong(File theFile) {
		try {
			HashCode theCode = Files.hash(theFile, Hashing.crc32());
			return theCode.padToLong();
		} catch (Exception e) {
			return 0;
		}
	}

	public String checksumOldSchool(File theFile) {
		try {
			InputStream theIStream = new FileInputStream(theFile);
			java.security.MessageDigest md5er = MessageDigest
					.getInstance("MD5");
			byte[] buffer = new byte[1024];
			int read = 0;
			do {
				read = theIStream.read(buffer);
				if (read > 0) {
					md5er.update(buffer, 0, read);
				}
			} while (read != -1);
			theIStream.close();

			byte[] digest = md5er.digest();
			if (digest == null)
				return null;
			String strDigest = "0x";
			for (int i = 0; i < digest.length; i++) {
				strDigest += Integer.toString((digest[i] & 0xff) + 0x100, 16)
						.substring(1).toUpperCase();
			}
			return strDigest;
		} catch (Exception e) {
			return null;
		}
	}
}