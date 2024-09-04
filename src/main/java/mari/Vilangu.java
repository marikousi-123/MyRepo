package mari;

///*1. Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
// Create two subclasses Bird and Cat. Override the Sound() method 
// in each subclass to make a specific sound for each animal.*/

//class AnimalFam{
//	void Sound() {
//		System.out.println("All Animals make Sound");
//	}
//}
//
//class Bird extends AnimalFam{
//	void Sound() {
//		System.out.println("Birds say ki ki");
//	}
//}
//
//class Kitten extends AnimalFam{
//	void Sound() {
//		System.out.println("cat says meow meow");
//	}
//}
//
//public class Vilangu {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Kitten c=new Kitten();
//		Bird b=new Bird();
//		AnimalFam af=new AnimalFam();
//		c.Sound();
//		b.Sound();
//		af.Sound();
//	}
//}

//2. Write a Java program to create a class Vehicle with a method called speedUp().
//Create two subclasses Car and  Bicycle.
//Override the speedUp() method in each subclass to increase the vehicle's speed differently.

//class Vehicles {
//	void speedUp() {
//		System.out.println("Vehicles are differentiated by their Speed");
//	}
//}
//class Cars extends Vehicles{
//	void speedUp() {
//		System.out.println("Car is very speed");
//	}
//}
//class Bicycle extends Vehicles{
//	void speedUp() {
//		System.out.println("Bicycle is not speed");
//	}
//}
//public class Vilangu{
//	public static void main(String args[]) {
//		Cars c=new Cars();
//		c.speedUp();
//		Bicycle b=new Bicycle();
//		b.speedUp();
//	}
//}

/*3. Write a Java program to create a class Shape with methods getArea() and getPerimeter().
Create three subclasses: Circle, Rectangle, and Triangle.
Override the getArea() and getPerimeter() methods in each subclass to calculate
and return the area and perimeter of the respective shapes.*/


//class Shape{
//	void getArea() {
//		System.out.println(" Area ");
//	}
//	void getPerimeter() {
//	  System.out.println(" Perimeter of shapes"); 
//   }}
//
//class Circle extends Shape{
//		void getArea(int r) {
//			System.out.println("Area of a  is:" +3.14* r);
//		}
//		void getPerimeter(int r) {
//			  System.out.println(" Perimeter of a circle is:" +2*3.14*r); 
//		   }}
//	
//class Rectangle extends Shape{
//	void getArea(int b, int h) {
//		System.out.println(" Area of a  is:" +b*h);
//	}
//	void getPerimeter(int b,int h) {
//		  System.out.println(" Perimeter of a circle is:" +(2*b)*(2*h)); 
//	   }}
//
//class Triangle extends Shape{
//	void getArea(int b, int h) {
//		System.out.println("Area of a  is:" +1/2*b*h);
//	}
//	void getPerimeter(int a,int b,int c) {
//		  System.out.println(" Perimeter of a circle is:" +a*b*c); 
//	   }}
//
//public class Vilangu{
//	public static void main(String args[]) {
//		Triangle t=new Triangle();
//		t.getArea(3,3);
//		t.getPerimeter(3,3,3);
//		
//		Rectangle r=new Rectangle();
//		r.getArea(3,3);
//		r.getPerimeter(3,3);
//		
//		Circle c=new Circle();
//		c.getArea(6);
//		c.getPerimeter(6);
//	}}	


class vilagu{
	void move() {
		System.out.println("All animals can move");
	}
	void makeSound() {
		System.out.println("   All animals can make Sound");
	}
}

class bird extends vilagu{
	void move() {
		System.out.println("     Birds can fly");
	}
	void makeSound() {
		System.out.println("       Birds can chirp");
	}
}

class panther extends vilagu{
	void move() {
		System.out.println("         Panther can walk");
	}
	void makeSound() {
		System.out.println("           Panther can make sound");
	}
}

public class Vilangu{
	public static void main(String args[]) {
		vilagu v=new vilagu();
		v.move();
		v.makeSound();
		
		bird b=new bird();
		b.move();
		b.makeSound();
		
		panther pr=new panther();
		pr.move();
		pr.makeSound();
	}
}