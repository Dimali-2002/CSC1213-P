import java.util.Scanner;
class count{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		char answer =' ';
		int sumeven = 0;
		int sumodd = 0;
		int counteven = 0;
		int countodd = 0;
		
		do
		{
			System.out.println("Enter the number : ");
			int num = ob.nextInt();
			
			if(num%2==0)
			{
				sumeven = sumeven + num;
				counteven++;
			}
			else
			{
				sumodd = sumodd + num;
				countodd++;
			}
			
			System.out.println("Do you want to continue(Y/N) : ");
			answer = ob.next().charAt(0);
			
		}while(answer=='Y' || answer=='y');
		
		System.out.println("Count of even numbers : "+counteven);
		System.out.println("Summation of even numbers : "+sumeven);
		System.out.println("Count of odd numbers : "+countodd);
		System.out.println("Summation of odd numbers : "+sumodd);
	}	
}