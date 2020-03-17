package algorithm.java;

import java.util.*;

public class Main{
	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		//ListNode node5 = new ListNode(4);
		
		sll.insert(l1, node2, 2);
		sll.insert(l1, node3, 3);
		sll.insert(l1, node4, 4);
		SinglyLinkedList.printList(l1);
		
//		sll.insert(l2, node3, 2);
		//sll.insert(l2, node5, 3);

		
//		System.out.println("***");
//		SinglyLinkedList.printList(l2);
//		System.out.println("***");

		//ListNode l = sll.swapPairs_2(l1);
		node4.setNext(node2);
		int pos = sll.hasCycle_2(l1);
		System.out.println(pos);
//		SinglyLinkedList.printList(l1);

	}
}