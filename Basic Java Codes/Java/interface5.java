interface A
{
	int x=90;//it is implicitely final and static
	void meth1();
}


//This class must implement all ao A and B
class interface5 implements A
{
	public void meth1()
	{
		//x=88;//not possible
		System.out.println(x);
		System.out.println("I am meth1()");
	}
	public static void main(String args[])
	{
		interface5 obj=new interface5();
		obj.meth1();
		//Directly accessing through main function without object
		System.out.println(x);

	}
}









