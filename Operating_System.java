package inhertance;
//Hierarchical Inheritance
public class Operating_System 
{// parent class A
	void Boost()
	{
		System.out.println("Boosting mode on");
	}
}

class windows extends Operating_System
{// child class 1
	void run()
	{
		System.out.println("run mode on");
	}
}
class Linux extends Operating_System
{// child class 2
	void storage_capasity()
	{
		System.out.println("storage capacity is very highs");
	}
}
public class Hierarchicalin
{
	public static void main(String[] args)
	{
		Linux b = new Linux();
		b.Boost();
		b.storage_capasity();
		windows c = new windows();
		c.run();
		c.Boost();
	}
}