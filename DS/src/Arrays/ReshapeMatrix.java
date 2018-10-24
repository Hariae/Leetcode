package Arrays;

public class ReshapeMatrix {
	
	public int[][] reshapeMatrix(int[][] nums, int r, int c){
		
		int rows = nums.length;
		int cols = nums[0].length;
		
		System.out.println("Rows" + rows);
		System.out.println("Cols" + cols);
		
		int res[][] = new int[r][c];
		int res_i = 0;
		int res_j = 0;
		
		if(r*c != rows*cols) {
			return nums;
		}
		else {
				for(int i=0;i<rows;i++) {
					for(int j=0;j<cols;j++) {
						//res[i%rows-1][j*(cols-1)] = nums[i][j];
						
					}
					//res_j++;
					System.out.println("");
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(res[i][j]);
				
			}
			System.out.println("");
		}
		return res;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReshapeMatrix obj = new ReshapeMatrix();
		int[][] nums = {{1,2},
				 		{3,4}};
		int r = 1;
		int c = 4;
		
		obj.reshapeMatrix(nums, r, c);
	}

}
