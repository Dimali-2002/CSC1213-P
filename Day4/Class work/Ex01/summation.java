import java.util.Scanner;
class summation{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = ob.nextInt();
		int num2 = 1;
		int sum = 0;
		
		while(num2<=num1)
		{
			sum = sum + num2;
			num2++;
		}
		System.out.println("Summation of numbers from 0 to "+num1+" : "+sum);
	}
}