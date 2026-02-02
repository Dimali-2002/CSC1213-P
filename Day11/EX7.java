//21 22 23(same as 22) 24(same as 21)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class EX7{
	public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 integers: " + calc.add(10, 20));
        System.out.println("Sum of 3 integers: " + calc.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
		
		Dog myDog = new Dog();
		myDog.sound();
		
		//23
		Animal dog1 = new Dog();
		dog1.sound();
    }
}