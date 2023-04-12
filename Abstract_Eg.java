package abstraction;

abstract class Bank
{
	abstract int rateOfInterest();
}
class RBI extends Bank
{
	 int rateOfInterest()
	{
		return 7;
	}
}
class PNB extends Bank
{
	 int rateOfInterest()
	 {
			return 8;
	 }
}
class BOB extends Bank
{
	 int rateOfInterest()
	 {
		 return 9;
	 }
}
public class Abstract_Eg
{
	public static void main(String[] args)
	{
		Bank bank;
		bank=new PNB();
		System.out.println(bank.rateOfInterest());
	}
}
