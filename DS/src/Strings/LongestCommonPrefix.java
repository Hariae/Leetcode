package Strings;

//#14
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		
		String prefix = "";
		if(strs.length < 1) {
			return prefix;
		}
		int minCount = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minCount) {
				minCount = strs[i].length();
			}
		}
		for (int j = 0; j < minCount; j++) {
			
			char commonChar = strs[0].charAt(j);
			for (int i = 1; i < strs.length; i++) {
				if(commonChar != strs[i].charAt(j)) {
					return prefix;
				}				
			}
			prefix = prefix + commonChar;
			 
		}
		
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommonPrefix obj = new LongestCommonPrefix();
		String[] strs = { "dog","racecar","car" };
		System.out.println(obj.longestCommonPrefix(strs));

	}

}
