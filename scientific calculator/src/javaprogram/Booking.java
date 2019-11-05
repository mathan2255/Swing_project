package javaprogram;

import java.util.*;

public class Booking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Book bk=new Book();
		
		String name[]=new String[25];
		int i=1;
		String proceed;
		String proceed1;
		String b[]=new String[25];
		String email[] =new String[25];
		
		do
		{
	
		System.out.println("REGISTRATION");
		System.out.println("Enter your name");
		name[i]=s.nextLine();
		System.out.println("Enter your address");
		String address=s.nextLine();
		System.out.println("Contact Number");
		String contactno=s.nextLine();
		System.out.println("E-Mail ID");
		 email[i]=s.nextLine();
		System.out.println(" Enter proof type");
		String prooftype=s.nextLine();
		System.out.println(" Enter proof id");
		String proofid=s.nextLine();
		
		System.out.println("Do you want to book a room (yes/no)?");
		 proceed=s.next();
		 
		if(proceed.equals("yes")==true)
		{
			System.out.println("Thank you for registering. Your id is .."+i);
		
			bk.booking();
			
		
		}i++;
		
		System.out.println("Do you want to Continue registration yes/no");
		proceed1=s.next();
		}while(proceed1.equals("yes")==true);
		bk.show();
	
		System.out.println("   CustomerID       NAME           Email   "+"\n");
		for(int j=1;j<i;j++)
		{
			System.out.println(j+"              "+name[j]+"             "+email[j]);	
		}	
	

	}}
	class Book
	{
		Scanner s=new Scanner(System.in);
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		 Date date;
		double total=0;
		double a,b,c,d,e,f;
		String proceed2;

	void booking() {
		
		
		System.out.println("BOOKING");
		System.out.println("Choose Your needs");
		System.out.println("AC (y/n)");
		ac=s.nextLine();
		if(ac.equals("y")==true) {
			a=800;
			//System.out.println(ac);
			}
		else {
			a=500;
		
			//System.out.println(ac);
			}
		
			System.out.println("Single or Double(yes/n)");
			cot=s.nextLine();
		if(cot.equals("yes")==true)
		{
			b=100;
			//System.out.println(cot);
			}
		else
	       {b=60;
			//System.out.println(cot);
	       }
		
		System.out.println("Cable(y/n)");
		cable=s.nextLine();
		
		if(cable.equals("y")==true) {
			c=100;
			//System.out.println(cable);
			}
		else {
			c=0;
			//System.out.println(cable);
			}
		System.out.println("wifi(y/n)");
		wifi=s.nextLine();
		if(wifi.equals("y")==true) {
			d=100;
			//System.out.println(wifi);
			}
		else {
			d=0;
			//System.out.println(wifi);
			}
		
		System.out.println("laundry(y/n)");
		laundry=s.nextLine();
		if(laundry.equals("y")==true) {
			e=200;
			//System.out.println(laundry);
			}
		else {
			e=0;
			//System.out.println(laundry);
			}
		
		total=a+b+c+d+e;
		System.out.println("Total Amount is="+total);
		}
	
		
	
void show()
{          int i=1;
		do{
			System.out.println("Services choosen are");
			if(a==800) {
				
				System.out.println("AC");	}
			else {
			
				System.out.println("NON_AC");}
		
			if(b==100) {
			
				System.out.println("Single cot");	}
			else
		       {
				System.out.println("double cots");}
			
			
			
			if(c==100) {
				
				System.out.println("with cable");	}
			else {
			
				System.out.println("without cable");}
			if(d==100) {
			
				System.out.println("wifi");	}
			else {
			
				System.out.println("No wifi");}
			
			
			if(e==200) {
			
				System.out.println("laundry");	}
			else {
			
				System.out.println("no laundry");}
			System.out.println("Enter the Date: ");
			   int date=s.nextInt();
			System.out.println("Do you want to proceed? (y/n)");
			   proceed2=s.next();}
			while(proceed2.equals("n"));
			{
			if(proceed2.equals("y")==true)
			{
          
			System.out.println("Thank you  for booking******** \n Your room number is "+i);
			i=i+1;
			}
			}
			
		}
		
		
	
	}


