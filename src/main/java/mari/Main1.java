package mari;
//sinle
	class An{
		
		public void eat() {
			System.out.println("eating");
		}
	}
	class Do extends An{
		public void bark() {
			System.out.println("barking");
		}
	}
	public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Do d= new Do();
d.bark();
d.eat();
	}

}
