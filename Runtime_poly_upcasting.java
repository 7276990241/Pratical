package polymorphism;
//if the reference variable of parent class refers
//to the bject of child class

class A
{
	void run()
	{
		System.out.println("Parent class method");
	}
}
class B extends A
{
	void run()
	{
		System.out.println("Child class implementation");

	}
}
public class Runtime_poly_upcasting 
{
	public static void main(String[] args)
	{
		A obj=new B(); // upcasting
		obj.run();
	}

}
