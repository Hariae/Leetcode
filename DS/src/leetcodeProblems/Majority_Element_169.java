package leetcodeProblems;
import java.util.*;

public class Majority_Element_169 {
	
public int majorityElement(int[] nums) {
     
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	for(int i=0;i<nums.length;i++) {
		if(hm.containsKey(nums[i])) {
			
			hm.put(nums[i], hm.get(nums[i]) + 1);
			if(hm.get(nums[i]) > (nums.length/2)) {
				return nums[i];
			}
		}
		else {
			hm.put(nums[i], 1);
		}
	}
	
	return 0;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Majority_Element_169 obj = new Majority_Element_169();
		int[] nums = {2,2,1,1,1,2,2};
		
		System.out.println(obj.majorityElement(nums));
		
	}

}
