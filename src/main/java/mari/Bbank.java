package mari;

abstract class BbankAccount{
	public abstract void deposit();
	public abstract void withdraw();
}

class SavingssAccount extends BbankAccount{
	public void deposit() {
		System.out.println(" Deposited Amount is ");
	}
	public void withdraw() {
		System.out.println("Withdraw amount is ");
	}
}

class CurrentAccount extends BbankAccount{
	public void deposit() {
		System.out.println(" Deposited Amount is ");
	}
	public void withdraw() {
		System.out.println("Withdraw amount is ");
	}
}

public class Bbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingssAccount s=new SavingssAccount();
		CurrentAccount c=new CurrentAccount();
		s.deposit();
		s.withdraw();
		c.deposit();
		c.withdraw();

	}

}
