package mari;
//hybrid inheritance
class Amimal{
	public void play() {
		System.out.println("Animal is happy");
		
	}

}

class buffalow extends Amimal{
	public void bite() {
		System.out.println("dog is biting");
		}
}

class cat extends Amimal{
	public void kick() {
		System.out.println("cat is kicking");
	}
}

class pet extends buffalow{
	public void eat() {
		System.out.println("ept is eating");
	}
}


public class Hiechical {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pet pet=new pet();
		
		
		pet.play();
		pet.bite();
		
		pet.eat();
		
	}
}