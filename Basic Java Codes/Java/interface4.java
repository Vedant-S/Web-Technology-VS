interface A
{
	void meth1();
	void meth2();
}
// B now includes meth1() and meth2() --adds meth3()
interface B extends A
{
	void meth3();
}

//This class must implement all ao A and B
class interface4 implements B
{
	public void meth1()
	{
		System.out.println("I am meth1()");
	}
	public void meth2()
	{
		System.out.println("I am meth2()");
	}
	public void meth3()
	{
		System.out.println("I am meth3()");
	}
	public static void main(String args[])
	{
		interface4 obj=new interface4();
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}









