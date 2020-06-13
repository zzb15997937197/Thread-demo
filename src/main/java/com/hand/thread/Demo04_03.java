package com.hand.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *author:bingbing
 *日期:2020年3月13日
 *时间:下午8:32:39
 *CashedThreadPool(); 缓存线程池,当提交任务速度高于线程池中任务处理速度时，缓存线程池会不断的创建线程
 适用于提交短期的异步小程序，以及负载较轻的服务器

 */

public class Demo04_03 {
	
	public static void main(String[] args) {
		ExecutorService ex2=Executors.newCachedThreadPool();
		
		for(int i=0;i<5;i++) {
			ex2.submit(new Runnable() {
				
				public void run() {
					for(int j=0;j<10;j++) {
						System.out.println(Thread.currentThread().getName()+"-"+j);
					}
					
				}
			});
		}
		ex2.shutdown();
	}	
}
