package sample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class stri {
	
	public static void main(String... args)
	{
		new stri().read("");
		
	}
	
	public void display()
	{
		System.out.println("manju");
	}
	
	public void read(String dat)
	{
		String hello = "    Manjunath    ";
		String he = hello.trim();
		System.out.println(he);
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy");
		String[] date = sdf.format(d).split("-");
		dat = date[0];
		String dat1 = date[1];
		String dat2 = date[2];
		
		int i1 ;
	
		System.out.println(dat+" "+dat1+" "+dat2);
		
		for(String h1 : date)
		{
			System.out.println(h1);
		}
		String con = dat.concat(dat1).concat(dat2);
		System.out.println(con);
		int con1 = Integer.parseInt(con);
		con1++;
		System.out.println(con1);
			
	}

}
