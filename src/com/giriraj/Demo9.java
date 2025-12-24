package com.giriraj;

class MyThread8 implements Runnable
{

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo9 {
	public static void main(String ar[]) {

		MyThread8   mt1 = new MyThread8 ();
		
		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt1);
		t1.start();
		t2.start();
		
	
		
		
		

	}
}
