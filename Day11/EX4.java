//14 15 
class Animal{
	void eat(){
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("eating bread...");
	}
	void bark(){
		System.out.println("barking...");
	}
	void functions(){
		super.eat();
		bark();
	}
}

class A{
	void display(){
		System.out.println("Hiii...");
	}
}
class B extends A{
	void callDisplay(){
		display();
	}
}

class EX4{
	public static void main(String[] args){
		Dog d1 = new Dog();
		d1.functions();
		
		B b = new B();
		b.callDisplay();
	}
}