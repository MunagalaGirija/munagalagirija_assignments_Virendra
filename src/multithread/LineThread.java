package multithread;
import java.io.*;

class LineThread
{

	synchronized public void getLine()                     
	{
		
		for(int i=1;i<=3;i++)
		{
			try{
	    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
		System.out.println("running thread state is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getState());  // it will print state of the thread running
	    System.out.println("Thread Name : "+ Thread.currentThread().getName()+ " ::: "+ i);  
	    System.out.println("Is my thread alive or not? : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
	    System.out.println("The thread id is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		}  
	
		}

	public void getLineThread() {
		// TODO Auto-generated method stub
		
	}
	}

class Sync extends Thread
{
	// reference to Line's Object.
	LineThread line;

	Sync(LineThread line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLineThread();
	}
}

 class SyncThread  {

		
	public static void main(String[] args) {
		
		LineThread obj = new LineThread();

		// creating the threads that are sharing the same Object.
		Sync train1 = new Sync(obj);
		Sync train2 = new Sync(obj);
		Sync train3= new Sync(obj);
		
		train1.setName("IT");
		train2.setName("HR");
		train3.setName("Finance");
		
		train1.start();
		train2.start();
		train3.start();
		
		

	}

}