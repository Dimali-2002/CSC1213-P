interface FirstInterface{
	public void mymethod();
}
interface SecondInterface{
	public void myothermethod();
}
class Democlass implements FirstInterface, SecondInterface{
	public void mymethod()
	{
		System.out.println("Some text...");
	}
	public void myothermethod()
	{
		System.out.println("Some other text...");
	}
}
class Main4{
	public static void main(String args[])
	{
		Democlass myobj = new Democlass();
		myobj.mymethod();
		myobj.myothermethod();
	}
}