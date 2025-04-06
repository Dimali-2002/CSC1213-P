import java.util.Scanner;
public class Dowhile{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		char answer =' ';
		int sum = 0;
		
		do
		{
			System.out.println("Enter the number to find the summation : ");
			int num = ob.nextInt();
			sum = sum + num;
			
			System.out.println("Do you want to continue(Y/N) : ");
			answer = ob.next().charAt(0);
			
		}
		while(answer=='Y' || answer=='y');
		
		System.out.println("Summation of numbers : "+sum);
	}
}