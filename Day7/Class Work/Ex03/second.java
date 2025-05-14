public class second{
	static int square(int num)
	{
		return num*num;
	}
	public static void main(String args[])
	{
		int result = square(4);
		System.out.println("Square : "+ result);
		System.out.println("Square : "+ square(5));
	}
}