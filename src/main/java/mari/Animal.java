package mari;

public class Animal {
	
	String type;
	String species;
	int count;
	
	Animal(String type, String species){
		this.type=type;
		this.species=species;
		
	}
	
	Animal(String type, String species, int count){
		this.type=type;
		this.species=species;
		this.count=count;
	}

		void display() {
			System.out.println(type + " " + species+ " "+ count);
			
		}
		public static void main(String[] args) {

		Animal s1=new Animal("Wild Animal", "lion");
		Animal s2=new Animal("domestic", "dog", 5);
		s1.display();
		s2.display();
	}

}
