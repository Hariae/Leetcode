package leetcodeProblems;

import java.util.*;

public class Intersection_of_Two_Arrays_II_350 {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] temp = nums1;
		if(nums2.length > nums1.length) {
			nums1 = nums2;
			nums2 = temp;
		}
		
		for(int i=0;i<nums1.length;i++) {
			if(hm.containsKey(nums1[i])) {
				hm.put(nums1[i], hm.get(nums1[i])+1);
			}
			else {
				hm.put(nums1[i], 1);
			}
		}
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<nums2.length;i++) {
			if(hm.containsKey(nums2[i])) {
				if(hm.get(nums2[i]) > 0) {
					res.add(nums2[i]);
					hm.put(nums2[i], hm.get(nums2[i])-1);
				}
				
			}
		}
		
		int[] result = new int[res.size()];
		for(int i=0;i<result.length;i++) {
			result[i] = res.get(i);
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(350);
		Intersection_of_Two_Arrays_II_350 obj = new Intersection_of_Two_Arrays_II_350();
		int[] nums1 = {1,2};
		int[] nums2 = {1,1};
		int[] res = new int[nums1.length>nums2.length ? nums1.length : nums2.length];
		res = obj.intersect(nums1, nums2);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
