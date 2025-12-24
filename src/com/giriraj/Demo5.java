package com.giriraj;

class MyThread5 extends Thread {

	public void start()
	{
		super.start();
		System.out.println("Start Method");
	}
	
}

public class Demo5 {
	public static void main(String ar[]) {

		MyThread5  t1 = new MyThread5();
		t1.start();
		t1.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread :" + i);
		}
		
		
		
		

	}
}
