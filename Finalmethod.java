package superKeyword;


class Finalmethod1
{ // parent class
	final void display()
	{ //create a final method
		System.out.println("This is a final method.");
	}
}
class child1 extends Finalmethod1
{ // child class name Main
	// try to override final method
	/* public final void display() 
	 * { // parent class method
	 	* System.out.println("The final method is overridden.");
	   } */
}
public class Finalmethod 
{ // Main class
	public static void main(String[] args)
	{
		child1 obj = new child1();
		obj.display();
	}
}
