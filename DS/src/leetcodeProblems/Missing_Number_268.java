package leetcodeProblems;
import java.util.*;

public class Missing_Number_268 {
	
	public int missingNumber(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();
        
		for(int i=0;i<nums.length;i++) {
			hs.add(nums[i]);
		}
		
		for(int i=0;i<nums.length;i++) {
			if(!hs.contains(i)) {
				return i;
			}
			
		}
		return nums.length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(268);
		Missing_Number_268 obj = new Missing_Number_268();
		int[] nums = {1};
		System.out.println(obj.missingNumber(nums));
	}

}
