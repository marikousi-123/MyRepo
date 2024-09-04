package mari;

public class Constrct {

	
		
		int id;
		String name;
		int salary;
		
		Constrct(int i, String n){
			id=i;
			name=n;
		}
		
		Constrct(int i, String n, int s){
			id=i;
			name=n;
			salary=s;
		}

		void show() {
			System.out.println(id + " "+name+" "+salary);
		}
		public static void main(String args[]) {
			Constrct c1=new Constrct(1, "AAA");
			Constrct c2=new Constrct(2, "BBB", 50000);
			c1.show();
			c2.show();
		}
	}


