## Multitasking :
The concept of multitasking is basically taken from the human behaviour . For example , sometime we do chatting on whatsapp and we talk on phone also simultaneously . So the same concept is use in computer for example we use VLC media player and downloading the song from browser.
                                    So performing more than one task at same time is known is as multitasking.

## Types of multitasking
1 Process bases multi-tasking [Multi-processing] :
It means the ability to execute multiple program(process) at the same time. For e.g. we are using VLC media player to play music and creating a java program in some IDE simultaneously.

2 Thread based multi-tasking [Multithreading] :
It is the ability to execute several parts of the same program at the same time or we can say that to execute multiple threads  sharing the same memory address.

## Advantage of Multitasking :
Whether it is process -based  or thread based, the main objective of multitasking is to reduce the response time of system and to improve performance .
## Main important application areas of multithreading are :
1 To develop multimedia graphics.
2 To develop animations.
3 To develop video games.
##  What is thread ?
A thread is smallest unit of execution within a process. It is like a lightweight sub -process that runs independently but share  the same memory of parent process.
Real life analogy of multithreading is Video game player .

## Types of Thread 
1 User Thread :
User thread are threads which are created by user.
2 Daemon Thread :
Daemon threads , which are mostly created by JVM, mostly run in background.

## Simultaneously  meaning :
Generally we think that multiple process are executing simultaneously but actually they execute one by one . Because the speed of CPU is very fast so that it appears as they are executed simultaneously. To execute a process so many process scheduling algorithms we use such as –
-First come First serve.
- Shortest job next.
-Priority scheduling.
-Shortest – remaining time.
-Round Robin scheduling.
-Multiple -level queues scheduling.

## Process Scheduling :
The act of determining which process is in the ready state, and should be moved the to running state is knows as process scheduling . The prime aim of process scheduling system is to keep CPU busy all time and to deliver minimum response time for all programs.

## Process VS Thread
Process
1 A process is an independent program in execution .
2 Each process has its own separate memory.
3 Process is heavy weight.
4 Cost of communication between process is high because switching from one process to another required some time for saving and loading registers.
5 Changes to parent process do not effect child process.

Thread :
1 A thread is a light weight sub-process.
2 Thread share the memory space within a process but each has its own stack.
3 Thread is light-weight.
4 Cost of communication between thread is low.
5 Since all thread of same process share address space and other resources ,so any changes to main thread may affect the behaviour of other threads of process.

## From how many ways we create thread :
-Two ways :
1 By extending Thread classes.
2 By implementing the Runnable interface.

In java , to creating thread implementing runnable interface is better then extending class. Because if we create thread by extending Thread class , there is not chance of extending another class.
But  while implementing Runnable interface we can extend another class.

## Thread scheduler -
It is a part of JVM , it is responsible to schedule thread  i.e.  if multiple threads are waiting to get a chance of execution then in which order threads will be executed is decided by scheduler.
We can’t expect exact order followed by  thread scheduler , it is varied form jvm to jvm, hence we cant’t expect thread execution order and exact output.

## Importance of start() method of Thread class :
Thread class start() method is responsible to register thread with thread scheduler.
## Overloading of run() method :
Overloading of run() method is always  possible , but thread class start() method can invoke no argument run() method the other overloaded method we have to call explicitly like a normal method call.
## If we not overriding run() method :
If we not overriding run() method then thread class run() method will be executed which has empty implementation. Hence we won’t get any output.
## Overriding of start() method :
If we override start() method then our start() method will be executed just like a normal method call and new thread won’t be created.
## After starting a Thread if we are tyring to restart the same thread then we will get RuntimeException saying :
IllegalThreadStateException.
Thread t  =new Thread();
t.start();
t.start();  - IllegalThreadStateException.

                                                                                  --------------

## start() method
public start void ()
When we call a start() method , a new thread is created and the run() method is executed.

## sleep() method 
public static native void sleep(long millisec) throws InterruptedException 
public static native void sleep(long millisec , int nanosec) throws InterruptedException 
If a thread don’t want to perform any operation for particular amount of time then we should go for sleep() method.

## join() method :
public final void join() throws InterruptedException
public final void join(long millisec ) throws InterruptedException
public final void join(long miilisec, int nanos) throws InterruptedException
If a thread want to wait until completing some other thread , then we should go for join() 
method.
                  If a thread t1 wants to wait until completing t2 then t1 has to call t2.join().

If t1 executes  t2.join()  then immediately t1 will be entered into the waiting state until t1 completes.
Once t2 completes then t1 can continue its execution.

