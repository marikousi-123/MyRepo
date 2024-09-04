package mari;

/*write a Java program to create a class called BankAccount 
 with private instance variables accountNumber and balance. 
Provide public getter and setter methods to access and modify these variables.*/

class BankAccounnt{
	private int accountNumber;
	private double balance;


public int getAccountNumber() {
	return accountNumber;
}

public double getBalance() {
	return balance;
}

public void setAccountNumber(int accountNumber){
	this.accountNumber=accountNumber;
}

public void setBalance(double balance) {
	this.balance=balance;
}}
public class Encap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccounnt ba=new BankAccounnt();
		ba.setAccountNumber(100);
		ba.setBalance(1500.1);
		
		System.out.println("Account Number : " + ba.getAccountNumber());
		System.out.println("Balance : " + ba.getBalance());
	}

}