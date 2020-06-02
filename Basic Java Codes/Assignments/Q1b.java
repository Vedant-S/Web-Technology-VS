import java.util.Scanner;
public class Q1b
{
	public static void main(String[] Args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values of the 3X3 Matrix:");
		double a = in.nextInt();
		double b = in.nextInt();
		double c = in.nextInt();
		double d = in.nextInt();
		double e = in.nextInt();
		double f = in.nextInt();
		double g = in.nextInt();
		double h = in.nextInt();
		double i = in.nextInt();
		System.out.println("The Determinant of the 3X3 Matrix is:" +(a*(i*e-f*h)-b*(d*i-f*g)+c*(h*d-e*g)));
	}
}