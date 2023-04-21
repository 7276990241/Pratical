package string;

public class ImmutableTest
{
	public static void main(String[] args)
	{
		String str = "Priyanka";
		str.concat("Kate"); // insert the string at the end
		str=str.concat("Kate");// it will print PriyankaKate
		// it will print priyanka only because string is immutable
		System.out.println(str);
	}

}
