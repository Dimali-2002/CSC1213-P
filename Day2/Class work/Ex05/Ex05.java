import java.util.Scanner;
class Ex05{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=ob.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number ");
		}
	}
}