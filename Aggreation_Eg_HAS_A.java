package inhertance;

public class Aggreation_Eg_HAS_A {
	public static void main(String[] args)
	{
		Address a = new Address("Priyanka","Solapur","India");
		Student s = new Student(01,"Ram",a);
		s.show();
	}
}
