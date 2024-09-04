package mari;

interface bank{
int RateOfInterest();
}

class SBI implements bank{
	public int RateOfInterest() {
	return 9;
}}
class PNB implements bank{
	public int RateOfInterest() {
	return 8;
}}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SBI b=new SBI();
	System.out.println(b.RateOfInterest());
	}

}
