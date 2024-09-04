package mari;

interface Manimall{
	void bark();
	
}

class Manimal implements Manimall{
	public void bark() {
		System.out.println(" dhudh");
	}
	public void speak() {
		System.out.println("Dog is barking");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manimal m=new Manimal();
		m.bark();
		m.speak();
		

	}

}
