package com.frantz.samples2.jobs;

import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

public class JobTest {
	class MyRunner implements Callable<Integer>
	{
		private String m_Name;
		int m_Idx=0;
		int m_Delay=0;
		@Override
		public Integer call() throws Exception {
			if(m_Idx%2==0) return 0;
			// TODO Auto-generated method stub
			try {
				Thread.sleep(m_Delay);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Running: " + m_Name + " Delay:" + m_Delay);
			return 1;
		}
		public MyRunner(String s, int idx, int delay)
		{
			m_Name=s;
			m_Idx=idx;
			m_Delay=delay;
		}
				
	}
	public void test() 
	{
		try 
		{
			int nThreads=5;
			ExecutorService service = Executors.newFixedThreadPool(nThreads);
			Random rnd = new Random();
			
			final BlockingQueue<Callable<Integer>> queue = new LinkedBlockingQueue<Callable<Integer>>();
			for(int i=0;i<100;++i)
			{
				Callable<Integer> r = new MyRunner("Test" + i, i, rnd.nextInt(200)+100);
				queue.put(r);
				//service.submit(r);
			}
			List<Future<Integer>> futures = service.invokeAll(queue);
			
			int flag = 0;

	        for (Future<Integer> f : futures) {
	            Integer res = f.get();
	            System.out.println("Sum: " + res);
	            if (!f.isDone()) 
	                flag = 1;
	        }

	        if (flag == 0)
	            System.out.println("SUCCESS");
	        else
	            System.out.println("FAILED");
			/*
			int numWorkers = nThreads;
			for (int i = 0; i < numWorkers; i++) 
			{
				service.submit(new Runnable() 
				{
					@Override
					public void run() {
						while (!Thread.currentThread().isInterrupted()) {
							try {
								Runnable item = queue.take();
								item.run();
								// Process item
							} catch (InterruptedException ex) {
								Thread.currentThread().interrupt();
								break;
							}
						}
					}
				});
			}*/
			//service.shutdown();
			//service.awaitTermination(1, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static void main(String[] args) 
	{
		JobTest t = new JobTest();
		t.test();
		System.out.println("Done");
	}
}
