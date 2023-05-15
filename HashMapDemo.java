package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hmap = new HashMap<Integer, String>();
		hmap.put(111, "Priyanka");
		hmap.put(112, "Pooja");
		hmap.put(113, "Nayan");
		hmap.put(114, "Rushi");
		
		System.out.println(hmap);
		
//		Set s = hmap.entrySet();
//		Iterator itr = s.iterator();
		
		Iterator itr = hmap.entrySet().iterator();
		//Map.Entry interface provides certain method to access the entry in
		//the map by gaining the access to access to the entry of the map so we can easily
		//manipulate them.
		while(itr.hasNext())
		{
			Map.Entry mentry = (Entry) itr.next();
			System.out.println("Key: "+mentry.getKey());
			System.out.println("Value: "+mentry.getValue());
		}
		
		System.out.println();
		//get values based on key
		String val = hmap.get(111);
		System.out.println("Value mapped with kay: "+val);
		
		//remove value based on key
		System.out.println("Removing value using key: "+hmap.remove(114));
		//System.out.println(hmap);
		for(Map.Entry me: hmap.entrySet())
		{
			System.out.println("Key: "+me.getKey());
			System.out.println("Value: "+me.getValue());
		}
		
		System.out.println();
		//sort the data based on key
		Map<Integer, String> tmap = new TreeMap<>(hmap);
		tmap.put(109,  "Tushar");
		System.out.println("After sorting");
		for(Map.Entry me: tmap.entrySet())
		{
			System.out.println("Key: "+me.getKey());
			System.out.println("Value: "+me.getValue());
		}

		//check the size of hash map
		System.out.println("Size of hashmap: "+hmap.size());
		//check the size of tree map
		System.out.println("Size of treemap: "+tmap.size());
		
		//checking key's existence
		System.out.println("Key present: "+hmap.containsKey(111));
		//checking value's existence
		System.out.println("Value present: "+hmap.containsValue("Nayan"));
		
		//to remove all the elements from hmap
		hmap.clear();			
		System.out.println(hmap);
	}

}
