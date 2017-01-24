package com.frantz.samples2.excl;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class TestLock {
	FileLock lock;
	FileChannel channel;
	File m_file;

	public boolean isAppActive() throws Exception {
		m_file = new File(System.getProperty("user.home"),"track_file_lock.lock");
		channel = new RandomAccessFile(m_file, "rw").getChannel();

		lock = channel.tryLock();
		if (lock == null) 
		{
			return true;
		}
		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				try {
					lock.release();
					channel.close();
					if (m_file!=null && m_file.exists())
					{
						m_file.delete();
					}
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		return false;
	}

	

	public static void main(String[] args) throws Exception {
		TestLock u = new TestLock();
		System.out.println(getCurrentPID());

		if (u.isAppActive()) {
			System.out.println("Already active, stop!");
			System.exit(1);
		} else {
			System.out.println("NOT active... Do hard work for 5 seconds.");
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
		System.out.println("Done...");
	}
	public static String getCurrentPID() {
		// This function is designed to get the PID from the windows system, it
		// may
		// not work for Linux or Mac. You'll have to acquire a suitable
		// getCurrentPID function
		try {
			java.lang.management.RuntimeMXBean runtime = java.lang.management.ManagementFactory
					.getRuntimeMXBean();
			java.lang.reflect.Field jvm = runtime.getClass().getDeclaredField(
					"jvm");
			jvm.setAccessible(true);
			sun.management.VMManagement mgmt = (sun.management.VMManagement) jvm
					.get(runtime);
			java.lang.reflect.Method pid_method = mgmt.getClass()
					.getDeclaredMethod("getProcessId");
			pid_method.setAccessible(true);
			return pid_method.invoke(mgmt) + "";
		} catch (Exception e) {
			throw new RuntimeException("Cannot get the current PID");
		}
	}}