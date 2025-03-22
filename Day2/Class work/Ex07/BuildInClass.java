import java.util.Date;
import java.util.Random;

public class BuildInClass{
	public static void main(String args[])
	{
		System.out.println(Math.max(5, 10));
		System.out.println(Math.min(3, 9));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.max(5, 10));
		System.out.println(Math.round(7.4));
		
		String name = "Java";
		System.out.println(name.length());// output:4
		System.out.println(name.toUpperCase());// output:JAVA
		
		int Num01 = Integer.parseInt("100");
		double Num02 = Double.parseDouble("45.67");
		System.out.println(Num01+Num02);
		
		Random r = new Random();
		int num = r.nextInt(10);// Gives a random number from 0 to 9
		
		Date d = new Date();
		System.out.println(d);//Current date and time
	}
}