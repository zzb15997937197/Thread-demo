package com.hand.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * author:bingbing 日期:2020年3月13日 时间:下午7:28:44 使用线程池创建线程,使用固定大小的线程池
 * FixThreadPool,在并发包concurrent下
 */

public class Demo04_01 {

	public static void main(String[] args) {

		ExecutorService ex = Executors.newFixedThreadPool(5);
		ExecutorService ex1=Executors.newFixedThreadPool(5);

		System.out.println("使用callable加入线程");
		for (int i = 0; i < 5; i++) {
			ex.submit(new Callable<String>() {
				public String call() throws Exception {
					// TODO Auto-generated method stub
					
					for(int j=0;j<10;j++) {
						System.out.println(Thread.currentThread().getName()+"-"+j);
					}

					return "加入callable任务";
				}
			});
		}
		ex.shutdown();
		System.out.println("--------------------------");
		System.out.println("使用Runnable加入线程");
		for(int i=0;i<5;i++) {
			ex1.submit(new Runnable() {
               
				public void run() {
					for(int j=0;j<10;j++) {
						System.out.println(Thread.currentThread().getName()+"-"+j);
					}
				}
				
			});
		}
		ex1.shutdown();
		

	}

}
