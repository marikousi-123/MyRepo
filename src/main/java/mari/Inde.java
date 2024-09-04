package mari;

import java.util.Scanner;

public class Inde {
//	1java method to compute the average of 3 nums
//	public void avg() {
//		System.out.println();
//	}
//	
//	public void aver(float a, float b,float c) {
//		float sum= a+b+c;
//		float result=sum/3;
//	System.out.println(result);
//			
//		}
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Inde i=new Inde();
//		i.aver(2.5f,3.2f,5.5f);
//
//	}

//	2method that returns the product of 2 nums entered by user
	/*	public void pro() {
		System.out.println();

	}
	public void pros() {
		Scanner prt=new Scanner(System.in);
		System.out.println("Enter First Number :");
	    int a=prt.nextInt();
	    System.out.println("Enter Second Number :");
	    int b=prt.nextInt();
		int c=a*b;
		System.out.println("Result is : " +c);

//		int product=a*b;
//		System.out.println(product);
	}
	public static void main(String args[]) {
		Inde o=new Inde();
		o.pros();
	}
	*/
	
	//3method to check whether a string is a valid password:
	//password rules:
		//must have 10 characters ; consists of only letters and digts ; 
	public void pass() {
		System.out.println();
	}
	
	public void pwd() {
		
		Scanner pd=new Scanner(System.in);
		System.out.println("Enter the Password :");
		String a=pd.nextLine();
		System.out.println("Repeat Password :");
	    String b=pd.nextLine();
	  //  String nwpd=pd.nextLine();
	    
	    if(a.length()==10) {
	    	System.out.println("Passsword is Valid");
	    }
	    else {
	    	System.out.println("Password is InValid");
	    }
		
	}
	public static void main(String args[]) {
		Inde c=new Inde();
		c.pwd();
		c.pass();
		System.out.println();
	}

}
