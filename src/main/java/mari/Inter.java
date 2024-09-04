package mari;

interface printable {
	void print();
}

class a1 implements printable{
	public void print()
	{
		System.out.println("Hello");
	}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
a1 ob=new a1();
ob.print();

		
	}

}
