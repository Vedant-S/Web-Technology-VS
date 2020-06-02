import java.util.Scanner;
public class Q2
{
	public static void main(String[] Args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your Name:");
		String name = in.next();
		System.out.println(""+name);
		System.out.println("Now Enter 3 numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		System.out.println("The formula you have entered is:");
		System.out.println(a+"x^2+"+b+"x+"+c);
		System.out.println("The Derivative of the equation is:");
		System.out.println(2*a+"x+"+b+"");
		System.out.println("Enter a value for x:");
		double x = in.nextInt();
		System.out.println("The Derivative at the above point is:");
		System.out.println(((2*a*x)+b)+"");
		System.out.println("The Anti-Derivative at the above point is:");
		System.out.println((a/3.0)+"x^3+"+(b/2.0)+"x^2+"+c+"x");
		System.out.println(name+", you owe Dan Pomerantz forever");
	}
}