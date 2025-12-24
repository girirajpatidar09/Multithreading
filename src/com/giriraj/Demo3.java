package com.giriraj;

class MyThread2 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo3 {
	public static void main(String ar[]) {

		MyThread2 t1 = new MyThread2();
		t1.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main Thread :" + i);
		}

	}
}
