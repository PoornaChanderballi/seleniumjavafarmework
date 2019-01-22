package oops;

public class Parametres extends Statcclass{
// callling parametres using inheritance method
	public static void main(String[] args) {
		
      Parametres obj = new Parametres();
		
		int sum=obj.add(10, 85);
		System.out.println("returned valus from addition method  is :"+sum);
		
		double minus = obj.sub(1458.63, 1358.53);
		System.out.println("returned value from sub method is :"+minus);
		
	String fullname =Statcclass.completename("hello", "world");
	System.out.println("complete static method is :"+fullname);
	
	
	}

	
}

//methods created in Statcclass and two return type methods and one static method