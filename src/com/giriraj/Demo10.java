package com.giriraj;

class A implements Runnable {
	A() {
		Thread t1 = new Thread(this);
		Thread t2 = new Thread(this);
		t1.start();
		t2.start();
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class Demo10 {
	public static void main(String ar[]) {
		A a1 = new A();

	}
}
