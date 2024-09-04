package mari;

abstract class Amal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("All Animals are slpeeing");
	}
}

class Cat extends Amal{
	public void animalSound() {
		System.out.println("Pigs are sleeping");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat g=new Cat();
		g.animalSound();
		g.sleep();
	}

}
