abstract class shape
{
	public abstract float calculateArea();
}

interface hello
{
	public void disp();

}

class Square extends shape implements hello
{
	float side=10;

	public float calculateArea()
	{
		return(side * side);
	}
	public void disp()
	{
		System.out.println("Hello I am an Interface");
	}
}
class Rectangle1 extends shape
{
	float L=5;
	float B=5;

	public float calculateArea()
	{
		return(L*B);
	}
}

public class CircleJoint extends shape
{
	float radius=5;

	public float calculateArea()
	{
		return ((radius * radius)*(22/7));
	}
	public static void main(String args[])
	{
		float x;
		float y;
		float z;

		Square obj1=new Square();
		x=obj1.calculateArea();
		System.out.println("The Area Of The Square is   "+x);
		obj1.disp();


		Rectangle1 obj2=new Rectangle1();
		y=obj2.calculateArea();
		System.out.println("The Area Of The Rectangle1 is   "+y);

		CircleJoint obj3=new CircleJoint();
		z=obj3.calculateArea();
		System.out.println("The Area Of The Circle is   "+z);

		//shape obj=new shape();	//Cannot create object
	}
}