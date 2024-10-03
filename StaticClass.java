package javaAssignment6;

//4.    Suppose a class 'A' has a static method to print "Parent". 
//Its subclass 'B' also has a static method with the same name to print "Child". 
//Now call this method by the objects of the two classes. Also, call this method 
//by an object of the parent class referring to the child class i.e. A obj=new B()

class A{
	public static void print() {
		System.out.println("Parent");
	}
}
class B extends A{
	public static void print() {
		System.out.println("Child");
	}
}
public class StaticClass {

	public static void main(String[] args) {
		
		A obj=new B();
		A.print();
		System.out.println("--------------------------");
		B.print();

	}

}