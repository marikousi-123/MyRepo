package mari;
//multilvl
class Eagle{
	
	public void food() {
 System.out.println(" Eagle's food is Snake");
}
}

class Snake extends Eagle{
	public void foods() {
		System.out.println("Snake's food is Frog");
	}
}

class Frog extends Snake{
	public void fds() {
		System.out.println("Frogs food is insect");
	}
}
public class nnnn {
	public static void main(String args[]) {

	Frog s=new Frog();
	s.food();
	s.foods();
	s.fds();
}
}