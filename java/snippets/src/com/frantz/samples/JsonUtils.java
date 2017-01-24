package com.frantz.samples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonUtils {

	public static String readJson(String sInput) {
		StringBuilder builder = new StringBuilder();
		try {
			URL url = new URL(sInput);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			//add request header
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			//URLConnection connection = url.openConnection();
			//connection.setRequestProperty("Accept", "application/json");
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String decodedString;
			while ((decodedString = in.readLine()) != null) {
				builder.append(decodedString);
				builder.append("\n");
			}
			
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return builder.toString();

	}

	public static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read); 

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }

    }

}
