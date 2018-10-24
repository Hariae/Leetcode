package Arrays;
import java.util.*;

public class ArrayNesting {
	
	public int arrayNesting(int[] nums) {
		
		int curr_index = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int value = nums[curr_index];
		int count = 0;		
		int maxCount = 0;
		int failCounter = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			System.out.println("curr_index" + curr_index);
			System.out.println("value" + value);
			
			if(!hm.containsValue(value)) {
				hm.put(curr_index, value);
				curr_index = value;
				value = nums[curr_index];
				count++;
				System.out.println("Counter" + count);
				
			}
			else {
				if(count > maxCount) {
					maxCount = count;
				}
				count = 0;
				
				if(i < nums.length) {					
					curr_index = i;
					value = nums[curr_index];
					hm.put(curr_index, value);
					curr_index = value;
					value = nums[curr_index];
					count++;
					System.out.println("Reset Counter" + count);
				}				
			}					
			
		}
		if(count > maxCount) {
			maxCount = count;
		}
		
		System.out.println("Count" + maxCount);

		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayNesting obj = new ArrayNesting();
		int[] nums = {2,3,0,4,1};
		obj.arrayNesting(nums);
		
	}

}
