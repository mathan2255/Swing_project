package inheritance;

import java.util.*;

public class Seasonbooking extends Booking
{
	int person1;
	int days1;
	int tariff1;
	void person(int psn)
	{
		this.person1=psn;
	}
	void days(int dys)
	{
		this.days1=dys;
	}
	void tariff(int tar)
	{
		this.tariff1=tar;
	}
	
	int person()
    {
	return this.person1;
     }

	int days()
    {
	return this.days1;
     }

	int tariff()
    {
	return this.tariff1;
     }

}
