import java.util.Scanner;
class vowels{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a letter : ");
		char letter = ob.next().charAt(0);
		
		switch(letter)
		{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':System.out.println("It is a vowel");
			break;
			default:System.out.println("It is not a vowel");
		}
	}
}