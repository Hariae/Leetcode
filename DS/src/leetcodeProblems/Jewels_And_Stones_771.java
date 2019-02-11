package leetcodeProblems;
import java.util.*;

public class Jewels_And_Stones_771 {

	 public int numJewelsInStones(String J, String S) {
	     int counter=0;
	     HashSet<Character> hs = new HashSet<Character>();
	     for(int i=0;i<J.length();i++) {
	    	 hs.add(J.charAt(i));
	     }
		 for(int i=0;i<S.length();i++) {
			if(hs.contains(S.charAt(i))) {
				counter++;
			}
		 }
		 return counter;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jewels_And_Stones_771 obj = new Jewels_And_Stones_771();
		System.out.println(obj.numJewelsInStones("aA", "aAAbbbbb"));

	}

}
