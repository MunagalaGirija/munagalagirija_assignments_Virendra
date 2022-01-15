package shapearea;

public class area {
	int square;
	long rectangle;
	double circle;
	public void area1(){
		System.out.println("inside");

	}
	public void area1(int i) {
		System.out.println("square :" + i*i);
	}
	public void area1(int a, int b){
		System.out.println("rectangle :" + a*b);
	}
	public void area1(float x){
		System.out.println("circle :" + 3.14*(x*x));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	area s1=new area();
	area s2=new area();
	area s3=new area();
	s1.area1(4);
	s2.area1(5,6);
	s3.area1(7);
	}

}
