package com.giriraj;

class B  implements Runnable {
	B() 
	{
		Runnable r1 =() ->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child Thread : "+i);
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

	

	
}

public class Demo11 {
	public static void main(String ar[]) {
		B b1 = new B();

	}
}
