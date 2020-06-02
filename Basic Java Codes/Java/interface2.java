interface Inter
{
	//method only declared and not body
	void disp();
}


public class interface2 implements Inter
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
		interface2 obj=new interface2();
		obj.disp();
		obj.nonIfaceMethod();

		Inter obj2=new interface2();
		obj2.disp();
		//obj2.nonIfaceMethod();//not possible
	}
}




