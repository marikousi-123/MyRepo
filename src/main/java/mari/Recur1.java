package mari;

public class Recur1 {
//	static int count=0;
//	static void s(){
//		count++;
//		if(count<=5) {
//			System.out.println("hello "+count);
//			s();
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		s();
	
	static int a=0;
	static int b=1;
	static int count=0;
	
	static void fibo() {
		count++;
		if(count<=10) {

			int c=a+b;
			a=b;
			b=c;
			System.out.println(a);
			fibo();
		}
	
	}

public static void main(String[] args) {
	fibo();
}
}
