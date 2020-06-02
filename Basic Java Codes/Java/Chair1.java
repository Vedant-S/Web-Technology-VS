class Furniture
{
	String Color;
	int Height;
	int Width;

	public Furniture()//Default Construtor
	{
		Color="Red";
		Height=10;
		Width=5;
	}
	void display1()
	{
		System.out.println("Color is : "+Color);
		System.out.println("Height is : "+Height);
		System.out.println("Width is : "+Width);
	}
}
public class Chair1 extends Furniture
{
	int noOfLegs;
	public Chair1()
	{
		noOfLegs=4;
	}
	void display1()
	{
		super.display1();
		System.out.println("No Of Legs are : "+noOfLegs);
	}
	public static void main(String args[])
	{
		Chair1 o111=new Chair1();
		o111.display1();


		//o111.display2();
		//C1.disp();
	}
}
/*       */