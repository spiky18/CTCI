package ctci.chapter2;

public class Problem6 {
	
	public boolean isPalindrome(Node head){
		if(head==null || head.next==null)
			return true;
		Node fastptr=head;
		Node slowptr=head;
		while(fastptr!=null && fastptr.next!=null){
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
		}
		slowptr=reverseLinkedList(slowptr);
		while(slowptr!=null)	
		{
			if(head.data!=slowptr.data)
				return false;
			head=head.next;
			slowptr=slowptr.next;
		}
		return true;
	}

	public Node reverseLinkedList(Node head) {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;

			curr = temp;
		}
		return prev;
	}
}
