package mari;

abstract class Vehicle{
	public abstract void drive();
	
}
class car extends Vehicle{
	public void drive() {
		System.out.println(" Repairing a car");
	}
}


public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c=new car();
		c.drive();

	}

}
