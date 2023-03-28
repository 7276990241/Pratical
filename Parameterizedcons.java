package obj;

public class Parameterizedcons {
	int age;
	String name;
	Parameterizedcons(int a , String n)
	{
		age=a;
		name = n;
	}
	void show()
	{
		System.out.println(age+ " "+name);
	}
public static void main(String[] args)
{
	Parameterizedcons d=new Parameterizedcons(20, "Priyanka");
	Parameterizedcons d1=new Parameterizedcons(22, "ABC");
	Parameterizedcons d2=new Parameterizedcons(23, "PQR");
d.show();
d1.show();
d2.show();
}
}
