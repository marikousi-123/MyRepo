package mari;

public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}

	void display() {
		System.out.println(name+" "+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1=new Person("Mari", 18);
		Person p2=new Person("vinaya", 100);
		p1.display();
		p2.display();
	}

}
