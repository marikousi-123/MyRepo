package mari;
import java.util.Scanner;

public class Fiboscan {
	public void fib() {
	int a=0;
	int b=1;
	
	for(int i=0;i<=10;i++) {
		int c=a+b;
		a=b;
		b=c;
	}
	System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fiboscan f=new Fiboscan();
//		f.fib();
		
		Scanner a=new Scanner(System.in);
	    System.out.println("Enter the number : " );
	    int b=a.nextInt();
	    Fiboscan f=new Fiboscan();
    	f.fib();

	}

}
