package Arrays;
import java.util.*;

public class PositionOfLargeGroups {
	
	public List<List<Integer>> positionOfLargeGroups(String s){
		
		List<List<Integer>> res = new ArrayList();		
		LinkedHashMap<Integer, List<Integer>> hm = new LinkedHashMap<Integer, List<Integer>>();
		
		int count = 1;
		int start = -1;
		int x = 1;
		for(int i=0;i<s.length()-1;i++) {
			
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
				if(start == -1) {
					start = i;
				}				
			}
			else {
				if(count >= 3) {
					List<Integer> ls = new ArrayList();
					ls.add(start);
					ls.add(i);
					hm.put(x, ls);
					x++;
				}
				
				count = 1;
				start = -1;
			}
		}
		
		if(count >= 3) {
			List<Integer> ls = new ArrayList();
			ls.add(start);
			ls.add(s.length()-1);
			hm.put(x, ls);
			x++;
		}
		
		for (int key: hm.keySet()) {
		    System.out.println("key : " + key);
		    System.out.println("value : " + hm.get(key));
		    res.add(hm.get(key));
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionOfLargeGroups obj = new PositionOfLargeGroups();
		obj.positionOfLargeGroups("nnnhaaannnm");
		

	}

}
