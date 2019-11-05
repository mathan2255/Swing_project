package inheritance;

import java.util.Scanner;

public class Leanseason extends Booking
{
	int a,b,r;
	Leanseason l=new Leanseason();
	Scanner s=new Scanner(System.in);
	//int month;
	int discount;
	
	void roomBooking(int c)
	{
		if(c==1||c==2||c==3||c==7||c==8||c==10)
			
			System.out.println("Enter the Discount");
			int e=s.nextInt();
			double m =l.Booking2(a,b,r)+e;
			System.out.println("Total amount."+m);
	}

}
