package mari;

public class Operators {
	
public static void main(String[] args) {
	
	int a=5;
	
	System.out.println(a++);
	System.out.println(++a);
	System.out.println(a--);
	System.out.println(a--);
	
	System.out.println(10<<2);
	System.out.println(20<<3);
	
	int b=30;
	int c=25;
	int d=5;
	
	System.out.println(b>c && b>d);
	System.out.println(b>c || b>d);
	System.out.println(!(a>b));
	
	System.out.println(d=a+b);
	System.out.println(a+=2);
	
	int min=(c>b) ? c:b;
	
	System.out.println(min);
	
	System.out.println(11 | 5);
	System.out.println(10& 2);
	
	
	
	
	
	
}
}
