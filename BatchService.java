package batchapplication;

import java.util.Scanner;

public class BatchService 
{
	static Scanner sc = new Scanner(System.in);
	static Java java[] = new Java[50];
	static int jindex = 0;
	
	public static void saveJavaStudentDetails()
	{
		System.out.println("Enter Student Id: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter Student Phone Number: ");
		long phone = sc.nextLine();

		java[jindex] = new Java(id, name, email, phone);
		jindex++;
		System.out.println("Student details save successfully!!");
	}
	public static void getJavaStudentDetailsByID() throws StudentNotFoundException
	{
		boolean flag = false;
		System.out.println("Enter the Student Id to search: ");
		int id = sc.nextInt();
		for(int i=0;i<jindex; i++)
		{
			if(id==java[i].getStdId())
			{
				System.out.println("Student Id: "+java[i].getStdId());
				System.out.println("Student Name: "+java[i].getStdName());
				System.out.println("Student Email: "+java[i].getEmail());
				System.out.println("Student Phone: "+java[i].getPhone());
				flag = true;
				break;
			}
		}
		if(flag==flag)
		{
			throw new StudentNotFoundException("Student Detaiuls Not Found!!");
		}	
	}
}
