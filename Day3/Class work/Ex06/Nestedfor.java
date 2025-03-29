import java.util.Scanner;
class Nestedfor{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value for counter 01 : ");
		int counter1 = ob.nextInt();
		System.out.println("Enter the value for counter 02 : ");
		int counter2 = ob.nextInt();
		
		for(int i=0; i<counter1; i++)
		{
			System.out.println("Value for i : "+i);
			
			for(int j=0; j<counter2; j++)
			{
				System.out.print("Value for j : "+j+" ");
			}
			System.out.println( );
		}
	}
}