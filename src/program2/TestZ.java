package program2;

import program1.TestM;
import program1.TestN;
import program1.TestP;

public class TestZ extends TestM {
	public static void main(String[]args){
		TestM objM = new TestM();
		TestN objN = new TestN();
		TestP objP = new TestP();
		TestX objX = new TestX();
		
		
	    System.out.println("long varaible of class t: " + objX.t);

		System.out.println("long varaible of class f: " + objX.f);

		System.out.println("long varaible of class s: " + objX.s);
	}

}