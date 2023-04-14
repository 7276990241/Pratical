package abstraction;

public class VaragrsEg
{
	static void show(String...text)
	{// using varagrsEg
		System.out.println("show method invoked");
		for(String s:text)
		{// for each loop
			System.out.println(s);
		}
	}
	public static void main(String...args)
	{
		show();// zero arguments
		show("hi");// one arguments
		show("I","Love","Coding");// three  arguments
		show("a","v","d","e","h");// five arguments
	}
}
