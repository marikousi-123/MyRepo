package mari;

public class Arrai {
	// get min num of an array
	
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (min>arr[i])
				min=arr[i];
			
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {33,3,4,5,1};
		min(a);
	}
}
		
//		int[][] myNumbers= {{1,2,3,4}, {7,6,7}};
//		for(int i=0;i < myNumbers.length;i++) {
//			for(int j=0;j < myNumbers[i].length;++j) {
//				System.out.print(myNumbers[i][j]);
//			}
//			System.out.println();
//		}
//		

	


