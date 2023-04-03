package inhertance;
//Multilevel Inheritance
class Vehicle {//parent class A
	void running()
	{
		System.out.println("running mode on");
	}
}
class Car extends Vehicle
{// child class B whose parent class is vehical
	void run()
	{
		System.out.println("Car run mode on");
	}
}
class I10 extends Car
{// child class C whose parent class is Car
	void speed()
	{
		System.out.println("Speed is very high");
	}
}


public class Multillevelin
{
	public static void main(String[] args)
	{
		I10 d = new I10();//creating obj
		d.running();
		d.run();
		d.speed();
	}
}