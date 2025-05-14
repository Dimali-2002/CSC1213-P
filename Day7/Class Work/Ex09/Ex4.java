public class Ex4{
	static int factorial(int number)
	{
		int result = 1;
		for (int i=1; i<=number; i++)
		{
			result*=i;
		}
		return result;
	}
	public static void main(String args[])
	{
		int num = 5;
		int fact = factorial(num);
		System.out.println(num + "! = "+ fact);
	}
}