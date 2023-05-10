package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//declaring an array
		int [] arr= new int[5];
		System.out.println("Array before Insertion:"+arr.length);
		arr[0] = 5;
		arr[1] = 3;
		System.out.println("Array after insertion: "+arr.length);
		
		//declare an arrayList
		List<Integer> List = new ArrayList<Integer>();
		System.out.println("Arraylist before insertion: "+List.size());
		List.add(16);
		List.add(14);
		List.add(20);
		List.add(39);
		List.add(55);
		System.out.println(List);
		System.out.println("Arraylist after insertion: "+List.size());
		List.add(7);
		List.add(9);
		List.add(17);
		System.out.println(List);
		System.out.println("Arraylist after insertion: "+List.size());

		List.remove(5); //delete an element using index
		System.out.println(List);
		System.out.println("Arraylist after deletion: "+List.size());
		
		List.add(5, 7); //adding element to an index
		System.out.println(List);
		
		//using for loop
		System.out.println("Printing using for loop:");
		for(int i=0; i<List.size(); i++)
		{
			System.out.print(List.get(i)+" ");
		}
		System.out.println();
		
		//using for each
		System.out.println("Printing using for-each loop:");
		for(Integer in: List)
		{
			System.out.print(in+" ");
		}
		System.out.println();
		
		//using while loop
		System.out.println("Printing using while loop:");
		int count =0;
		while(count<List.size());
		{
			System.out.println("Iterator using iterator:");
			Iterator itr = List.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			//sort the arraylist in ascending order
			System.out.println("Sorting in ascending order:");
			Collections.sort(List);
			System.out.println(List);
			
			//searching an element
			System.out.println("Enter element to search:");
			int element = sc.nextInt();
			if(List.contains(element))
			{
				System.out.println("Data is present at: "+List.indexOf(element));
			}
			else
				System.out.println("Data not found!!");
			
			//copy from one arraylist to another arraylist
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			list2.addAll(List);
			System.out.println("Copied arraylist:"+list2);
			
			//sublist
			//one way
			List<Integer> sublist1= List.subList(3, 6);
			System.out.println(sublist1);
			//second way
			ArrayList<Integer> sublist2 = new ArrayList<Integer>(List.subList(0, 4));
			System.out.println(sublist2);
		}
	}
}
