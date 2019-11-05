package inheritance;

import java.util.Scanner;

public class Hierarchi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF CIRCLE AND HEIGHT OF THE CYLINDER");
		int a=s.nextInt();
		int b=s.nextInt();
		//Circle1 c=new Circle1(a);
		Cylinder1 cy=new Cylinder1(a,b);
		Cone1 cn=new Cone1(a,b);
		System.out.println("AREA OF CIRCLE\n "+cn.area());
		
		
		System.out.println("Volume of Cylinder\n "+cy.volume());
		
		System.out.println("Volume of Cone\n "+cn.volume1());
		
		


	}

}
