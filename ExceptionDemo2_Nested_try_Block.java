package exception;

import java.util.Scanner;

public class ExceptionDemo2_Nested_try_Block {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		//nested try block
		try(Scanner sc=new Scanner(System.in)) //try with resource (scanner method used wtih "try")
		{
			try
			{
				System.out.println("Enter a number:");
				int a=sc.nextInt();
				System.out.println("enter divisor:");
				int b=sc.nextInt();
				System.out.println("result:"+(a/b));
						
			}
			catch(ArithmeticException e)
			{
				System.out.println("cant divide by zero");
			}
			int arr[]=new int[5];
			arr[5]=90;	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		//finally block is the last block/closing block which is always gets executed
		finally {
			//sc.close(); //closing the scanner
			System.out.println("Finally block always get executed");
		}
		//another alternative of finally close is try with resource
		
	}

}
