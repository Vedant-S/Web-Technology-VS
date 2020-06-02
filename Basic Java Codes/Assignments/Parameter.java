package parameter;
import java.util.Scanner;

abstract class Area
{
 Area(){}
}

class Triangle extends Area
{
 double b,h;
 Triangle()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter height: ");
  h=sc.nextDouble();
  System.out.print("Enter base: ");
  b=sc.nextDouble();
  System.out.println("Area = " + (0.5*b*h));
 }
}

class Rectangle extends Area
{
 double l,b;
 Rectangle()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter length: ");
  l=sc.nextDouble();
  System.out.print("Enter breadth: ");
  b=sc.nextDouble();
  System.out.println("Area = " + (l*b));
 }
}

class Quad extends Area
{
 double b,h;
 Quad()
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter height: ");
  h=sc.nextDouble();
  System.out.print("Enter base: ");
  b=sc.nextDouble();
  System.out.println("Area = " + (b*h));
 }
}

class Parameter 
{
    static Scanner inp = new Scanner("System.in");
 public static void main(String args[]) 
 {
     
     Area ob;
     System.out.print("\tAREA\nA. Rectangle\nB. Triangle\nC. Quadrilateral\nEnter option(A-C) to calculate area: ");
     ch=inp.next().charAt(0);
     switch(ch)
     {
         case 'A':
         case 'a':ob=new Rectangle(); break;
         case 'B':
         case 'b':ob=new Triangle(); break;
         case 'C':
         case 'c':ob=new Quad(); break;
     }
 }
}
