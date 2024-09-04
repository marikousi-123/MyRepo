package mari;

abstract class Pple{
	public abstract void eat() ;
	public abstract void exercise();
	}

class athlete extends Pple{
	public void eat() {
		System.out.println("Athlete person eats light");
	}
	public void exercise() {
		System.out.println(" Athlete person exercise daily");
	}
	
}

class LazyPerson extends Pple{
	public void eat() {
		System.out.println("Lazy person eats irregula");
	}
	public void exercise() {
		System.out.println("Lazy Person wont exercise");
	}
}

public class Pplabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		athlete a=new athlete();
		LazyPerson l=new LazyPerson();
		a.eat();
		a.exercise();
		l.eat();
		l.exercise();
		
	}

}
