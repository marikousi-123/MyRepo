package mari;

public class FactFun {
	
	public void fun(){
	int a=1;
	int i;
	
	for(i=1;i<=5;i++)
	{
		a=a*i;
	
	}
	System.out.println("Factorial of a is: " +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactFun f=new FactFun();
			f.fun();	

	}

}
