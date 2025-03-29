import java.util.Scanner;
public class divisible{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int Num = ob.nextInt();
		
		if (Num%2==0 && Num%5==0)
		{
			System.out.println("Number is divisible by 2 and 5");
		}else
		{
			System.out.println("Number is not divisible by 2 and 5");
		}
	}
}