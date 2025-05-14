class Student{
	int id;
	String name;
	
	public Student(int x, String y)
	{
		this.id = x;
		this.name = y;
	}
}
class TestStudent{
	public static void main(String args[])
	{
		Student s1 = new Student(01,"Pavani");
		System.out.println(s1.id+" "+s1.name);
	}
}