// Demonstrate ?.
class Ternary
{
	public static void main(String args[])
	{
		int i, k;
		i = 10;
		k = i < 0 ? -i : i; // get absolute value of i
		System.out.print("Absolute value of ");
		System.out.println(i + " is " + k);
		//i = -10;
		//k = i < 0 ? -i : i; // get absolute value of i
		//System.out.print("Absolute value of ");
		//System.out.println(i + " is " + k);
	}
}
//The output generated by the program is shown here:
//Absolute value of 10 is 10
//Absolute value of -10 is 10
