package javaprogram;
import java.io.*;
import java.util.*;
class Student1
{
	String name;
	int age,rolno;
	 int total;
	
	public  void details(String name,int rn, int age)
	{
		
		this.name=name;
		rolno=rn;
		this.age=age;
		
		System.out.println("name:"+name);
		System.out.println("Roll No:"+rolno);
		System.out.println("Age:"+age);
		
	}
	public   void  mark(int a,int b,int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		total=a+b+c;
		System.out.println("total mark="+total);
	}
	public void rank()
	{
		if(total>90&&total<100)
		
		System.out.println("1");
		else
			System.out.println("2");
			
	}
}
	

public  class Student 
{
	public static void main(String[] args)

	{
		Scanner s=new Scanner(System.in);
		
	System.out.println("Enter name,rollno,age");
String a=s.nextLine();
int b=s.nextInt();
int c=s.nextInt();
System.out.println("Enter Three Marks");
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
Student1 st=new Student1();
System.out.println("**********STUDENT DETAILS*********");
st.details(a, b, c);
st.mark(x, y, z);
st.rank();
	}
}