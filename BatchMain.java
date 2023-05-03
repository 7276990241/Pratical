package batchapplication;

import java.util.Scanner;

public class BatchMain 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BatchService batch = new BatchService();
		int ch;
		
		System.out.println("welcome to Anudip Foundation:");
		System.out.println("==============================");
		do
		{
			System.out.println("Press:\n 1) Java 2) AWS 3) Others 4) Exit ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				do
				{
					System.out.println("-----JAVA-----");
					System.out.println("1) To save student details\n"
							+ "2) To get student details using id\n"
							+ "5) Main Menu");
					ch = sc.nextInt();switch(ch)
					{
					case 1:
						batch.saveJavaStudentDetails();
						break;
						
					case 2:
						try
						{
							batch.getJavaStudentDetailsByID();
						}
						catch(StudentNotFoundException e)
						{
							System.out.printlbn(e.getMessage());
						}
						break;
						
					case 5:

						break;
					}
				}while(ch!=5);
				
				//break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				System.out.println("Thank you for visiting!!");
				System.exit(0);;
				break;
			}
		}
	}

}
