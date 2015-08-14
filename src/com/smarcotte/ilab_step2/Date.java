package com.smarcotte.ilab_step2;

public class Date 
{
	// attributes
	int month;
	int day;
	int year;

	// constructors
	public Date()
	{
		year = 0;
		month = 0;
		day = 0;
	}
	
	//behaviors
	public void nextDay() 
	{
		int validDays[] = {-1,31,28,31,30,31,30,31,31,30,31,30,31};

		if(month == 2 && year % 4 == 0)
		{
			validDays[month] = 29;
		}

		if(day == validDays[month])
		{
			day = 1;
			if(month == 12)
			{
				month = 1;
				year += 1;

			}
			else
				month += 1;

		}
		else
			day += 1;

	}

	//accessors and mutators
	public String getDate()
	{
		return month + "/" + day + "/" + year;
	}
	public String setDate(int y, int m, int d)
	{
		if (checkYear(y))
		{
			year = y;
			if(checkMonth(m))
			{
				month = m;

				if(checkDay(d))
					day = d;
				else
					return "Invalid Day Entered";

			}
			else
				return "Invalid Month Entered";
		}
		else
			return "Invalid Year Entered";

		return "";
	}

	public boolean checkYear(int y)
	{
		if(y >= 0)
		{
			return true;
		}
		else
			return false;
	}

	public boolean checkMonth(int m)
	{
		if(m >= 1 && m <= 12)
		{
			return true;
		}
		else
			return false;
	}

	public boolean checkDay(int d)
	{
		int validDays[] = {-1,31,28,31,30,31,30,31,31,30,31,30,31};

		if(month == 2 && year % 4 == 0)
		{
			validDays[month] = 29;
		}

		if(d >= 1 && d <= validDays[month])
		{
			return true;
		}
		else
			return false;
	}

}
