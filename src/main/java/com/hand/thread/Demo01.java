package com.hand.thread;
/**
 *author:bingbing
 *日期:2020年3月13日
 *时间:下午5:51:46
 *建立线程,使用继承Thread类实现线程
 */

public class Demo01  extends Thread{
	
	public Demo01() {
		
		
	}
	
	public void run() {
		
		//线程执行的方法
		System.out.println("使用extends创建线程,当前线程为:"+Thread.currentThread().getName());
		
	}
	
	
	
	public static void main(String[]args) {
		
		System.out.println("当前线程名为:"+Thread.currentThread().getName());
		
		Demo01 demo=new Demo01();
		demo.start();
		
//		Thread thread=new Thread(Demo01);
//		thread.start();
		
	}
	
	
	

}
