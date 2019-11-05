package inheritance;

import java.util.Scanner;

public class Single2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of Persons");
	int a=s.nextInt();
	System.out.println("Enter the number of days");
	int b=s.nextInt();
	System.out.println("Enter the room type");
	String roomtype=s.nextLine();
	s.nextLine();
	System.out.println("Enter the tariff for ");
	int c=s.nextInt();
     Seasonbooking st=new Seasonbooking();
	    st.person(a);
	    st.days(b);
	    st.tariff(c);
	    a=st.person();
	    b=st.days();
	    c=st.tariff();
		
		
		Booking bk=new Booking();
bk.Booking1(a,b,c);
	}

}
