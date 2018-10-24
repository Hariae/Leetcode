package Arrays;

public class TransposeMatrix {
	
	public int[][] transposeMatrix(int[][] A){
		int[][] res = new int[A[0].length][A.length];
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				res[j][i] = A[i][j];
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransposeMatrix obj = new TransposeMatrix();
		int[][] A = {{1,2,3},{4,5,6}};
		obj.transposeMatrix(A);
		

	}

}
