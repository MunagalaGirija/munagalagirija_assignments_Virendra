package program1;

import program1.TestP;

public class TestP {
	
	protected void privateMethod(){   
		System.out.println("in private method class testM");	
	}
	
	void defaultMethod(){    
		System.out.println("in default method class testM");	
	}
	
	protected void protectMethod(){     
		System.out.println("in protect method class testM");
    }
	private void publicMethod(){     
		System.out.println("in public method class testM");
    }
	
      public static void main(String args[]) {
		TestM objm = new TestM();
		TestN objn = new TestN();
		System.out.println("long variable of class testM: " + objm.q);
		System.out.println("long variable of class testM: " + objn.r);

	}
}