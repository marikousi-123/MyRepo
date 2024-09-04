package mari;



public class AscendArray {
	

	public static void main(String[] args) {
		
		int arr[]= {5,8,7,1,2};
		int temp=0;
		int i;
		int j;
		
		
		for (i=0; i<arr.length; i++) {
			System.out.println("original array"+arr[i]);
		}
		for( i=0;i<arr.length;i++) {
		for(j=i+1; j<arr.length; j++) {
			if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
		}
		}
		for (i=0; i<arr.length; i++) {
			System.out.println("after  sorting"+arr[i]);
		}
	}

}
