package mari;

interface Printable {
	void print();
}

interface Countable{
	void count();
}

class A7 implements Printable,Countable{
	public void print() {
		System.out.println("Hello");
	}
	public void count() {
		System.out.println("Welcome");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A7 ob=new A7();
		ob.print();
		ob.count();

	}

}
