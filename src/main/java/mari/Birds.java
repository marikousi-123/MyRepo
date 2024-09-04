package mari;

abstract class brds{
	public abstract void makeSound();
	public abstract void fly();
	}
 class Eagle extends brds{
	 public void makeSound() {
	 System.out.println("Eagles makes sound");
 }
 public void fly() {
	 System.out.println("Eagles fly high");
 }}

class Hawk extends brds{
	 public void makeSound() {
		 System.out.println("hawk makes sound");
	 }
	 public void fly() {
		 System.out.println("hawk does not fly high");
	 }
	 }
public class Birds{
	public static void main(String[] args) {
		Eagle e=new Eagle();
		Hawk h=new Hawk();
		e.makeSound();
		e.fly();
	}
}

	



