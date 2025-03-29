import java.util.Scanner;
class Ex2{
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter the number1 :");
		int num1 = x.nextInt();
		
		System.out.println("Enter the number2 :");
		int num2 = x.nextInt();
		
		System.out.println("Enter the number3 :");
		int num3 = x.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Maximum number is : "+num1);
			}
			else
			{
				System.out.println("Maximum number is : "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("Maximum number is : "+num2);
			}
			else
			{
				System.out.println("Maximum number is : "+num3);
			}
		}
	}
}