package Arrays;

public class ProductArrayExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
		
		int[] res = new int[nums.length];
		for(int i=0;i<res.length;i++)
			res[i] = 1;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<res.length;j++) {
				if(i != j)
					res[i] = res[i] * nums[j];
			}
		}
				
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductArrayExceptSelf obj = new ProductArrayExceptSelf();
		int[] nums = {1,2,3,4};
		obj.productExceptSelf(nums);
		

	}

}
