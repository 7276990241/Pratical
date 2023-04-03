package inhertance;

public class SingleInheritance {
	public static void main(String[] args)
	{
		SIChild child = new SIChild();
		child.display();
		child.show();
	}

}
class SIParent
{
	void show()
	{
		System.out.println("Show the details of parent class");
	}
}
class SIChild extends SIParent
{
	void display()
	{
		System.out.println("Display the result of child class");
	}
}