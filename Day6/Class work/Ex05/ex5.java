import java.util.Scanner;
class ex5{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int row = ob.nextInt();
		System.out.print("Enter the column size : ");
		int column = ob.nextInt();
		int marks[][] = new int[row][column];
		int sum=0;
		int max=marks[0][0];
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter the value : ");
				marks[i][j] = ob.nextInt();
				sum=sum+marks[i][j];
				
				if(max<marks[i][j])
				{
					max=marks[i][j];
				}
			}
		}
		System.out.println("The sum : "+sum);
		System.out.println("The maximum value : "+max);
	}
}