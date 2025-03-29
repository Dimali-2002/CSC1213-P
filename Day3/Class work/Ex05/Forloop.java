 import java.util.Scanner;
class Forloop{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = ob.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			System.out.print(i+"\t");
		}
	}
}