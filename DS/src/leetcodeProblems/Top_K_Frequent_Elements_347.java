package leetcodeProblems;

import java.util.*;

public class Top_K_Frequent_Elements_347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
			if(hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			}
			else {
				hm.put(nums[i], 1);
			}
		}
        //Incomplete
        
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Top_K_Frequent_Elements_347 obj = new Top_K_Frequent_Elements_347();

	}

}
