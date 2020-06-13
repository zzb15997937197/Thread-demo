package com.hand.thread;
/**
 *author:bingbing
 *日期:2020年3月13日
 *时间:下午5:57:56
 *实现Runnable接口来创建线程，推荐使用此接口来创建线程
 */

public class Demo02 implements Runnable{
	

	public void run() {
		System.out.println("使用实现Runnable接口的方式创建线程,当前线程名为:"+Thread.currentThread().getName());
		
		
	}
	
public static void main(String[]args) {
		
		System.out.println("当前线程名为:"+Thread.currentThread().getName());
		
		Demo02 demo=new Demo02();
		demo.run();
		//第二种启动方式为Thread来启动,需要传一个实现Runnable接口的对象实例
		Thread thread=new Thread(new Demo02());
		thread.start();
		
	}
	

}
