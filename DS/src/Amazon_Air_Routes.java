import java.util.*;

public class Amazon_Air_Routes {
	
	public class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public List<Point> findNearestDestinations(List<Point> destinations, int k){
		
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		HashMap<Double, Point> hm = new HashMap<Double, Point>();
		
		for(int i=0;i<destinations.size();i++) {
			double distance = Math.sqrt((destinations.get(i).x * destinations.get(i).x) + (destinations.get(i).y * destinations.get(i).y));
			//hm.put(destinations.get(i), distance);
			hm.put(distance, destinations.get(i));
			pq.add(distance);
		}
		List<Point> res = new ArrayList<Point>();
		for(int i=0;i<k;i++) {
			res.add(hm.get(pq.poll()));
		}
		
		return res;
	}
	
	public List<Point> findKNearestDestinations(List<Point> destinations, int k){
		
		HashMap<Point, Integer> hm = new HashMap<Point, Integer>(); 
		
		for(int i=0;i<destinations.size();i++) {
			//double distance = Math.sqrt((destinations.get(i).x * destinations.get(i).x) + (destinations.get(i).y * destinations.get(i).y));
			int distance = (destinations.get(i).x * destinations.get(i).x) + (destinations.get(i).y * destinations.get(i).y);
			hm.put(destinations.get(i), distance);
		}
		
		int max = Integer.MIN_VALUE;
		
		for(Map.Entry<Point, Integer> entry : hm.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
			}
		}
		
		Point[] distanceArray = new Point[max+1];
		
		for(Map.Entry<Point, Integer> entry : hm.entrySet()) {
			distanceArray[entry.getValue()] = entry.getKey();
		}
		
		//Arrays.sort(distanceArray, Collections.reverseOrder());
		
		List<Point> result = new ArrayList<Point>();
		
		
		/*
		 * for(int i = distanceArray.length-1; i>=0 && k > 0;i--) { if(distanceArray[i]
		 * != null) { k--; result.add(distanceArray[i]); } }
		 */
		
		for(int i=0;i<distanceArray.length && k > 0;i++) {
			if(distanceArray[i] != null) {
				k--;
				result.add(distanceArray[i]);
			}
		}
		
		return result;
	}
	
	public Point createPoint(int x, int y) {
		Point pt = new Point(x,y);
		return pt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_Air_Routes obj = new Amazon_Air_Routes();
		
		List<Point> list = new ArrayList<Point>();
		
		Point pt = obj.createPoint(1,2);
		list.add(pt);
		pt = obj.createPoint(3,4);
		list.add(pt);
		pt = obj.createPoint(1,-1);
		list.add(pt);
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println("X: " + list.get(i).x + " Y: " + list.get(i).y);
		}
		
		List<Point> res = obj.findKNearestDestinations(list, 2);
		res = obj.findNearestDestinations(list, 3);
		System.out.println("Result");
		for(int i=0;i<res.size();i++) {
			System.out.println("X: " + res.get(i).x + " Y: " + res.get(i).y);
		}
		
		
		
		
	}

}
