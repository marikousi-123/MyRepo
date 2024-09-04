package mari;

public class Samples {

		
//		public void one(String name, int age) {
//		System.out.println("hi " +name+" your age is "+age);
//		
//		}
//		
//		public void add() {
//			
//		}
//		public static void main(String args[]) {
//			
//			Samples n=new Samples();
//			n.one("aparna",12);
//		}
		
//	find the smallest num among 3 nums
		
		public void small() {
			System.out.println("Smallest of three Numbers is: ");
		
		}
		
		public void h(int a, int b, int c) {
			if(a<b && a<c) {
				System.out.println("Smallest Number is :" +a);
		}
			else if(b<a && b<c) {
				System.out.println("Smallest number is :"+b);
			}
			else {
				System.out.println("Smallest number is :"+c);
			}
		}
		public static void main(String args[]) {
						
			Samples h=new Samples();
			h.h(5,8,2);
		
				}

			
		}
	
