package inhertance;

public class Parents_Simple_EG_IS_A {
	int marks = 85;
}
class Simple_EG_IS_A extends Parents_Simple_EG_IS_A
{
	int Additional_percentage = 5;
	public static void main(String[] args)
	{
		Simple_EG_IS_A obj = new Simple_EG_IS_A();
		System.out.println("Total marks:"+ (obj.marks+obj.Additional_percentage));
	}
}
