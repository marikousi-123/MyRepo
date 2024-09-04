package mari;

class Student{
	int rollno;
	String name;
	void travelDistance(int r, String n) {
		rollno=r;
		name=n;
	}
	void siplayInformation() {
		System.out.println(rollno+ " " +name);
	}
}
 class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student s1=new Student();
   Student s2=new Student();
  
   s1.travelDistance(111,"karan");
   s2.travelDistance(222,"karna");
   s1.siplayInformation();
   s2.siplayInformation();
   
	}

}
