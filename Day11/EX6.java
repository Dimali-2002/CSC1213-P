//20
class Parent {
    public int publicVar = 1; //accessible from any other class
    protected int protectedVar = 2; //accessible from the same package and subclass
    private int privateVar = 3; //accessible only within the same class
    int defaultVar = 4; // default (package-private), accessible only within the same package

    public void publicMethod() {
        System.out.println("Public method in Parent");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in Parent");
    }

    private void privateMethod() {
        System.out.println("Private method in Parent");
    }

    void defaultMethod() {
        System.out.println("Default method in Parent");
    }
}

class Child extends Parent {
    void accessParentMembers() {
        System.out.println("Accessing from Child class:");

        // Accessing variables
        System.out.println("publicVar = " + publicVar);       //Allowed
        System.out.println("protectedVar = " + protectedVar); //Allowed
        // System.out.println("privateVar = " + privateVar);  //Not allowed
        System.out.println("defaultVar = " + defaultVar);     //Allowed (if in same package)

        // Accessing methods
        publicMethod();       //Allowed
        protectedMethod();    //Allowed
        // privateMethod();   //Not allowed
        defaultMethod();      //Allowed (if in same package)
    }
}

public class EX6 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.accessParentMembers();
    }
}
