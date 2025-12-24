package com.giriraj;

public class Demo12 {
	public static void main(String ar[]) {

		Runnable r = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		Thread t1 = new Thread(r);
		t1.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("Main thread :" + i);
		}

	}
}
