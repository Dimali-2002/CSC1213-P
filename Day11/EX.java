//1 2 3 4 5
class Car{
	String brand; 
	double speed;
}
class Book{
	String title;
	String author;
	
	public Book(String t, String a){
		this.title = t;
		this.author = a;
	}
}

class Student{
	String name;
	int age;
	
	public Student(String n){
		this.name = n;
	}
	public Student(String n, int age){
		this.name = n;
		this.age = age;
	}
}

class DisplayMethod{
	public void display(){
		System.out.println("Hi World");
	}
} 

class EX{
	public static void main(String[] args){
		Car myCar = new Car();
		myCar.brand= "BMW";
		myCar.speed = 120;
		System.out.println(myCar.brand + " " + myCar.speed);
		
		Book myBook = new Book("ABC", "XYZ");
		System.out.println(myBook.title+ " "+ myBook.author);
		
		Student s1 = new Student("Kamal");
		Student s2 = new Student("Nimal", 15);
		System.out.println(s1.name);
		System.out.println(s2.name+ " "+ s2.age);
		
		DisplayMethod myDisplay = new DisplayMethod();
		myDisplay.display();
	}
}