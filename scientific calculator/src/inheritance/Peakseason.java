package inheritance;

import java.util.Scanner;

public class Peakseason extends Booking2
{   int a,b,r;
	double month;
	int peakcharges;
	Scanner s=new Scanner (System.in);
	Peakseason p=new Peakseason();
	void roomBooking(int c)
	{

		if(c==4||c==5||c==6||c==9||c==12||c==11)
		{
			System.out.println("Enter the discount");
			int e=s.nextInt();
			month=p.Booking2(a,b,r)+e;
			System.out.println("Total amount."+month);
			
		}
		
		
		
	}

}
