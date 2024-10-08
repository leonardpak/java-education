public class Date
{
	private int month, day, year;

	public Date (int m, int d, int y)
	{
		month = m;
		day = d;
		year = y;
	}

	public void setDay (int d)
	{
		day = d;
	}

	public int getDay()
	{
		return day;
	}

	public void setMonth(int m)
	{
		if (m > 12)
			System.out.println("Invalid value for month");
		else
			month = m;
	}

	public int getMonth()
	{
		return month;
	}

	public void displayDate()
	{
		String msg;

		msg = month + "/" + day + "/" + year;
		System.out.println(msg);
	}
/*
	public static void main(String x[])
	{
		Date d1;
		d1 = new Date ( 2, 28, 2009 );
		d1.displayDate();
	}
*/
}