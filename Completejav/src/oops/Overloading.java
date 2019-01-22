package oops;

public class Overloading {

	public static void main(String[] args) {
	//same method name with different signatures and this is method overloading

		Overloading m1= new Overloading();
	m1.add(10.3, 20.3);
	m1.add(10.5, 5);
	m1.add(6, 10.5);
	m1.add(10, 20);
	m1.add(10, 20, 30);
	
	}
public void add (int a, int b){
		int c=a+b;
		System.out.println("one type of overloding method:"+c);
		
	}
public void add (int a, int b, int d){
		
		int c=a+b+d;
		System.out.println(" no of arguments is diff  with same method name :"+c);
		
	}
public void add (double a, int b){
	
	double x=a+b;
	System.out.println("type and order of argument is diff:"+x);
	
}
public void add (int a, double b){
	
	double x=a+b;
	System.out.println("type and order of argument is diff:"+x);
}

public void add (double a, double b){
	
	double x=a+b;
	System.out.println("type of argument is diff:"+x);
}
}