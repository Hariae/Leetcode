package leetcodeProblems;
import java.util.*;

public class Squares_Of_A_Sorted_Array_977 {
	
public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
		for(int i=0;i<A.length;i++) {
			res[i] = A[i] * A[i];
        }
		
		Arrays.sort(res);
		
		
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squares_Of_A_Sorted_Array_977 obj = new Squares_Of_A_Sorted_Array_977();
		
		int[] A = {-4,-1,0,3,10};
		int [] res = obj.sortedSquares(A);
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
