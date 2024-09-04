package mari;

  class Employee{
public void work() {
	System.out.println("Employee is working");
}
public void getSalary() {
	System.out.println("he gets salry every month");
}
 }
class HRManager extends Employee{
	public void work() {
		System.out.println("Employee");
	}
	void addEmployee() {
		System.out.println("added employee");
	}
}
public class Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HRManager em=new HRManager();
		em.work();
		em.getSalary();
		em.addEmployee();	}

}
