package com.giriraj;

class F implements Runnable {
	static int c = 0;

	public synchronized void run() {
		for (int i = 1; i <= 50000; i++) {
			c++;
		}
	}
}

public class Demo17 {
	public static void main(String ar[]) throws InterruptedException {
		F f1 = new F();

		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(f1);

		t1.start();
		t2.start();
		

		t1.join();
		t2.join();

		System.out.println("f1 =" + f1.c);

	}
}