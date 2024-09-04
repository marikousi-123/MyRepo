package mari;

public class Dog {
	String name;
	String breed;
	int age;
	
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	
	Dog(String name, String breed,int age)
	{
		this.name=name;
		this.breed=breed;
		this.age=age;
		}
	
	void display() {
		System.out.println(name + " " +breed+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1=new Dog("bruno", "lab");
		Dog d2=new Dog("cocoa", "shit tzu", 2);
		d1.display();
		d2.display();
	}

}
