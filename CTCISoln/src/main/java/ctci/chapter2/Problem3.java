package ctci.chapter2;

public class Problem3 {
	public static void main(String[] args) {
		Node head = new Node(1);
		for (int i = 2; i < 5; i++)
			head.appendToTail(i);
		head.printLinkedList();
		Problem3 obj=new Problem3();
		head=obj.deleteMiddleElement(head);
		System.out.println("After operation");
		head.printLinkedList();
		
	}
	public Node deleteMiddleElement(Node head){
		if(head==null)
			return head;
		Node slow=head;
		Node fast=head;
		Node prev=null;
		while(fast !=null && fast.next!=null)
		{
			fast=fast.next.next;
			prev=slow;
			slow=slow.next;
			
		}
		prev.next=slow.next;
		return head;
	}

}
