package oops;

public class Childoverridding extends Parentoverridden{

	public static void main(String[] args) {
		// method over ridding
		Parentoverridden obj = new Childoverridding();
         obj.mymethod();
Parentoverridden obj1 =  new Parentoverridden ();
	obj1.mymethod();
	}

	public void mymethod (){
		System.out.println("iam from child class inherited from parent");
	}
}
