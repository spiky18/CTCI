package ctci.chapter2;

public class Problem8 {
	public Node detectCycle(Node head){
		Node slowptr=head;
		Node fastptr=head;
		boolean cycleExists=false;
		while(fastptr!=null && fastptr.next!=null){
			slowptr=slowptr.next;
			fastptr=fastptr.next.next;
			if(slowptr==fastptr)
			{
				cycleExists=true;
				break;
			}
		}
		if(!cycleExists)
			return null;
		slowptr=head;
		while(slowptr!=fastptr)
		{
			slowptr=slowptr.next;
			fastptr=fastptr.next;
		}
		return fastptr;
		
	}
}
