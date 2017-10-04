package ctci.chapter2;

public class Problem7 {

	/**
	 * Leetcode Problem 160
	 * @param headA
	 * @param headB
	 * @return
	 */
	
	public Node getIntersectionNode(Node headA, Node headB){
		if(headA==null || headB==null)
			return null;
		Node runnerA=headA;
		//Node runnerB=headB;
		while(runnerA.next!=null)
			runnerA=runnerA.next;
		runnerA.next=headB;
		/*Node runnerB=headB.next;
		while(runnerB !=null || runnerB != runnerA)
			runnerB=runnerB.next;
		if(runnerB==null) //No cycle exists
		{
			runnerA.next=null; //removing the extra link which was created
			return null;
		}
		Node slow=headA;
		while(slow!=runnerB){
			slow=slow.next;
			runnerB=runnerB.next;
		}
		runnerA.next=null;*/
		Node res = detectCycle(headA);
		runnerA.next=null;
		return res;
	}
	
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
