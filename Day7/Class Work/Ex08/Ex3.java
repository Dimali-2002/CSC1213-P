public class Ex3{
	static void checkVotingEligibility(int age)
	{
		if(age >= 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
	public static void main(String args[])
	{
	checkVotingEligibility(20);
	checkVotingEligibility(16);
	}
} 