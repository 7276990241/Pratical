package polymorphism;

/* Runtime Polymorphism-- Dynamic method Dispatch
 Overload a static method in java - compile time poly
overridden method called by the reference variable of papa lass
overridden method is resolve at runtime rather than  complie time */
public class RunTimePoly 
{ // main class
	public static void main(String[] args)
	{
		Java_student js;// reference variable of parent class (upcasting)
		js=new Pooja();
		System.out.println("quality of Pooja is :"+js.quality());
		js=new Suhel();
		System.out.println("quality of Suhel is :"+js.quality());
	}
}
class Java_student
{// parent class
	String quality()
	{ // parent method
		return null;
	}
}
class Tusher extends Java_student
{ // child class 1
	String quality()
	{ // overridden method
		return "Active";
	}
}
class Pooja extends Java_student
{ // // child class 2
	String quality()
	{
		return "irregular";
	}
}
class Zoha extends Java_student
{// // child class 3
	String quality()
	{
		return "shy";
	}
}
class Suhel extends Java_student
{//// child class 4
	String quality()
	{
		return "Active";
	}
}