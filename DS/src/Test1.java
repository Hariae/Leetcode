import java.util.*;
public class Test1 {
	
	public boolean ifDuplicate(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		int counter = 0;
		for(int i=0;i<str.length();i++) {
			//if(counter > 1) return false;
			if(hs.contains(str.charAt(i))) {
				//System.out.println("counter");
				counter++;
			}
			else {
				hs.add(str.charAt(i));
			}
		}
		
		if(counter == 1) {
			return true;
		}
		else {
			return false;
		}
		
		//return true;
	}
	public List<String> finString(String inputString, int num){
		List<String> list = new ArrayList<String>();
		for(int i=0;i<=inputString.length()-num;i++) {
			//for(int j=i+1;j<num;j++) {
				list.add(inputString.substring(i, i+num));
			//}
		}
		
		List<String> res = new ArrayList<String>();
		//System.out.print(ifDuplicate("cracy"));
		HashSet<String> hs = new HashSet<String>();
		  for(int i=0;i<list.size();i++) {
		  
		  if(ifDuplicate(list.get(i)) == true) { 
			  hs.add(list.get(i));
			  if(!hs.contains(list.get(i))) {
				res.add(list.get(i));  
			  }
			 
		  	System.out.println(list.get(i)); }
		  //}
		  }
		/*
		 * List<String> res = new ArrayList<String>(hs); for(int j=0;j<res.size();j++) {
		 * res.get(j); }
		 */
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 obj = new Test1();
		for(int i=0;i<=255;++i) {
			System.out.println(i);
		}
		obj.finString("awaglk", 4);
		
	}

}
