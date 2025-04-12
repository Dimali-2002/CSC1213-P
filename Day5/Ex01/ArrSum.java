import java.util.Scanner;
class ArrSum{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int[] integers = new int[5];
		int sum=0;
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the number "+(i+1));
			integers[i]=ob.nextInt();
			sum=sum+integers[i];
		}
		System.out.println("Sum is "+sum);
	}
}