package mari;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,3,4,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if (a[i]==a[j]) {
				System.out.println("dup num is :" +a[i]);
	break;
			}
		}
		}
	}

}
