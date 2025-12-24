package com.giriraj;

class MyThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo1 {
	public static void main(String ar[]) {
		MyThread t1 = new MyThread();
		t1.start();

	}
}
