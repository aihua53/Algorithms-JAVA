package algorithm.java;

import algorithm.java.ListNode;;


public class SinglyLinkedList{


	public static void printList(ListNode head) {
		ListNode n = head;
		while( n!= null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}

	public int listLength(ListNode head) {
		int l = 0;
		ListNode listNode = head;
		while(listNode != null) {
			l++;
			listNode = listNode.getNext();
		}
		return l;
	}

	public ListNode insert(ListNode head,ListNode node,int p) {
		ListNode currentHead = head;
		ListNode currentNode = head;
		if(p ==1) {
			currentHead = node;
			currentHead.setNext(head);
		}else {
			for(int i=1;i<p-1;i++) {
				currentNode = currentNode.getNext();
			}
			if(currentNode.getNext() == null) {
				currentNode.setNext(node);
				node.setNext(null);
			}else {
				node.setNext(currentNode.getNext());
				currentNode.setNext(node);
			}
		}
		return currentHead;
	}

	public ListNode delete(ListNode head,int p) {
		ListNode currentHead = head;
		ListNode currentNode = head;
		if(p == 1) {
			currentHead = head.getNext();
		}else {
			for(int i=1;i<p-1;i++) {
				currentNode = currentNode.getNext();
			}
			if(currentNode.getNext() == null) {
				currentNode.setNext(null);
			}else {
				currentNode.setNext(currentNode.getNext().getNext());
			}

		}
		return currentHead;
	}

	public void deleteAll(ListNode head) {
		ListNode currentNode, iterator = head;
		while(iterator !=null) {
			currentNode = iterator.getNext();
			iterator = null;
			iterator = currentNode;
		}
	}
	

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = l1;
		ListNode p = l1;
		ListNode temp = l2;
		while(l1 != null && l2 != null) {
			if(l1.getData()<l2.getData()) {
				p = l1;
				l1 = l1.getNext();
			}else {
				if(head == l1) {
					head = l2;
				}else {
					p.setNext(l2);
				}
				temp = l2.getNext();
				l2.setNext(l1);
				p = l2;
				l2 = temp;
			}

		}
		if(l1 == null) {
			p.setNext(l2);
		}
		return head;
	}

    public ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.getData() <= l2.getData()) {
                prev.setNext(l1);
                l1 = l1.getNext();
            } else {
                prev.setNext(l2);
                l2 = l2.getNext();
            }
            prev = prev.getNext();
        }

        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.setNext(l1 == null ? l2 : l1);

        return prehead.getNext();
    }

	public ListNode mergeTwoLists_3(ListNode l1, ListNode l2) {
		ListNode head =null;
		ListNode previous =null;
		if(l1.getData()<l2.getData()) {
			head = l1;
			l1 = l1.getNext();
		}else {
			head = l2;
			l2 = l2.getNext();
		}
		previous = head;
		merge(l1,l2,previous);
		return head;
	}
	public void merge(ListNode n1,ListNode n2,ListNode p) {
		if(n1 == null) {
			p.setNext(n2);
		}else if(n2 == null){
			p.setNext(n1);
		}else {
			if(n1.getData()<n2.getData()) {
				p.setNext(n1);
				n1 = n1.getNext();
			}else {
				p.setNext(n2);
				n2 = n2.getNext();
			}
			p = p.getNext();
			merge(n1,n2,p);
		}
	}

}

