package ctci.chapter2;

import java.util.HashSet;

public class Problem1 {
	public static void main(String[] args) {
		Node head1 = new Node(1);
		for (int i = 1; i < 6; i++)
			head1.appendToTail(i);
		for (int i = 1; i < 6; i++)
			head1.appendToTail(i);
		System.out.println("before removing duplicates");
		head1.printLinkedList();
		Problem1 obj = new Problem1();
		obj.removeDups(head1);
		System.out.println();
		System.out.println("After removing duplicates");
		head1.printLinkedList();

	}

	public Node removeDups(Node head) {
		if (head == null)
			return head;
		HashSet<Integer> set = new HashSet<Integer>();
		Node curr = head;
		Node prev = null;

		while (curr != null) {
			if (!set.contains(curr.data)) {
				set.add(curr.data);
				if (prev == null)
					prev = curr;
				else {
					prev.next = curr;
					prev = prev.next;
				}
			}
			curr = curr.next;
		}
		prev.next = null;
		return head;
	}

	public Node removeDupsII(Node head) {
		if (head == null)
			return head;
		Node curr = head;
		while (curr != null) {
			Node fast = curr.next;
			while (fast != null) {
				if (curr.data == fast.data)
					curr.next = fast.next;
				fast = fast.next;
			}
			// System.out.println();
			// head.printLinkedList();
			curr = curr.next;
		}
		return head;
	}

}
