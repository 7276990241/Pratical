package array;

public class CopyArray 
{ // class
	public static void main(String[] args)
	{
		char[]copyFrom= {'d','e','c','f','e','i','n'};
		////declaring  a Destination array
		char[]copyTo=new char[7];// new array
		System.arraycopy(copyFrom,1,copyTo,1,5); //-ecffe-
		//print the destination array
		System.out.println(String.valueOf(copyTo));
	}

}
