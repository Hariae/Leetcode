package Arrays;
import java.util.*;

public class ThreeSumClosest {
	
	public List<String> letterCombinations(String digits) {
		
		List<String> res = new ArrayList<String>();
		int numberOfCombinations = (int)Math.pow(3, digits.length());
		System.out.println(numberOfCombinations);
		
		String[] letter = {"", "","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		
		int letterIteratorCount = (int)Math.pow(3, digits.length()-1);
		
		for(int i=0;i<digits.length();i++) {
			String letters = letter[digits.charAt(i)-'0'];
			System.out.println(letters);
			int count = 0;
			for(int j=0;j<3;j++) {
				while(count < letterIteratorCount) {
					res.add(count, ""+letters.charAt(j));
					count++;
				}
			}
			
			for(String str : res) {
				System.out.println(str);
			}
			
			
			
			
			 
		}
		
		
		
		
		
		return res; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSumClosest obj = new ThreeSumClosest();
		obj.letterCombinations("23");
		
	}

}
