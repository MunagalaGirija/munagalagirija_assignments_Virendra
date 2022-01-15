package program1;

public class TestM {

	private int p =10;
	long q =26533L;
	protected float r=326.54f;
	
	public void protectedMethod(){   
		System.out.println("in protected method class testM");	
	}
	
	void defaultMethod(){    
		System.out.println("in default method class testM");	
	}
	
	private void protectMethod(){     
		System.out.println("in protect method class testM");
    }
	private void publicMethod(){     
		System.out.println("in public method class testM");
    }
	
}