package superKeyword;

// Final keyword ----- provide restriction
// final variable-- cannot change the value of final variable
public class Finalvariable 
{
	final int value=50;// blank initiallization of final variable
	void display()
	{ //value=70;
		System.out.println(value);
		//we can't change the value of final variable
		//compile time error
	}
	public static void main(String args[])
	{
		Finalvariable fv = new Finalvariable();//creating object
		fv.display();
	}

}


