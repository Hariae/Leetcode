package leetcodeProblems;

public class Reverse_Linked_List_206 {
	
	public class ListNode{
		int val;
		ListNode next;
		
		ListNode(int val){
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
			curr.next= temp;
		}
		
		
		return head;
	}
	
	
	public ListNode reverseList(ListNode head) {
		
		if(head != null) {
			ListNode curr = head;
			ListNode prev = null;
			ListNode temp = null;
			
			while(curr != null) {
				temp = curr.next;
				curr.next = prev;
				prev = curr;
				head = curr;
				curr = temp;
				
			}
		}
		
		return head;
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
		Reverse_Linked_List_206 obj = new Reverse_Linked_List_206();
		ListNode head = null;
		head = obj.insert(head, 1);
		head = obj.insert(head, 2);
		head = obj.insert(head, 3);
		head = obj.insert(head, 4);
		head = obj.insert(head, 5);
		
		obj.printList(head);
		head = obj.reverseList(head);
		System.out.println();
		obj.printList(head);
	}

}
