package mari;

/*Write a Java program to create a class called Circle with a private instance variable radius.
Provide public getter and setter methods to access and modify the radius variable. 
However, provide two methods called calculateArea() and calculatePerimeter()
that return the calculated area and perimeter based on the current radius value.*/

//class Circle{
//	private int radius;
//	
//	public int getRadius() {
//		return radius;
//	}
//	
//	public void setRadius(int radius) {
//		this.radius=radius;
//	}
//	void calculateArea() {
//		System.out.println(" Area of Circle is : " +3.14 * radius*radius);
//	}
//	
//	void calculatePerimeter() {
//		System.out.println(" Perimeter of Circle is : " + 2*3.14*radius);
//	}
//}
//
//
//	
//
//
//public class Encap3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Circle c=new Circle();
//		c.setRadius(3);
//		c.calculateArea();
//		c.calculatePerimeter();
//		
//	}
//
//}


/*Write a Java program to create a class called Car with private instance variables company_name, 
model_name, year, and mileage. Provide public getter and setter methods to access 
and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.*/

class Cars {
	private String companyname;
	private String modelname;
	private int year;
	private int mileage;
	
	public String getCompanyName() {
		return companyname;
	}
	
	public String getModelName() {
		return modelname;
	}
	
	public int getYear() {
		return year;
	}
	public int getMileage() {
		return mileage;
	}
	
	public void setCompanyName(String companyname) {
	this.companyname=companyname;	
	}
	
	public void setModelName(String modelname) {
		this.modelname=modelname;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	
	
}

public class Encap3{
	public static void main(String args[]) {
		Cars car=new Cars();
		car.setCompanyName("nnn");
		car.setModelName("kkk");
		car.setYear(5432);
		
		System.out.println("Car name is : " + car.getCompanyName());
		System.out.println("Model name is : " + car.getModelName());
		System.out.println("Year name is : " + car.getYear());
	}
}