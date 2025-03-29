import java.util.Scanner;
public class Star{
	public static void main(String[] args){
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = ob.nextInt();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}