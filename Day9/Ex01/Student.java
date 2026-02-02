class Person{
	private String name;
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		this.name = newName;
	}
}
	
class Student{	
	public static void main(String args[])
	{
		Person ob = new Person();
		ob.setName("Dimali");
		System.out.println(ob.getName());
	}
}