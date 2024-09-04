package mari;

//java Final variable

//class Bike{
//	final int speedlimit=90;
//	void run() {
//		speedlimit=300;
//	}
//}
//
//public class Finaluse {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Bike b=new Bike();
//		b.run();
//	}
//
//}


//java final method
//
//class Bike{
//	final void run() {
//		System.out.println(" running");
//		
//	}
//	
//	class Honda extends Bike{
//		void run() {
//			System.out.println("running safely");
//		}
//	}
//	public class Finaluse{
//		public static void main(String[] args) {
//			Honda h=new Honda();
//			h.run();
//		}
//	}
//}


//java final class

final class Bike{
	class Honda extends Bike{
		void run() {
		System.out.println(" run safely");
		}}
		public class Finaluse{
			public static void main(String[] args) {
				Honda h=new Honda();
				h.run();
		
	}
		}}
