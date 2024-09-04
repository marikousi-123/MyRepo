package mari;

abstract class Instrument{
	public abstract void play() ;
	public abstract void tune();
}

class Glockenspeil extends Instrument{
	public void play() {
		System.out.println(" hhhhhh");
	}
	public void tune() {
		System.out.println(" ssssss");
	}
}

class Violin extends Instrument{
	public void play() {
		System.out.println("kkkk");
	}
	public void tune() {
		System.out.println("fff ");
	}
}
public class Insabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Glockenspeil g=new Glockenspeil();
		Violin v=new Violin();
		g.play();
		g.tune();
		v.play();
		v.tune();
	}

}
