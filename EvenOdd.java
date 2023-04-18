package array;
import java.util.Arrays;
public class EvenOdd 
{
	public static void main(String[] args)
	{
		int[] array_nums = {3,5,2,4,8};
		System.out.println("Original Array:"+Arrays.toString(array_nums));
		int a = 0;
		for(int i = 0; i < array_nums.length; i++)
		{
			if(array_nums[i] % 2 == 0)
				a++;
		}
		System.out.println("Number of even numbrs : "+a);
		System.out.println("Number of odd numbrs : "+(array_nums.length-a));
	}
}
