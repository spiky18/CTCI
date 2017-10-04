package ctci.chapter2;

public class Problem2 {
	public static void main(String[] args) {
		Node head = new Node(1);
		for (int i = 2; i < 6; i++)
			head.appendToTail(i);
		head.printLinkedList();
		Problem2 obj=new Problem2();
		System.out.println(obj.kthNodeFromLast(head, 2).data);
		
	}

	public Node kthNodeFromLast(Node head,int k){
		Node fast=head;
		Node slow=head;
		int i=1;
		while(i!=k){
			fast=fast.next;
			i++;
		}
		while(fast.next!=null){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
}
