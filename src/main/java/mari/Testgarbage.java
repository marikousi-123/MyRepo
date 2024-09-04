package mari;

public class Testgarbage {
	
	public void finalize() {
		System.out.println("Object is garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testgarbage t1=new Testgarbage();
		Testgarbage t2=new Testgarbage();
		t1=null;
		t2=null;
		System.gc();

	}

}
