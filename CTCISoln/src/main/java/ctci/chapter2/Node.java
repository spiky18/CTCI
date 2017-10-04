package ctci.chapter2;

public class Node {
	public Node next;
	public int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void appendToTail(int d){
		Node node=new Node(d);
		Node n=this;
		while(n.next!=null)
			n=n.next;
		n.next=node;
	}
	
	public void printLinkedList(){
		Node head=this;
		while(head !=null){
			System.out.print(head.data+"-->");
			head=head.next;
			if(head==null)
				System.out.print("NULL");
			}
		System.out.println();
		
	}

}
