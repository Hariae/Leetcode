package Arrays;

public class LargestSubarraySumDC {
	
	public int crossSum(int[] nums, int left, int mid,int right) {
		int left_sum = Integer.MIN_VALUE;
		int sum = 0;		
		for(int i=mid;i>=left;i--) {
			
			sum = sum + nums[i];
			if(sum > left_sum) {
				left_sum = sum;
			}			
		}
		sum = 0;
		int right_sum = Integer.MIN_VALUE;
		for(int i=mid+1;i<=right;i++) {
			sum = sum + nums[i];
			if(sum > right_sum) {
				right_sum = sum;
			}
		}
		
		return left_sum + right_sum;				
	}

	public int largestSubarraySum(int[] nums, int left, int right) {
		//int max = 0;
		if(left == right) {
			return nums[left];
		}
		
		int mid = (left+right)/2;
		
		
		
		int left_sum = largestSubarraySum(nums, left, mid);
		int right_sum = largestSubarraySum(nums, mid+1, right);
		int cross_sum = crossSum(nums, left,mid, right);
		
		return Math.max(Math.max(left_sum, right_sum), cross_sum);
		
		  

		//return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestSubarraySumDC obj = new LargestSubarraySumDC();
		int[] nums = {4,-2,-3,-1,7};
		int max = obj.largestSubarraySum(nums, 0, nums.length-1);
		System.out.println(max);

	}

}
