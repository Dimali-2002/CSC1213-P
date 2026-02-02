//16 17 18 19
class Animal{
	void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
	void bark(){System.out.println("barking...");}
}
class Puppy extends Dog{
	void weep(){System.out.println("weeping...");}
}

class A{
	void display(){System.out.println("Parent method");}
}
class B extends A{
	void display(){System.out.println("Child method");}
}

class Bank{
	int interest(){return 0;}
}
class BOC extends Bank{
	int interest(){return 5;}
}
class HNB extends Bank{
	int interest(){return 8;}
}

class Shape{
	double area(){return 0;}
}
class Circle extends Shape{
	double area(double r){
		return 3.14*r*r;
	}
}
class Square extends Shape{
	double area(double s){
		return s*s;
	}
}

class EX5{
	public static void main(String[] args){
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weep();
		
		A a = new A();
		a.display();
		
		BOC b = new BOC();
		HNB h = new HNB();
		System.out.println("BOC: " + b.interest());
		System.out.println("HNB: " + h.interest());
		
		Circle c = new Circle();
		Square s = new Square();
		System.out.println("Area of Circle: " + c.area(5));
		System.out.println("Area of Square: " + s.area(4));
	}
}