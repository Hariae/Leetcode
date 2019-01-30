package leetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public boolean isPalindrome(String s) {
		
		try {
			
		if(s == null || s.length() == 0) {
			//throw new Exception();
			return false;
		}
		
		if(s.length() == 1) {
			return true;
		}
		else {
			int mid = s.length()/2;
			int j=s.length()-1;
			for(int i=0;i<mid;i++) {
				if(s.charAt(i) != s.charAt(j)) {
					return false;
				}
				else {
					j--;
				}
			}
		}
		}
		catch(Exception e) {
			e.getMessage();
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Madam");
		System.out.println("evve");
		Demo obj = new Demo();
		boolean res = obj.isPalindrome(null);
		System.out.println(res);
	}

}


/*Ticketing System
 * User - ProfileID, Name, Age, Sex, etc 
 * Order : 
 * OrderID - primary key,
 * numberOfTickets - int,
 * EventType - Event,
 * TotalPrice - Float,
 * SeatNo - String,
 * ProfileId - ,
 * TicketType - enum (1st class,..),
 * Discount - ,
 *  
 * Ticket - Seat no, ticket price 
 * 
 * placeOrder(),
 * removeOrder(),
 * editOrder(),
 * getOrderDetails(OrderId),
 * getOrderDetails(int[] OrderID),
 * 
 * 
 * getOrderStatistics() - admin
 * 
 * */

/*public class Order{
	private int OrderID ; 
	private int numberOfTickets;
	private String[] Eventtype;
	private float TotalPrice;
	//private String[] SeatNo;
	private String[] TicketType;
	private float Discount;
	
	private List<Order> getOrderDetails(int[] OrderID) {
		
		List<Order> order = new ArrayList<Order>();
		//DB- call
		
		for(int i=0;i<OrderID.length;i++) {
			Order resultOrder = new Order();
			//resultOrder //FROM DB - pass OrderID[i]
			/* 
			 * select * from table 
			 * 
			 * */
/*			order.add(resultOrder);
		}
		
		return order;
		
		
		
	}
	
}








*/



