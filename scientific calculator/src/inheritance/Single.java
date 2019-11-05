package inheritance;

import java.util.Scanner;

public class Single {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER DISTANCE AND TIME");
		int a=s.nextInt();
		int b=s.nextInt();
		
		Car1 t=new Car1();
		t.about();
		t.speed(a, b);
		t.speed2();

	}

}


