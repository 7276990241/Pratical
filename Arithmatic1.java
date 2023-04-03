package inhertance;

class Arithmatic1 
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
class Adder extends Arithmatic1
{ // this class inherits the add method from Arithmatic
	
}
public class Arithmatic
{
	public static void main(String[] args)
	{
		Adder adder = new Adder();
		int sum = adder.add(21, 50);
		System.out.println("the sum is:"+sum);
	}
}
