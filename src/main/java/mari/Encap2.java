package mari;

/*Write a Java program to create a class called Rectangle with private instance variables length and width. 
Provide public getter and setter methods to access and modify these variables.*/

class Rectangle{
	private int length;
	private int width;
	private int perimeter;

	
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	
	public int getPerimeter() {
		return perimeter;
		
	}
	
	public void setLenth(int length) {
		this.length=length;
		
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	public void setPerimeter(int length,int width) {
		this.length=length;
		this.width=width;
		perimeter=2*(length+width);
		
	}
	
}

public class Encap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r=new Rectangle();
		r.setPerimeter(4,5);
		
		
		System.out.println("Perimeter : " +r.getPerimeter());
		
		
	}

}
