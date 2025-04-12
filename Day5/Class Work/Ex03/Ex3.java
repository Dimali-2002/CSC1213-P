import java.util.Scanner;
public class Ex3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		for(int i=0; i<5; i++){
			System.out.print("Enter the number "+(i+1)+" :");
			numbers[i]=sc.nextInt();
		}
		
		int max=numbers[0];
		int min=numbers[0];
		for(int i=0; i<5; i++){
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
			
			if(numbers[i]<min)
			{
				min=numbers[i];
			} 
		}
			System.out.println("The minimum number is:" +min);
			System.out.println("The maximum number is :"+max);
			
	}
}