package Arrays;
import java.util.*;

public class FairCandySwap {
	
	public int[] fairCandySwap(int[] A, int[] B) {
		
		int A_sum = 0, B_sum = 0;
		HashSet<Integer> hs1 = new HashSet<Integer>();
		HashSet<Integer> hs2 = new HashSet<Integer>();
		
		for(int i=0;i<A.length;i++) {
			A_sum += A[i];
			//hs1.add(A[i]);
		}
		
		for(int i=0;i<B.length;i++) {
			B_sum += B[i];
			hs2.add(B[i]);
		}
		
		int ave = (A_sum + B_sum)/2;		
		int diff = A_sum - ave;		
		int[] res = new int[2];	
		
		for(int i=0;i<A.length;i++) {
			if(hs2.contains(A[i]-diff)) {
				res[0] = A[i];
				res[1] = A[i]-diff;				
				break;
			}
		}
		
		
		
		/*Iterator<Integer> iter = hs1.iterator();
		
		while(iter.hasNext()) {
			int curr = iter.next();
			if(hs2.contains(curr-diff)) {
				res[0] = curr;
				res[1] = curr-diff;				
				break;
			}
			
		}
		
		*/
		System.out.println(res[0]);
		System.out.println(res[1]);

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FairCandySwap obj = new FairCandySwap();
		int[] A = {1,1};
		int[] B = {2,2};
		
		obj.fairCandySwap(A, B);

	}

}
