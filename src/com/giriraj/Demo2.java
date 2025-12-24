package com.giriraj;

class MyThread1 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo2 {
	public static void main(String ar[]) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread :" + i);
		}
		MyThread1 t1 = new MyThread1();
		t1.start();

	}
}
