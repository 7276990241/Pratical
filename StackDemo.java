package collections;

import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		//to add elements to stack
		stack.push(12);
		stack.push(89);
		stack.push(76);
		stack.push(43);
		System.out.println(stack);
		
		//to remove element from the stack
		System.out.println("Popping to element: "+stack.pop());
		
		System.out.println(stack);
		System.out.println("Top element: "+stack.peek()); //fetches the top element of stack
		
		System.out.println("Position: "+stack.search(76)); //return relative position
		
		System.out.println("Empty?: "+stack.empty()); //stack method
		System.out.println(stack.isEmpty()); //vector method
	}
}
