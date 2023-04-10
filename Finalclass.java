package superKeyword;
//Final keyword ----
// final class-- cannot extend the final class

final class Finalclass
{ // parent class
	void show()
	{
		System.out.println("Final class method");
	}
	/*class test extends Finalclass{ // can't extend final class
	  void show(){
	  System.out.printn("child class override method");
	  }*/
	public static void main(String[] args)
	{
		Finalclass t = new Finalclass();
		t.show();
	}
}
