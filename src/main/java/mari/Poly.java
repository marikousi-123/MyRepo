package mari;

class Multiply{
	void Mul(int a, int b) {
		System.out.println("Product of two=" +(a*b));
	}
		
	void Tip(int a, int b, int c) {
		System.out.println("Product of three=" +(a*b*c));
	}
}

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multiply m=new Multiply();
		m.Mul(2,5);
		m.Tip(5,2, 2);
	}
}

//class Anime{
//	public void animeSound() {
//		System.out.println("Animals makes Sound ");
//	}
//	
//}
//
//class pig extends Anime{
//	public void animeSound() {
//		System.out.println("Pig says : wee wee");
//	}
//}
//class Puppy extends Anime{
//	public void animeSound() {
//		System.out.println("Dog says : bow bow");
//	}
//}
//
//public class Poly{
//	public static void main(String args[]) {
//		Puppy d=new Puppy();
//		d.animeSound();
//	}
//}