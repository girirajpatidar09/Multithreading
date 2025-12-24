package com.giriraj;

class MyThread6 implements Runnable
{

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo7 {
	public static void main(String ar[]) {

		MyThread6  mt = new MyThread6();
		Thread t1 = new Thread(mt);
		t1.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread :" + i);
		}
	
		
		
		

	}
}
