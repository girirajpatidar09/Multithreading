package com.giriraj;

class MyThread3 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo4 {
	public static void main(String ar[]) {

		MyThread3 t1 = new MyThread3();
		t1.start();
		
		MyThread3 t2 = new MyThread3 ();
		t2.start();
		
		

	}
}
