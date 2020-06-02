package pkgnew;
import java.util.Scanner;

class Student
{
 Scanner in = new Scanner(System.in);
 String name;
 int roll,age;
 char gender;
 char Grade;
 float mark[],CGPA;
 
Student()
{
  mark=new float[5];
  System.out.print("Enter Name: ");
  name=in.nextLine();
  System.out.print("Enter Roll: ");
  roll=in.nextInt();
  System.out.print("Enter Age: ");
  age=in.nextInt();
  System.out.print("Enter Gender: ");
  gender=in.next().charAt(0);
  float total=0;
  for(int i=0;i<5;i++)
  {
   System.out.print("Enter marks for Subject-" + (i+1) + ": ");
   mark[i]=in.nextFloat();
   total+=mark[i];
  }
  CGPA=total/50;
  switch((int)(total/50+1))
  {
      case 10:Grade='O';
      break;
      case 9: Grade='E';
      break;
      case 8: Grade='A';
      break;
      case 7: Grade='B';
      break;
      case 6: Grade='C';
      break;
      case 5: Grade='D';
      break;
      default: Grade='F';
  }
  System.out.println("Overall Grade = " + Grade);
  System.out.println("CGPA = "+CGPA);
 }

Student(String n,int r,int a,char g,float m[])
{
  mark=new float[5];
  name=n;
  roll=r;
  age=a;
  gender=g;
  float total=0;
  for(int i=0;i<5;i++)
   total+=mark[i]=m[i];
   
  
  CGPA=total/50;
  switch((int)(total/50+1))
  {
      case 10:Grade='O';
      break;
      case 9: Grade='E';
      break;
      case 8: Grade='A';
      break;
      case 7: Grade='B';
      break;
      case 6: Grade='C';
      break;
      case 5: Grade='D';
      break;
      default: Grade='F';
  }
  System.out.println("Overall Grade = " + Grade);
  System.out.println("CGPA = "+CGPA);
 }

 void Display()
 {
  System.out.println("");    
 }
 
}

class New
{ 
    public static void main(String[] args)
    {
       
        Scanner data=new Scanner(System.in);
        System.out.print("Enter number of students: ");
         for(int i=0;i<args.length;i++)
            System.out.println("args-" + i + ": " + args[i]);
        int n = data.nextInt();
   
        Student s[]=new Student[n];
        for(int i=0;i<n;i++)
        {
         System.out.println("[*]Enter data for student-" + (i+1));
         s[i]=new Student();
         System.out.println("_______________________________");
        }
        float mks[]={98.7F,99.1F,97.4F,96.5F,98.3F};
        Student O=new Student("Rajiv Gupta",1905547,19,'M',mks);
         O.Display();
        System.out.print(" \n");
    }
}