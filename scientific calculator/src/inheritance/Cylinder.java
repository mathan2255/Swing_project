package inheritance;

public class Cylinder extends Circle
{
int a,h;
	Cylinder(int r,int h) {

		super(r);
		//a=r;
		this.h=h;
		
	}
	double  volume()
	{
		//double v;
		//return v=
		return area()*h;
		//System.out.println(v);
		
	}
}
	


