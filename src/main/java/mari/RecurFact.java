package mari;

public class RecurFact {
	
	static int a=1;
	
	static int count=0;
	
	static void fact() {
		count++;
		
		if(count<=10) 
		
		{
		a=a*count;
		System.out.println(a);
		fact();
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact();
		

	}

}
