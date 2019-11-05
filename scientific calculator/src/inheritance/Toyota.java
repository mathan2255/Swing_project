package inheritance;

public class Toyota 
{
	int speed1;
void about()
{
	System.out.println("WELCOME");
	System.out.println("INNOVA 2017 model");
}
void speed(int a,int b)
{
	
	speed1=b/a;
}

}

 class Car1 extends Toyota
 {
	 void speed2()
	 {
 
  System.out.println(speed1);
 }
 }
