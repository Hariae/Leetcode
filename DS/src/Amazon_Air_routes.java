import java.util.*;

public class Amazon_Air_routes {
	
	public List<Integer> bestRoute(int[] forwardRoute, int[] returnRoute, int maxTravelDist){
		int max = Integer.MIN_VALUE;
		int forwardIndex = 0; int returnIndex = 0;
		for(int i=0;i<forwardRoute.length;i++) {
			for(int j=0;j<returnRoute.length;j++) {
				if(forwardRoute[i] + returnRoute[j] <= maxTravelDist && forwardRoute[i] + returnRoute[j] > max) {
					max = forwardRoute[i] + returnRoute[j];
					//forwardIndex = i; 
					//returnIndex = j;
				}
			}
		}
		
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<forwardRoute.length;i++) {
			for(int j=0;j<returnRoute.length;j++) {
				if(forwardRoute[i] + returnRoute[j] == max) {
					res.add(i); res.add(j);
					System.out.println("I: " + i + " J: " + j);
				}
			}
		}
		
		//res.add(forwardIndex);
		//res.add(returnIndex);
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_Air_routes obj = new Amazon_Air_routes();
		
		int[] forward = {3000, 5000, 7000, 10000};
		int[] returnRoute = {2000, 3000, 4000, 5000};
		
		List<Integer> res = obj.bestRoute(forward, returnRoute, 10000);
		
		//System.out.println(res.get(0)+1 + " " + (res.get(1)+1));
		
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i)+1);
		}
	}

}
