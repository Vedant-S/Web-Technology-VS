// Loops may be nested.
class Foreach4
{
	public static void main(String args[])
	{
		int nums[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int x:nums)
		{
			System.out.println("Value of x is now  :  "+x);
			sum+=x;
			x=x*10;//no effect on nums
			System.out.println("Value of x is now  :  "+x);
		}
		System.out.println("The Final Summation is "+sum);
		System.out.println("\n\n");

		for(int x:nums)
		{
			System.out.println("Value of x is now  :  "+x);
		}

	}
}
