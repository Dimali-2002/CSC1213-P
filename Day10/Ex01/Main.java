class Animal
{
	public void animalsound()
	{
		System.out.println("The animal makes a sound");
	}
}
class Pig extends Animal
{
	public void animalsound()
	{
		System.out.println("The pig says: wee wee");
	}
}
class Dog extends Animal
{
	public void animalsound()
	{
		System.out.println("The dog says: bow wow");
	}
}
class Main
{
	public static void main(String args[])
	{
		Animal myanimal = new Animal();
		Pig mypig = new Pig();
		Dog mydog = new Dog();
		
		myanimal.animalsound();
		mypig.animalsound();
		mydog.animalsound();
	}
}