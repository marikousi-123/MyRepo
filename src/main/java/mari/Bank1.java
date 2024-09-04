package mari;
interface Finance{
	int rateOfInterest();
	}
	class RKO implements Finance
	{
	public int rateOfInterest()
	{
	return 9;
	}}
	class RRR implements Finance
	{
	public int rateOfInterest()
	{
	return 8;
	}
}
public class Bank1 {
	public static void main(String[] args) {
		Finance b=new RRR();
		System.out.println(b.rateOfInterest());
	}

}
