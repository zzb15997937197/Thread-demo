package com.hand.thread;
/**
 *author:bingbing
 *日期:2020年3月14日
 *时间:下午3:31:13
 *
 *线程方法之 join方法
 */


public class Demo05 implements Runnable{

	public void run() {
		for(int i=0;i<10;i++) {
			
			System.out.println("子线程:"+Thread.currentThread().getName()+i);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Demo05 demo05=new Demo05();
		Thread thread=new Thread(demo05);
		thread.start();
		thread.join();
		 for (int i = 0; i <= 10; i++) {
	        	System.out.println("主线程:" + i);
	 	}

		
	}

}
