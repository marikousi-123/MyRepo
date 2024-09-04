package mari;

public class Sample1 {
	
//	public void display() {
//		int a=10, b=5;
//		System.out.println("Welcome User");
//		System.out.println(a+b);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Sample1 a=new Sample1();
//		a.display();
	

		
		public void add(int a, int b) {
			System.out.println(a+b);
			
		}
		public int f(int a, int b) {
			return a+b;
		}
		public static void main(String[] args) {
			
		Sample1 a=new Sample1();
		a.add(3, 5);
	System.out.println(a.f(4, 7));
	
		
		}}