package program1;

import program1.TestN;

public class TestN {

	public int p =80;
	protected long q=533222L;
	double r=326.54;
	
	protected void privateMethod(){   
		System.out.println("in private method class testM");	
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