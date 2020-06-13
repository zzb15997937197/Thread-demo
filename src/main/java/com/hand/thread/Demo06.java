package com.hand.thread;

import javax.crypto.spec.GCMParameterSpec;

/**
 * author:bingbing 日期:2020年3月17日 时间:上午8:28:10 模拟多线程下Volatile的可见性。
 */

public class Demo06 {
	
	private static  volatile Boolean initFlag=false;

	public static void main(String[] args) throws InterruptedException {
		
		
		new Thread() {
			@Override
			public void run() {
				System.out.println("waiting data....");
				while(!initFlag) {
					
				}
				System.out.println("success.....");	
				
			}
		}.start();

		Thread.sleep(2000);
		
		//新建另外一个线程，对共享变量进行修改
		
		new Thread() {
			public void run() {
				prepareData();
				
			}
			
		}.start();	

	}
	
	private static void prepareData() {
		System.out.println("操作共享变量..");
		initFlag=true;
		System.out.println("修改成功!");
	};

}
