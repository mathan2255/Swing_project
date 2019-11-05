package inheritance;

public class Cylinder1 extends Circle1{

	
		int a,h;
		Cylinder1(int r,int h) {

			super(r);
			a=r;
			this.h=h;
			
		}
		double  volume()
		{
			
			return area()*h;
			
		}
		
	}
	


