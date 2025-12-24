package com.giriraj;
class D  implements Runnable
{
	int c=0;
	public void run()
	{
		for(int i=1;i<=50000;i++)
		{
			c++;
		}
	}
}

public class Demo14 {
	public static void main(String ar[]) throws InterruptedException {
		D d1 = new D();
		D d2 = new D();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("c1 ="+d1.c  );
		System.out.println("c2 ="+d2.c  );
		
		

		

	}
}
