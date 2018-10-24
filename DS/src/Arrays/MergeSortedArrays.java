package Arrays;

public class MergeSortedArrays {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
	        
		int left=0, right=0;
		int[] temp = new int[nums1.length]; 
		int k = 0;
		
		while(nums1[left] > 0 && right< nums2.length) {
			if(nums1[left] <= nums2[right]) {
				temp[k] = nums1[left];
				left++;
			}
			else {
				temp[k] = nums2[right];
				right++;
			}
			k++;
		}
		
		
		System.arraycopy(nums2, right, temp, k, nums2.length-right);
		System.arraycopy(nums1, left, temp, k, m-left);
		
		System.arraycopy(temp, 0, nums1, 0, temp.length);
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedArrays obj = new MergeSortedArrays();
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n=3;
		obj.merge(nums1, m, nums2, n);

	}

}
