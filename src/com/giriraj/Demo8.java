package com.giriraj;

class MyThread7 implements Runnable
{

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo8 {
	public static void main(String ar[]) {

		MyThread7   mt1 = new MyThread7 ();
		MyThread7   mt2 = new MyThread7 ();
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
		
	
		
		
		

	}
}
