package inheritance;

import java.util.Scanner;

public class Hierarchii {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Booking2 bk=new Booking2();
		Peakseason ps=new Peakseason();
		Leanseason ls=new Leanseason();
		System.out.println("Enter the number of Persons");
		int a=s.nextInt();
		System.out.println("Enter the number of days");
		int b=s.nextInt();
		System.out.println("Enter the room type");
		String rt=s.nextLine();
		s.nextLine();
		System.out.println("Enter the tariff for ");
		int r=s.nextInt();
		System.out.println("Enter the Month ");
		int c=s.nextInt();
		ps.roomBooking(c);
		ls.roomBooking(c);
		bk.Booking2(a,b,r);
		
	}
}
		  /*  st.person(a);
		    st.days(b);
		    st.tariff(c);
		    a=st.person();
		    b=st.days();
		    c=st.tariff();
			
			
			
					;
	//
		
		

	}

}
*/