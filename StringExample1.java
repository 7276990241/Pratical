package string;
// char[] work same as java string
public class StringExample1
{
	public void show()
	{ // method 1
		char [] arr = {'j','a','v','a'}; // char type array
		System.out.println(arr);
		String s = new String(arr); // by using new keyword creating string
		System.out.println("Value is :" +s); // "java"
	}
	public void myFunction()
	{ // method 2
		String s1 = "priyanka"; // String literal ( creating object of string)
		String s2 = "priyanka";// it does not create any new object
		String s3 = new String(s1);
		System.out.println(s3); // Priyanka
	}
public static void main(String[] args)
{
	StringExample1 str = new StringExample1();
	str.show();
	str.myFunction();
}
}
