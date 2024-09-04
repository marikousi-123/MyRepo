package mari;

public class Matrix {

	public static void main(String[] args) {
		
		int[][] mynum= {{1,2,3},{3,4,5}};
		for(int i=0;i<mynum.length;i++) {
			for(int j=0;j<mynum.length;j++) {
				System.out.print(mynum[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
