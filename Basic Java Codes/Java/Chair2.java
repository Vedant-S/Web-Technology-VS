class Chair
{
	String Color;
	int noOfArms;

	public Chair()	//Default Contructor
	{
		Color="Red";
		noOfArms=4;
		//System.out.println("The Default values are  "+noOfArms);
	}
	public Chair(String c,int arms)//Overloaded Constructor
	{
		Color=c;
		noOfArms=arms;
	}
	void display()
	{
		System.out.println("Color is : "+Color);
		System.out.println("NoOfArms is : "+noOfArms);
	}
}
public class Chair2 extends Chair
{
	int noOfWheels;
	public Chair2(String s,int a, int wheels)
	{
		super(s,a);
		noOfWheels=wheels;
	}
	void disp()
	{
		System.out.println("No Of Wheels are : "+noOfWheels);
	}
	public static void main(String args[])
	{
		//ALSO CALL THE DEFAULT
		Chair2 c2=new Chair2("Blue",4,40);
		c2.display();
		c2.disp();
	}
}
