import java.util.Scanner;
class Array{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		int Integers[] = new int[10];
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Enter the number "+(i+1));
			Integers[i] = ob.nextInt();
		}
		for(int i=0; i<10; i++)
		{
			System.out.print(Integers[i]+" ");
		}
		System.out.println("\t ");
		
		String days[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(int i=0; i<7; i++)
		{
			System.out.print(days[i]+" ");
		}
	}
}