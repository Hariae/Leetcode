package Arrays;

public class LargestSubarraySum {
	
	public int largestSubArraySum(int[] nums) {
		
		int max_so_far = nums[0];
		int max_end_here = nums[0];
		int start = 0, s=0;
		int end = 0;
		
	/*	int curr_max = nums[0];
		int max_so_far = nums[0];*/
		
		for(int i=1;i<nums.length;i++) {
			//max_end_here = max_end_here + nums[i];
			
			if(max_end_here + nums[i] > nums[i]) {
				max_end_here = max_end_here + nums[i];
				s = i;
			}
			else {
				max_end_here = nums[i];
			}
			
			if(max_end_here > max_so_far) {
				max_so_far = max_end_here;
				end = i;
				start = s+1;
			}
			
			
			
			/*curr_max = Math.max(nums[i], curr_max+nums[i]); 
	        max_so_far = Math.max(max_so_far, curr_max);*/
			
			
			
		}
		/*System.out.println(start);
		System.out.println(end);*/
		return max_so_far;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestSubarraySum obj = new LargestSubarraySum();
		int[] nums = {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(obj.largestSubArraySum(nums));
	}

}
