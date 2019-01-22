package oops;

public class Childoverridding extends Parentoverridden{

	public static void main(String[] args) {
		// method over ridding
	System.out.println("checking whether any changes happened afetr commiting to github");
		Parentoverridden obj = new Childoverridding();
         obj.mymethod();
Parentoverridden obj1 =  new Parentoverridden ();
	obj1.mymethod();
	
	}

	public void mymethod (){
		System.out.println("iam from child class inherited from parent");
	}
}
