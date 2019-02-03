import java.util.ArrayList;
import java.util.List;

public class F5coding {
	int maxDiff(List<Integer> nums)  
    { 
		int maxDiff = -1;  
	      int n = nums.size();
	    // Initialize max element from right side 
	    int maxRight = nums.get(n-1);  
	  
	    for (int i = n-2; i >= 0; i--) 
	    { 
	        if (nums.get(i) > maxRight) 
	            maxRight = nums.get(i); 
	        else
	        { 
	            int diff = maxRight - nums.get(i); 
	            if (diff > maxDiff) 
	            { 
	                maxDiff = diff; 
	            } 
	        } 
	    } 
	    return maxDiff;
    }
	public int minPrice(List<List<Integer>> cost) {
		int prev = Integer.MAX_VALUE;
		int res = 0;
		
		for(int i=0;i<cost.size();i++) {
			int min = Integer.MAX_VALUE;
			for(int j=0;j<cost.get(i).size();j++) {
				if(cost.get(i).get(j) < min && j != prev) {
					min = cost.get(i).get(j);
					prev = j;
					
				}
			}
			res = res + min;
		}
		return res;
	}
	
	public String winner(String erica, String bob) {
		int ericaPt = 0;
		int bobPt = 0;
		for(int i=0;i<erica.length();i++) {
			if(erica.charAt(i) == 'E') ericaPt = ericaPt + 1;
			else if(erica.charAt(i) == 'M') ericaPt = ericaPt + 3;
			else if(erica.charAt(i) == 'H') ericaPt = ericaPt + 5;
		}
for(int i=0;i<bob.length();i++) {
	if(bob.charAt(i) == 'E') bobPt = bobPt + 1;
	else if(bob.charAt(i) == 'M') bobPt = bobPt + 3;
	else if(bob.charAt(i) == 'H') bobPt = bobPt + 5;
		}

//System.out.println(ericaPt + " " + bobPt);
		if(ericaPt == bobPt) return "Tie";
		else if(ericaPt > bobPt) return "Erica";
		else return "Bob";
		//return ericaPt>bobPt? "Erica" : ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int arr[] = {7,1,2,5}; List<Integer> nums = new ArrayList<Integer>();
		 * nums.add(7);nums.add(1);nums.add(2);nums.add(5); F5coding obj = new
		 * F5coding(); System.out.println(obj.maxDiff(nums));
		 */
		F5coding obj = new F5coding();
		/*
		 * List<List<Integer>> total = new ArrayList<List<Integer>>();
		 * 
		 * List<Integer> cost1 = new ArrayList<Integer>(); cost1.add(1);
		 * cost1.add(10);cost1.add(20); total.add(cost1); cost1 = new
		 * ArrayList<Integer>(); cost1.add(2); cost1.add(100);cost1.add(100);
		 * total.add(cost1); //cost1 = new ArrayList<Integer>(); //cost1.add(3);
		 * cost1.add(3);cost1.add(1); //total.add(cost1);
		 * System.out.println(obj.minPrice(total));
		 */
		System.out.println(obj.winner("EHH", "EME"));
	}

}
