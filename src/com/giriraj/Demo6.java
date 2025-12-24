package com.giriraj;

class MyThread4 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child Thread :" + i);
		}
	}
}

public class Demo6 {
	public static void main(String ar[]) {

		MyThread4  t1 = new MyThread4();
		t1.start();
		t1.start();
		
		
		

	}
}
