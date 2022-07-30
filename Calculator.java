package week2;

public class Calculator {
	public void add(int a, int b) {
		int c= a+b;
		System.out.
		println(c);
	}
	public void sub(int e, int f) {
		int g= e-f;
		System.out.println(g);
		
	}
	public void multi(double i, double j)  {
		double  b= i*j;
		System.out.println(b);
		
	}
	public void divide(float d, double e) {
		double x=d/e;
		System.out.println(x);
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(2, 4);
	    cal.divide(0.2f, 0.1);
		cal.multi(10,10);
		cal.sub(0, 0);
	}
	
	}
	
	
	

	
	


