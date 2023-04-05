package assignments;
// in my subclass not use overriding
public class Test {//parent class
	void show()
	{// user defined parent class method
		System.out.println("Show result");
	}
}
class without_Overriding extends Test
{
	public static void main(String[] args)
	{
		without_Overriding obj = new without_Overriding();
		obj.show();
	}
}
