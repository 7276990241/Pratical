package string;
//check equality by using comparision method ---1. equals(), 2. ==, 3.compareTo
import java.util.Scanner;
public class StringEquality
{
	public static void main(String[] args)
	{
		String str1, str2;//
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first String"); // java
		str1 = ab.nextLine();
		System.out.println("Enter second String");// anudip
		str2 = ab.nextLine();
		// Comparing two input string (java string compare)
		
		//if (str1.equals(str2))// equals() - compare original content of string
		if(str1==str2) // == compare reference not value
			          //if(str1.compareTo(str2)>0)// compare lexicographically
			System.out.print("Equal String");
			else
				System.out.println("UnEqual String");
	}

}
