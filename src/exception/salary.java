
package exception;


public class salary {

	static void validate(int Salary)throws InvalidSalaryException{  
	     if(Salary <=2100)  
	      throw new InvalidSalaryException("you need to work hard");  
	     else if(2100 < Salary && Salary<5000)
	      throw new InvalidSalaryException("your salary is somehow good");  
	     else if (5100< Salary && Salary<9000)
	      throw new InvalidSalaryException("salary is very good"); 
	   }  


 public static void main(String args[]){  
    try{  
      validate(8000);  
    }
    catch(Exception m)
    {
  	  System.out.println(""+ m.getMessage());
    }  

     
}  
}  

class InvalidSalaryException extends Exception{  
	
	//private static final long serialVersionUID = 1L;
	InvalidSalaryException(String s){  
	  super(s);  
	 }  
}