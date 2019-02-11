import java.util.*;

public class Heap_Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pq.add(10);
		pq.add(90);
		pq.add(25);
		pq.add(75);
		pq.add(35);
		
		System.out.print(pq.poll());
		System.out.print(pq.poll());
		

	}

}
