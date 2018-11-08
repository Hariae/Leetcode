package Strings;
import java.util.*;

public class LongestSubtringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		
		
		/*HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int maxCount = 0;
		int count = 0;
		int lastRepeated = Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++) {
			
			if(hm.containsKey(s.charAt(i))) {
				count = i - hm.get(s.charAt(i));
				if(count > lastRepeated) {
					count = i - lastRepeated;
				}
				lastRepeated = i;
				hm.put(s.charAt(i), i);
			}
			else {
				count++;
				hm.put(s.charAt(i), i);
			}
			
			if(count > maxCount)
				maxCount = count;
		}*/
		
		int maxCount = 0;
		//HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
		
		String currString = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(currString.contains(Character.toString(s.charAt(i)))) {
				
				if(currString.length() > maxCount) {
					maxCount = currString.length();
				}
				currString = currString.substring(currString.indexOf(s.charAt(i)) + 1, currString.length()) + s.charAt(i);
				
				//System.out.println("Char: " + Character.toString(s.charAt(i)) + " curr: " + currString);
			}
			else {
				currString = currString + s.charAt(i);
			}
		}
		
		//System.out.println("Final curr: " + currString);
		//hm.put(currString, currString.length());
		
		/*for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println("String: " + entry.getKey());
			System.out.println("Length: " + entry.getValue());
			if(entry.getValue() > maxCount)
				maxCount = entry.getValue();
		}*/
		if(currString.length() > maxCount) {
			maxCount = currString.length();
		}
		return maxCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubtringWithoutRepeatingCharacters obj = new LongestSubtringWithoutRepeatingCharacters();
		//pwwkew
		//abcabcbb
		//"tmmzuxt"
		//"dvdf"
		System.out.println(obj.lengthOfLongestSubstring("tmmzuxt"));
	}

}
