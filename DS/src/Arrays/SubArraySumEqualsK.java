package Arrays;

public class SubArraySumEqualsK {
	
	public int subArraySumEqualsK(int[] nums, int k) {
		
		int count=0;
		int sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			
			if(sum+nums[i] == k || nums[i] == k) {
				count++;
				sum = nums[i];
				
			}
			else {
				sum += nums[i];
			}
		}
		
		System.out.println(count);
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySumEqualsK obj = new SubArraySumEqualsK();
		int[] nums = {-1,-1,1};
		int k = 3; 
		obj.subArraySumEqualsK(nums, k);

	}

}
