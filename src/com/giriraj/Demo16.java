package com.giriraj;
class E  implements Runnable
{
 static 	int c=0;
	public synchronized  void run()
	{
		for(int i=1;i<=50000;i++)
		{
			c++;
		}
	}
}

public class Demo16 {
	public static void main(String ar[])  throws InterruptedException{
		E e1 = new E();
		E e2 = new E();
		
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("e1 ="+e1.c  );
		
		
		

		

	}
}
