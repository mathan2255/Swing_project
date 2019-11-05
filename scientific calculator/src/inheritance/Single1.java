package inheritance;

import java.util.Scanner;

public class Single1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF CIRCLE AND HEIGHT OF THE CYLINDER");
		int a=s.nextInt();
		int b=s.nextInt();
		//Circle c=new Circle(a);
		//Cylinder cy=new Cylinder(a,b);
		Cone cn=new Cone(a,b);
		System.out.println("AREA OF CIRCLE\n "+cn.area());
		
		
		System.out.println("Volume of Cylinder\n "+cn.volume());
		
		System.out.println("Volume of Cone\n "+cn.volume1());
		
		
	}

}
