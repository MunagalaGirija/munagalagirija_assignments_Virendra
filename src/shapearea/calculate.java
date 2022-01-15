package shapearea;


public class calculate {
	public void sum(int b,int h)
    {
         System.out.println("sum of two numbers: "+(b+h));
    }
    
	public void area(float r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
	
	public void area(int l,int b)
	{
		System.out.println("area of rectangle "+ (l*b));
	}
	
	

    public static void main(String args[])
    {
      calculate ob=new calculate();
      ob.sum(18,12);
      ob.area(5); 
      ob.area(6,8);
    }
}
