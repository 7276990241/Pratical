package collections;

import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args)
	{
		Vector<String> vec = new Vector<String>(5);
		
		//System.out.println("Default Capacity: "+ve.capacity());//default capacity = 10
		
		System.out.println("Capacity: "+vec.capacity()); //5
		vec.add("Mango");
		vec.add("Watermelon");
		vec.add("Promogrante");
		vec.add("Apple");

		System.out.println(vec);
		System.out.println("Size: "+vec.size());
		System.out.println("Capacity: "+vec.capacity());
	
		System.out.println();

		vec.add("Banana");
		vec.add("Pineapple");
		vec.add("Guava");

		System.out.println(vec);
		System.out.println("New Size: "+vec.size());
		System.out.println("New Capacity: "+vec.capacity());

		System.out.println("First Element: "+vec.firstElement());
	
		//to check whether vector is empty or not
		System.out.println(vec.isEmpty());
	}

}
