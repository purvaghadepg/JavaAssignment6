package javaAssignment6;
//3.Utilize an abstract class named Animal, featuring abstract methods 
//sound() and move(), to design concrete subclasses such as Dog, Cat, 
//and Bird that inherit from Animal and implement the necessary methods?

abstract class Animal {
	
	abstract public void sound();
	abstract public void move();


	public void classInfo(String type) {
		System.out.println("I belong to " + type + " class");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("The dog is barks..");
	}
	public void move() {
		System.out.println("Dog move with 4 legs");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("The cat is meow..");
	}
	public void move() {
		System.out.println("Cat move with 4 legs");
	}
}
class Bird extends Animal{
	public void sound() {
		System.out.println("The bird is tweet..");
	}
	public void move() {
		System.out.println("Birds are flying!");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.classInfo("Dog");
		d.sound();
		d.move();
		System.out.println("----------------------------------");
		Cat c=new Cat();
		c.classInfo("Cat");
		c.sound();
		c.move();
		System.out.println("----------------------------------");
		Bird b=new Bird();
		b.classInfo("Bird");
		b.sound();
		b.move();
		System.out.println("----------------------------------");

	}

}