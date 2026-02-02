interface Cookable{
	public void cook();
}
interface Washable{
	public void wash();
}

class SmartOven implements Cookable, Washable{
	public void cook(){
		System.out.println("Cooking food...");
	}
	public void wash(){
		System.out.println("Washing utensils...");
	}
}

class MainClass4{
	public static void main(String[] args){
		SmartOven ob = new SmartOven();
		ob.cook();
		ob.wash();
	}
}