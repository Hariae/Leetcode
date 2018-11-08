package Arrays;
import java.util.*;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] res = new int[2];
		for(int i=0;i<nums.length;i++) {
			hm.put(nums[i], i);
		}
		
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(target - nums[i])) {
				System.out.println("Inside : " + i + "other: " + hm.get(target - nums[i]));
				
				res[0] = i;
				res[1] = hm.get(target - nums[i]);
				if(res[0] != res[1]) {
					break;
				}
				
			}
		}
		
		System.out.println(res[0]);System.out.println(res[1]);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum obj = new TwoSum();
		
		int[] nums = {3,2,4};
		int target = 6;
		obj.twoSum(nums, target);
		
	}

}
