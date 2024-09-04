package mari;

/*Write a Java program to create a class called Person 
with private instance variables name, age. and country. 
Provide public getter and setter methods to access and modify these variables.*/

class Worker{
	private String name;
	private int age;
	private String country;
	
	public String getName() {
	return name;
}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setCountry(String country) {
		this.country=country;
	}
}
public class Encapro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Worker n=new Worker();
		n.setName("Meera");
		n.setAge(25);
		n.setCountry("Kanyakumari");
		System.out.println("Name : " +n.getName());
		System.out.println("Age : " +n.getAge());
		System.out.println("country : " + n.getCountry());
	}

}
