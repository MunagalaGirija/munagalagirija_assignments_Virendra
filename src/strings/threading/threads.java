
package threading;
public class threads extends Thread{  
		
		 public void run(){  
		   
		    System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState()); 	
		    System.out.println("running thread name is:"+Thread.currentThread().getName());
		    System.out.println("Is my thread alive or not?:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());
		    
		    System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); 
		    
		  }  
		  


public static void main(String args[]){ 
threads m1=new threads();  
threads m2=new threads();
threads m3=new threads();

m1.setName("IT");
m2.setName("FINANCE");
m3.setName("HR");

m1.start();  
m2.start();  
m3.start();

}
}