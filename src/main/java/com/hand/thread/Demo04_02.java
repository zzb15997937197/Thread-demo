package com.hand.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *author:bingbing
 *日期:2020年3月13日
 *时间:下午7:29:40
 * 使用线程池来单线程池 SingleThreadPoolExecutor ,可以通过此线程池，保证加入的线程按照顺序执行
 */

public class Demo04_02 {
	
	
	public static void main(String[]args) {
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		for(int i=0;i<5;i++) {
			ex.submit(new Runnable() {
				public void run() {
					for(int j=0;j<10;j++) {
						System.out.println(Thread.currentThread().getName()+"-"+j);
					}
				}
				
			});
		}
		ex.shutdown();
	}

}
