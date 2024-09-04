package mari;


	
	interface Shape{
		void getArea();
	}

	class Rectangler implements Shape{
		public void getArea() {
			System.out.println(" square has 4 edges");
		}
	}
	class Circle implements Shape{
		public void getArea() {
			System.out.println(" circle has no edges ");
		}
	}
	class Triangle implements Shape{
		public void getArea() {
			System.out.println(" triangle has 3 edges");
		}
	}
		
		public class Square {	


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		Rectangler sh=new Rectangler();
			sh.getArea();

		}
		
		

}
