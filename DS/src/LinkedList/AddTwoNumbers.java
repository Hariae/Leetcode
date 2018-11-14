package LinkedList;

public class AddTwoNumbers {
	
	public class ListNode{
		
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	public ListNode insert(ListNode head, int val) {		
		ListNode temp = new ListNode(val);		
		if(head == null) {
			head = temp;
		}
		else {
			ListNode curr = head;			
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;		
		}		
		return head;		
	}
	
	public int extractListAsReverse(ListNode head) {
		
		ListNode curr = head;
		int count = 0;
		while(curr.next != null) {
			curr = curr.next;
			count++;
		}
		int reverse = 0;
		curr = head;
		int iterator = 0;
		while(iterator <= count) {			
			reverse = reverse + curr.val * (int)Math.pow(10, iterator);
			curr = curr.next;
			iterator++;
		}		
		return reverse;
	}
		
	
	public ListNode insertAtTail(ListNode head, int val) {
		
		ListNode temp = new ListNode(val);
		
		if(head == null) {
			head = temp;
		}
		else {
			
			temp.next = head;
			head = temp;
		}
		
		return head;
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int firstNum = extractListAsReverse(l1);
		int secondNum = extractListAsReverse(l2);
		int sum = firstNum + secondNum;
		ListNode rev = null;
		if(sum == 0) {
			rev = insert(rev, 0);
		}
		
		while(sum > 0) {
			int num = sum % 10;
			rev = insert(rev, num);
			sum = sum / 10;
		}
		return rev;
		
	}
	
	public void printList(ListNode head) {
		ListNode curr = head;
		
		while(curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumbers obj = new AddTwoNumbers();
		ListNode l1 = null;
		l1 = obj.insert(l1, 9);
		/*l1 = obj.insert(l1, 4);
		l1 = obj.insert(l1, 3);		*/
		//obj.printList(l1);		
		ListNode l2 = null;		
		l2 = obj.insert(l2, 0);
		/*l2 = obj.insert(l2, 6);
		l2 = obj.insert(l2, 4);*/
		//obj.printList(l2);
		
		int firstNum = obj.extractListAsReverse(l1);
		int secondNum = obj.extractListAsReverse(l2);
		int sum = firstNum + secondNum;
		
		System.out.println(sum);
		
		ListNode rev = obj.addTwoNumbers(l1, l2);
		obj.printList(rev);
		
		
		
		
	}

}
