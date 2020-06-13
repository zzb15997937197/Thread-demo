package com.hand.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 *author:bingbing
 *日期:2020年3月13日
 *时间:下午7:19:30
 *  通过使用callable接口实现多线程  JDK1.5之后 FutureTask
 */

public class Demo03  implements Callable<String>{
	
	
	
	public  static void main(String[]args) {
		
		Callable<String> callable=new Demo03();
		FutureTask<String> futuretask=new FutureTask<String>(callable);
		Thread thread1=new Thread(futuretask);
		thread1.start();
	    
	}

	public String call() throws Exception {
		//线程要执行的方法
		String str="当前线程使用callable接口,当前线程名为:"+Thread.currentThread().getName();
		System.out.println(str);
		return str;
	}
	
	

}
