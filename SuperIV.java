package superKeyword;
/*super keyword -- reference variable which refer immediate parent class object
  (IV,method,con)
 3 uses of super keyword
 2--- refer immediate parent class constructor*/
//by using super keyword we can use parent class data member

class Shape
{//parent class
	String name= "circle";//data member of parent class
}
class Size extends Shape
{//child class
	String name="No Size";//data member of child class
	void print()
	{ //child class method
		System.out.println(name);//it represent child class
		//it represent immediate parent class IV
		System.out.println(super.name);
	}
}
class SuperIV
{
	public static void main(String[] args)
	{
		Size obj=new Size();
		obj.print();
	}
}
