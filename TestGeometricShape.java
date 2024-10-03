package javaAssignment6;

abstract class GeometricShape {

	final double PI = 3.14;



	abstract public void area();



	abstract public void perimeter();

}



class Circle extends GeometricShape {



	private int radius;



	public void setRadius(int radius) {

		this.radius = radius;

	}



	public void area() {

		System.out.println("Area of Circle" + PI * radius * radius);

	}



	public void perimeter() {

		System.out.println("Perimeter of cirle is" + 2 * PI * radius);

	}



}



class Rectangle extends GeometricShape {



	private int a, b;



	public void setA(int a) {

		this.a = a;

	}



	public void setB(int b) {

		this.b = b;

	}



	public void area() {

		System.out.println("Area of rectangle is" + a * b);

	}



	public void perimeter() {

		System.out.println("Perimeter of rectangle" + (2 * a + 2 * b));

	}



}



class Triangle extends GeometricShape {

	private int a, b, c;

	private int h;

	



	public void setSides(int a,int b,int c,int h) {

		this.a = a;

	}



	public void area() {

		System.out.println("Area of Triangle"+((b*h)/2));

	}



	public void perimeter() {

		System.out.println("Perimeter of Triangle" + (a + b + c));

	}



}



public class TestGeometricShape {



	public static void main(String[] args) {



		Circle circle = new Circle();

		circle.setRadius(4);

		circle.area();

		circle.perimeter();



		Rectangle rect = new Rectangle();

		rect.setA(5);

		rect.setB(6);

		rect.area();

		rect.perimeter();



		Triangle triangle = new Triangle();

		triangle.setSides(4,6,7,6);

		triangle.area();

		triangle.perimeter();

	}

}