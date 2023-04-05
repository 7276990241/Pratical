package com;
//overload main method is possible which received string type arrat
public class Overload_Main_Method {
	//JVM call the void main method with string array
	public static void main(String[] args)
	{
		System.out.println("Main with string type array");
	}
	public static void main(String args)
	{
		System.out.println("main with without array");
	}
	
	public static void main()
	{
		System.out.println("main with without arguments");

	}
}
