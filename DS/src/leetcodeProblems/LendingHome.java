package leetcodeProblems;
import java.util.*;

public class LendingHome {
	
	private List<String> hostname = new ArrayList<String>();
	
	
	public Integer nextServerNumber(List<Integer> list) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i));
			hs.add(list.get(i));
		}
		
		for(int i=1;i<=list.size();i++) {
			if(!hs.contains(i)) {
				return i;
			}
		}
		return list.size()+1;
		
	}
	
	public String allocate(String hostType) {
		//hostname.add(hostType);
		List<Integer> counterList = new ArrayList<Integer>();
		int minCounter = Integer.MAX_VALUE;
		int counter = 0;
		  for(int i=0;i<hostname.size();i++) {
				  if(hostname.get(i).replaceAll("\\d", "").equals(hostType)) {
				  counter++;
				  String num = hostname.get(i).replaceAll("\\D", "");
				  
				  int currCounter = Integer.parseInt(num);
				  counterList.add(currCounter);
			  	} 
			 }
		  int lowestCounter = nextServerNumber(counterList);
		hostname.add(hostType + lowestCounter);
		return hostType + lowestCounter;
	}
	
	public void deallocate(String hostName) {
		
		for(int i=0;i<hostname.size();i++) {
			if(hostname.get(i).equals(hostName)){
				hostname.remove(hostname.get(i));
				break;
			}
		}
		
		/*
		 * for(int i=0;i<hostname.size();i++) { if(hostname.get(i).equals(hostType)) {
		 * counter++; } }
		 */
		
		
		//return "";
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LendingHome obj = new LendingHome();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2);list.add(3);
		
		System.out.println(obj.nextServerNumber(list));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));

		System.out.println(obj.allocate("banana"));
		obj.deallocate("banana5");
		obj.deallocate("banana11");
		
		System.out.println(obj.allocate("banana"));
		System.out.println(obj.allocate("banana"));
		
		System.out.println(obj.allocate("apibox"));
	}

}
