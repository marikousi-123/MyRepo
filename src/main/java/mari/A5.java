package mari;

interface H{
	int rateOfInterest();
}

class RKO implements H
{
	public int rateOfInterest()
	{
		return 9;
	}
	
	class PNB implements H{
		public int rateOfInterest() {
			return 8;
		}
	}
}
class A5{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RKO B=new RKO();
		System.out.println("ROI : "+B.rateOfInterest());
	}

}
