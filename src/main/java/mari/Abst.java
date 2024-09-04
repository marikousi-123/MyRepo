package mari;

abstract class BankAccount {
protected String accountNumber;
protected double balance;

public BankAccount(String accountNumber, double balance) {
this.accountNumber = accountNumber;
this.balance = balance;
}


public abstract void deposit(double amount);
public abstract void withdraw(double amount);
public void displayBalance() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Balance: $" + balance);
}
}
class SavingsAccount extends BankAccount {
private double interestRate;

public SavingsAccount(String accountNumber, double balance, double interestRate) {
super(accountNumber, balance);
this.interestRate = interestRate;
}

public void deposit(double amount) {
balance += amount;
}

public void withdraw(double amount) {
if (balance >= amount) {
balance -= amount;
} else {
System.out.println("Insufficient funds.");
}
}
}
class CheckingAccount extends BankAccount{
private double overdraftLimit;
public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
	
super(accountNumber, balance);
this.overdraftLimit = overdraftLimit;
}

public void deposit(double amount) {
balance += amount;
}


public void withdraw(double amount) {
if (balance + overdraftLimit >= amount) {
balance -= amount;
} else {
System.out.println("Insufficient funds.");
}
}
}
public class Abst {
public static void main(String[] args) {
BankAccount savingsAccount = new SavingsAccount("SAI12", 1000.0, 0.02);
BankAccount checkingAccount = new CheckingAccount("CA456", 1500.0, 500.0);

savingsAccount.deposit(500.0);
savingsAccount.displayBalance();
savingsAccount.withdraw(200.0);
savingsAccount.displayBalance();
checkingAccount.deposit(300.0);
checkingAccount.displayBalance();
checkingAccount.withdraw(2500.0);
checkingAccount.displayBalance();

	}

}
