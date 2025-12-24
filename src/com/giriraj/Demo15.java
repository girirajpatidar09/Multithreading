package com.giriraj;
class C  implements Runnable
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

public class Demo15 {
	public static void main(String ar[]) {
		C c1 = new C();
		C c2 = new C();
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.start();
		t2.start();
		
		System.out.println("c1 ="+c1.c  );
		System.out.println("c2 ="+c2.c  );
		
		

		

	}
}
