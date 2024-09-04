package mari;

class People{
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
public class Encapeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People pr=new People();
		pr.setName("Meera");
		People r=new People();
		r.setName("vinaya");
		
		System.out.println("Name : " +pr.getName());
		System.out.println("Name : " +r.getName());
		
	}

}
