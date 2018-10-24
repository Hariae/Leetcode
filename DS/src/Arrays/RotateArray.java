package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

public class RotateArray {
	
	
	
	
	public int[] rotateArray(int[] nums, int k) {
		int i=0;
		
		/*while(i<k) {
			int temp = nums[nums.length-1];
			int j=nums.length-1;
			
			for(; j>0;j--) {				
				nums[j] = nums[j-1];											
			}
			nums[j] = temp;
			i++;
		}*/
		List<Integer> arr = new ArrayList<Integer>();
		for(int j=0;j<nums.length;j++) {
			arr.add(nums[j]);
		}
		
		while(i<k) {
			
			Collections.reverse(arr);
			i++;
			System.out.println(arr.get(0));
			Collections.reverse(arr.subList(i, arr.size()));

			//nums = reverse(nums, nums.length-i);
			 
			
		}
		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RotateArray obj = new RotateArray();
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		nums = obj.rotateArray(nums, k);
		
		/*for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}*/
		
		

	}

}
