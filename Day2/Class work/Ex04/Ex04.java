import java.util.Scanner;
class Ex04{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter  your First Name : ");
		fname = sc.nextLine();
		
		System.out.println("Enter  your Last Name : ");
		String lname = sc.next();
		
		System.out.println("Enter  your Age : ");
		int age=sc.nextInt();
		
		System.out.println("Enter  your Reg No : ");
		String RegNo=sc.next();
		
		System.out.println("Enter  your Gender(F/M) : ");
		char sex=sc.next().charAt(0);
		
		System.out.println("Enter  your Mobile No : ");
		long MobileNo=sc.nextLong();
		
		System.out.println("Enter  your GPA : ");
		double GPA=sc.nextDouble();
		
		System.out.println("Fullname :"+fname+" "+lname+"\n"+"Age is :"+age+"\n"+"Reg No :"+RegNo+"\n"+"Gender :"+sex+"\n"+"Mobile : "+MobileNo+"\n"+"GPA : "+GPA);
	}
}