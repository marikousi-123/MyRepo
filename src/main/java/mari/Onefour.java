package mari;

import java.util.Scanner;
public class Onefour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter first number: ");
		a=ab.nextInt();
		System.out.println("Enter Second number: ");
		b=ab.nextInt();
		System.out.println("Enter Third number: ");
		c=ab.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Largest number is :" +a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest number is : "+b);
		}
		else {
		System.out.println("Largest number is :" +c);
		}
	}

}
