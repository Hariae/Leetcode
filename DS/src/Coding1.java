import java.util.*;
public class Coding1 {
	public int sum(List<Integer> nums) {
		int small1=0,small2=0, result =0;
		while(nums.size()>1) {
			Collections.sort(nums);
			small1 = nums.get(0); small2 = nums.get(1);
			result += small1+small2;
			nums.add(result);
			nums.remove(0);nums.remove(1);
			
		}
		return result;
	}
	public String rollingString(String s, List<String> operations) {
		
		for(int i=0;i<operations.size();i++) {
			int start = Character.getNumericValue(operations.get(i).charAt(0));
			int end = Character.getNumericValue(operations.get(i).charAt(2));
			char add = operations.get(i).charAt(4);
			for(int j=start;j<=end;j++) {
				char y = s.charAt(j);
				char c = 'A';
				if(add == 'L') {
					int x = y - 1;
					if(x <=96) x = x+26;
					c = (char)x;
					//System.out.print(c);
				
				}
				else {
					int x = y + 1;
					if(x >= 123) x = x-26;
					c = (char)x;
					
					//System.out.print(c);
				}
				
				char[] myNameChars = s.toCharArray();
				myNameChars[j] = c;
				s = String.valueOf(myNameChars);
							
				}
			//System.out.println();
		}
		
		
		//s.substring(, endIndex)
		
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Coding1 obj = new Coding1();
		List<String> operations = new ArrayList<String>();
		
		operations.add("0 0 R");
		operations.add("2 5 L");
		operations.add("0 24 R");
		//acc
		System.out.println(obj.rollingString("zzzvaksjakjskslaslkasklakslakslk", operations));
		/*
		 * List<Integer> nums = new ArrayList<Integer>();
		 * nums.add(1);nums.add(2);nums.add(3); int sum = obj.sum(nums);
		 * System.out.println(sum);
		 */
		

	}

}
