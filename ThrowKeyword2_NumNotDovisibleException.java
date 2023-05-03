package exception;

//import java.util.Scanner;
class ThrowKeyword2_NumNotDivisibleException {
	//Scanner sc=new Scanner(System.in);
	     static void checkDivisibility(int num) throws NumNotDivisibleException
	     
	     {
	    	 //System.out.println("Enter a number");
	        if (num % 5 == 0 && num % 11 == 0) 
	        {
	            System.out.println("The number is divisible.");
	        } 
	        else 
	        {
	             throw new NumNotDivisibleException("The number is not divisible by both 5 and 11.");
	        }
	    }

	    public static void main(String[] args) {
	        try 
	        {
	        	//isDivisible(55);
	        	
	            //int num = Integer.parseInt(args[0]);
	        	int num=44;
	            ThrowKeyword2_NumNotDivisibleException.checkDivisibility(num);
	        } 
	        catch (NumNotDivisibleException e) 
	        {
	            System.out.println(e.getMessage());
	        } 
	         catch (NumberFormatException e) 
	        {
	            System.out.println("Invalid input: Please enter a valid integer.");
	        } 
	    }
		
}
