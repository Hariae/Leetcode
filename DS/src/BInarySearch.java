
public class BInarySearch {

	public int binarySearch(int[] arr, int start, int end, int x) {
		
		int mid = (start + end)/2;
		System.out.println("Start: " + start + " End: " + end + "Mid: " + arr[mid]);
		if(arr[mid] == x) {
			return mid;
		}
		if(start == end) {
			return -1;
		}
		if(x < arr[mid] ) {
			return binarySearch(arr, start, mid, x);
		}
		else {
			return binarySearch(arr, mid+1, end, x);
		}
		
		//return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,6,8,9,10,14,234,567,789};
		int start = 0; int end = arr.length-1; 
		/*
		 * int mid = (start + end)/2; int x = 234; while(start != end) { if(x ==
		 * arr[mid]) { System.out.println(mid);break; } else { if(x < arr[mid]) { end =
		 * mid; mid = (start + end)/2; } else { start = mid +1; mid = (start + end)/2; }
		 * } }
		 * 
		 */
		BInarySearch obj = new BInarySearch();
		System.out.println(obj.binarySearch(arr, start, end, 600));
		
		//System.out.println("NA");
		

	}

}
