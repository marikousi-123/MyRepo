package mari;

public class Addmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] add= {{1,2,3},{4,5,6},{1,2,3}};
		int[][] bbb= {{3,2,1},{6,5,4},{3,2,1}};
		int[][] ccc=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ccc[i][j]=add[i][j]+bbb[i][j];
				System.out.print(ccc[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
