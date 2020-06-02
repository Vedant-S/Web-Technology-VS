import java.util.Scanner;
public class Q1a
{
	public static void main(String[] Args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values of the 2X2 Matrix:");
		double a = in.nextInt();
		double b = in.nextInt();
		double c = in.nextInt();
		double d = in.nextInt();
		System.out.println("The Determinant of the 2X2 Matrix is:" +(a*d-b*c));
	}
}