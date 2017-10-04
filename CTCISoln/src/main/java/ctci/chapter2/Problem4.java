package ctci.chapter2;

public class Problem4 {
	public static void main(String[] args) {
		Node head = new Node(3);
		head.appendToTail(5);
		head.appendToTail(8);
		head.appendToTail(5);
		head.appendToTail(10);
		head.appendToTail(2);
		head.appendToTail(1);
		head.printLinkedList();
		Problem4 obj=new Problem4();
		head=obj.partition(head, 5);
		System.out.println();
		head.printLinkedList();
	}
	public Node partition(Node head, int val) {
		if(head==null)
			return head;
		Node left = null, right = null;
		Node curr = head,prev=head;
		while (curr != null) {
			if (curr.data < val) {
				if(left==null)
					left=curr;
				
				else{
					Node temp=curr;
					prev.next=temp.next;
					temp.next=left.next;
					left.next=temp;
				}
			} else {
				if(right==null)
					right=curr;
				else{
					Node temp=curr;
					prev.next=temp.next;
					temp.next=right.next;
					right.next=temp;
				}
			}
			prev=curr;
			curr=curr.next;
		}
		//left.next=right;
		return head;
	}

	/*private Node appendList(Node head, Node curr) {
		Node temp=curr;
		if (head == null) {
			head = curr;
			head.next=null;
			curr=temp;
			return head;
		}
		Node runner=head;
		while(runner.next!=null)
			runner=runner.next;
		runner.next=curr;
		runner=runner.next;
		runner.next = null;
		return head;
	}*/
}
