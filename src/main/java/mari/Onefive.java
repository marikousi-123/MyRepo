package mari;

import java.util.Scanner;

public class Onefive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ab=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=ab.nextInt();
		
		if(a%2==0) {
		System.out.println("Even" );
		}
		else {
			System.out.println("odd");
		}
	}

}
