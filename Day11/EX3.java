//11 12 13
class Animal{
	void sound(){
		System.out.println("Animals make sounds");
	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("Dog: BOW BOW");
	}
}

class Vehicle{
	String brand = "BMW";
	void honk(){
		System.out.println("Beep Beep");
	}
}
class Car extends Vehicle{
	double speed = 125.5;
}

class Person{
    public Person() {
        System.out.println("Perosn constructor");
    }
}
class Student extends Person {
    public Student() {
        super();  // Calls Person's constructor
        System.out.println("Student constructor");
    }
}



class EX3{
	public static void main(String[] args){
		Dog d1 =new Dog();
		d1.sound();
		
		Car c1 = new Car();
		System.out.println(c1.brand + " " + c1.speed);
		c1.honk();
		
		Student s1 = new Student();
	}
}
