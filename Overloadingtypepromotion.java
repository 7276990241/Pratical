package com;

public class Overloadingtypepromotion {
	void add( int a, double b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		Overloadingtypepromotion obj=new Overloadingtypepromotion(); //obj
		obj.add(2, 3);;//2nd int value (3) will be promoted to double
		obj.add(10,30,20);
	}
}
