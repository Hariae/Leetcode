package leetcodeProblems;
import java.util.*;

public class Valid_Anagram_242 {
	 public boolean isAnagram(String s, String t) {
		 HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		 for(int i=0;i<s.length();i++) {
			 if(hm.containsKey(s.charAt(i))) {
				 hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			 }
			 else {
				 hm.put(s.charAt(i), 1);
			 }
		 }
		 
		 for(int i=0;i<t.length();i++) {
			 if(hm.containsKey(t.charAt(i))) {
				 if(hm.get(t.charAt(i)) == 0) {
					 return false;
				 }
				 else {
					 hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
				 }
			 }
			 else {
				 return false;
			 }
		 }
		 
		 //Map<Character, Integer> map = new HashMap<Character, Integer>();
		 for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			 if(entry.getValue() != 0) {
				 return false;
			 }
		 }
		 
		 return true;      
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(242);
		Valid_Anagram_242 obj = new Valid_Anagram_242();
		System.out.println(obj.isAnagram("anaggram", "gnagaram"));
	}

}
