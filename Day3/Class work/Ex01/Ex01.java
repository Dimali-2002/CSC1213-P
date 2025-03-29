import java.util.Scanner;
class Ex01{
	public static void main(String args[]){
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = x.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive");
		}
		else if(num<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}