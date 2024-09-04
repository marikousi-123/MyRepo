package mari;

interface Flyable {
	void fly_obj();
	
}
	class Spacecraft implements Flyable {
		public void fly_obj() {
			System.out.println(" aaaa");
	}
		
		class Airplane implements Flyable{
			public void fly_obj() {
				System.out.println("bbbb");
			}
		}
		class Helicopter implements Flyable{
			public void fly_obj() {
				System.out.println("cccc");
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Spacecraft s=new Spacecraft();
		s.fly_obj();

	}

}
	
	
	

