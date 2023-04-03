package inhertance;

public class Multiple_Eg
{
	public static void main(String[] args)
	{
		child1 obj = new child1();
		obj.run();
	}
}
class parent1
{
	void run()
	{
		System.out.println("parent1 run method");
	}
}
class parant2
{
	void run()
	{
		System.out.println("parent2 run method");
	}
}
class child1 extends parent1,parent2
{
}
}
