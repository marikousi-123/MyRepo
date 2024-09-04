package mari;

import java.util.Scanner;

public class Fibsca {


	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=a.nextInt();
	int n1=0,n2=1,n3;
	
		
		for(int i=0;i<=n;i++) 
		{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);

		}

	

	
}
}