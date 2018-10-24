package Arrays;

public class SpiralMatrixII {
	
	public int[][] sprialMatrix(int [][] nums){
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				nums[i][j] = i + (j+1);
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(nums[i][j]);
			}
			System.out.println("");
		}
		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrixII obj = new SpiralMatrixII();
		int[][] nums = {{0,0,0},
				{0,0,0},{0,0,0}};
		obj.sprialMatrix(nums);
		

	}

}