## yield() method 
yield () method causes to pause the current executing thread to give the chance for waiting thread to give the chance for waiting threads of same priority.
It there is no waiting thread or all waiting thread have the low priority then same thread can continue its execution .
If multiple threads are waiting with same priority then which thread will get chance we can’t except it depends on thread scheduler.
The thread which is yielded , when it will get chance once again it depends on thread scheduler and we can’t expect exactly.

## Thread priorities :
Every thread  in java  has some priority it may be default priority generated  by JVM or  customized priority provided by programmers.
 The  valid range of thread priority is 1 to 10  where is min priority and 10 is max prioity.

## public static Thread currentThread();
## What happens when we print currentThread object ?
Thread[Name of Thread, Priority of thread, Group of thread]

Thread  methods
## public final int getPriority()
## public final void setPriority(int p) -allowed values from 1 to 10.
## What happens when we use priorities below from 1 and greater than 10-
 RuntimeException occurs saying  IIlegalArguementExcetpion .

## public final String getName()

## public final void setName(String name)

## Default priority only for the main thread is five but for all remaining threads default priority will be inherited from parent to child i.e. whatever priority parent thread has the same priority
will be  there for child thread.
Note : Some platform won’t provide proper support for thread priority.

##  public boolean isAlive()

## What is shared resource ?
What is a Shared Resource?
A shared resource is any data or object that is accessed by more than one thread at the same time.
Because multiple threads use it together, it can cause data inconsistency if not handled properly.

## What is critical section ?
A critical section is a part of the code where a shared resource is accessed or modified.
👉 Only one thread at a time should execute the critical section to avoid data inconsistency.

## What Is Data Inconsistency?
Data inconsistency occurs when multiple threads access and modify the same shared data at the same time, causing the data to become incorrect or unpredictable.
## What is race condition 
A race condition occurs when two or more threads access shared data at the same time, and the final result depends on the order of execution of those threads.
👉 Different execution orders → different results (often wrong).


## What is race condition ?
Synchronization is the tool , use to control  to a shared resources by multiple threads. Its main purpose is to prevent  a problem called a “race- condition ”. where several threads try to change the same data at same time, leading to corrupted and unpredicatable results.
## Method synchronization :
By declaring the  method synchronized the entire method is treated as critical section , ensuring that only one thread can execute that method at any given time. This approach locks the entire method preventing other thread from accessing it until the first thread finehses its execution.

## Block synchronization :
If we only need to execute some subsequent lines of code not all lines of code within a method , then we should  go  for synchronized block .

## Can a constructor be synchronized ?
No.
## Why class level lock is useful ?
Useful when the shared resource  is static  or common to all instances.
Avoid race condition across multiple objects.

## What is class level lock ?
A class-level lock is a lock that is applied on the Class object itself and is shared by all objects of that class.
In Java, class-level locking is achieved using:
•	static synchronized methods
•	synchronized(ClassName.class)

## How Class-Level Lock Works
•	Every class in Java has one Class object
•	When a thread acquires a class-level lock:
o	No other thread can enter any static synchronized method of that class
•	Lock is common for all objects of that class


## What is object level lock ?
An object-level lock is a lock that is applied on a specific object instance and allows only one thread at a time to access synchronized code for that object.

## Static method can be synchronized ?
yes

## What is deadlock ?
A deadlock is a situation where two or more threads are stuck forever , waiting for each other’s resources and none of them can proceed.
## Deadlock VS Starvation 
	Long waiting of a thread where thread never ends is called deadlock.
	Long waiting of a thread where waiting ends at certain points is called starvation.
Eg Low priority thread has to wait until completing all high priority thread . It may be long waiting but ends at certain points which is not but starvation .


## Deadlock throw  synchronized blocks :
class  A {}
class B {}

class C extends Thread
{
	A a1 ;
	B b1;
	C(A a1 , B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("Class C run method");
		synchronized(a1)
		{
			System.out.println("Class C block -1");
			synchronized(b1)
			{
				System.out.println("Classs C block -2");
			}
		}
		
	}
}
class D extends Thread
{
	A a1 ;
	B b1;
	D(A a1 , B b1)
	{
		this.a1=a1;
		this.b1=b1;
	}
	public void run()
	{
		System.out.println("Class D run method");
		synchronized(b1)
		{
			System.out.println("Class D block -1");
			synchronized(a1)
			{
				System.out.println("Classs D block -2");
			}
		}
		
	}
}
class demo133
{
	public static void main(String ar[])
	{
		A a1 = new A();
		B b1 = new B();
		
		C c1 = new C(a1,b1);
		D d1 = new D(a1,b1);
		c1.start();
		d1.start();
	}
}

