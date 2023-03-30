package constructor;

public class StaticmethodEg2 {
	int m = 20;
	static int n = 20;
	static int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		int c =StaticmethodEg2.add(5, 4);
		System.out.print(c);
		StaticmethodEg2 refvar = new StaticmethodEg2();
		System.out.println(refvar.m);
		System.out.println(n);
	}

}
