class Details{
	public static void main(String args[])
	{
		String Name,Address,DOB,Sex;
		int Age;
		Name=args[0];
		Address=args[1];
		DOB=args[2];
		Sex=args[3];
		Age=Integer.parseInt(args[4]);
		
	System.out.println("Name : "+Name+"\n"+"Address : "+Address+"\n"+"Date Of Birth : "+DOB+"\n"+"Sex : "+Sex+"\n"+"Age : "+Age);
	
	int a=10;
	int b=a+Age;
	
	System.out.println("Age is : "+b);
	}
}