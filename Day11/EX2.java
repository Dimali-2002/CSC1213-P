//6 7 8 9 10
class Rectangle{
	void area(int x, int y){
		System.out.println(x*y);
	}
}

class DefVal{
	int defaultInt;
	String defaultString;
}

class Person{
	private String name;
	
	public String getName(){
		return name;
	}
	public void setName(String n){
		this.name = n;
	}
}

class Calc{
	int add(int a, int b){
		return a+b;
	}
}

//10
class NoConstructor{
	int n1;
	String s1;
}

class EX2{
	public static void main(String[] args){
		Rectangle myRec = new Rectangle();
		myRec.area(4,5);
		
		DefVal d1 = new DefVal();
		System.out.println("Default int: "+d1.defaultInt);
		System.out.println("Default String: "+d1.defaultString);
		
		Person p1 =new Person();
		p1.setName("Kulani");
		System.out.println("My name: " + p1.getName());
		
		Calc c1 = new Calc();
		System.out.println("Addition: " + c1.add(2,3));
		
		NoConstructor ob = new NoConstructor();
		System.out.println("int: "+ ob.n1);
		System.out.println("string: "+ ob.s1);
	}
}