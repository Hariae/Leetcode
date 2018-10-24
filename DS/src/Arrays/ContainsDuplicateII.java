package Arrays;
import java.util.*;

public class ContainsDuplicateII {

	
	public boolean containsDuplicate(int[] nums, int k) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				if(i - hm.get(nums[i]) <= k)
					return true;
				else {
					hm.put(nums[i], i);
				}
			}
			else {
				hm.put(nums[i], i);
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsDuplicateII obj = new ContainsDuplicateII();
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		System.out.println(obj.containsDuplicate(nums, k));
	}

}
