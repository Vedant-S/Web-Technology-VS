interface Inter
{
	//method only declared and not body
	void disp();
	void disp2();
}
public class interface1 implements Inter
{
	public void disp()
	{
		System.out.println("I am disp");
	}
	public void disp2()
	{
	}
	public static void main(String args[])
	{
		interface1 obj=new interface1();
		obj.disp();
	}
}




