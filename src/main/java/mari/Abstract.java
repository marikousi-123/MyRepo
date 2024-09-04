package mari;

	abstract class Monster{
		public abstract void makeSound();
	}
	
	class donkey extends Monster{
		public void makeSound() {
			System.out.println("bark");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		donkey t=new donkey();
		t.makeSound();
	}

}
