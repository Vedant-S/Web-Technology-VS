interface Inter
{
	//method only declared and not body
	void disp();
}
class anotherclient implements Inter
{
	public void disp()
	{
			System.out.println("I am disp in a different way");
	}
}
public class interface3 implements Inter
{
	public void disp()
	{
		System.out.println("I am disp");
	}
	void nonIfaceMethod()//class can define their own methods
	{
		System.out.println("Classes that implements "+
												"interfaces may also define "+
												"other methods too");
	}
	public static void main(String args[])
	{
		interface3 obj=new interface3();
		obj.disp();
		obj.nonIfaceMethod();
		//////
		Inter obj2=new interface3();
		anotherclient oo=new anotherclient();
		obj2.disp();
		oo.disp();//can possible

		//but can also possible
		obj2=oo;//now obj2 referes to anotherclient object
		obj2.disp();//
	}
}




