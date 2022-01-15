package program2;

import program1.TestM;
import program1.TestN;

public class TestY extends TestN {
	public static void main(String[]args){
		TestM objM = new TestM();
		TestN objN = new TestN();
		
		TestX objX =new TestX();
		System.out.println("long varaible of class t: " + objX.t);

		System.out.println("long varaible of class f: " + objX.f);

		System.out.println("long varaible of class s: " + objX.s);
	}

}