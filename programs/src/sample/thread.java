package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class thread {
	
	public static void main(String... args)
	{
		System.out.println(su(5,5));
		sum(10,10);
		System.out.println(su(10,10,10));
		System.out.println(str(null));
		date();
		thread t = new thread();
		thread t1 = new thread();
		t.str1();
	
		
	}
	
	
	
	protected void str1()
	{
		String t1 = "Proview";
		String t2 = "PFS";
		
		String h1 = t1.replace("P", "H");
		String h2 = t2.replace("P", "H");
		
		System.out.println(h1+" "+h2);
		
		
		
	}
	
	private static void date()
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH-MM-YY");
		
		String[] date =sdf.format(d).split("-");
		for(String s :date)
		{
			System.out.println(s);
		}
		
		String r1 = date[0];
		su(10,10);
		
		
	}
public static int su(int a,int b)
{
	
	int sum;
	sum=a+b;
	return sum;
	
}

public static String str(String str1)
{
	String s1 = "manjunath";
	String s2 =" reddy   t";
	
	str1 = s1.concat(s2).trim().toUpperCase();
	return str1;
}
public static int su(int a,int b,int c)
{
	return a-b-c;
}
public static void sum(int a,int b)
{
	int sum1 = a+b;
	System.out.println(sum1);
	date();
	
}
}

