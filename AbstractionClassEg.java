package abstraction;

abstract class Parentabs
{
	Parentabs ()
	{ // cons
		System.out.println("No-args Cons");
	}
	abstract void show();// abstract method
	void run()
	{ // non abstract
		System.out.println("No abstract method");
	}
}
class Childabs extends Parentabs
{
	@Override
	void show()
	{
		System.out.println("Parent class abstract method");
	}
}
public class AbstractionClassEg 
{
	public static void main(String[] args)
	{
		Parentabs object = new Childabs();
		object.show();
		object.run();
	}

}
