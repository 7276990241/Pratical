package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListStringEx 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//declare an array list
		ArrayList<String> as = new ArrayList<String>();
		String str;
		System.out.println("Enter the strig:");
		for(int i=0;i<3;i++)
		{
			str = sc.next();as.add(str);
		}
		System.out.println("String are:");
		for(int i=0;i<as.size();i++)
		{
			System.out.println(as.get(i));
		}
		System.out.println(as);
		
		Collections.sort(as);;
		System.out.println("After sorting:(ascending)");
		System.out.println(as);
		Collections.sort(as, Collections.reverseOrder());
		System.out.println("After sorting:(decending)");
		System.out.println(as);

		//conver arraylist into array
		String arr[] = new String[as.size()];
		for(int i=0;i<as.size();i++)
		{
			arr[1] = as.get(i);
		}
		System.out.println("Printing array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//convert array into arraylist
		String name[] = {"ABC","PQR","PNW","NPK"};
		ArrayList<String> alist = new ArrayList<String>(Arrays.asList(name));
		
		//can add elements also
		alist.add("Prem");
		alist.add("Pooja");
		
		System.out.println("After converting into arrylist:");
		System.out.println(alist);
	}
}


