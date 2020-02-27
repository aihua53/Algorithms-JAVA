package algorithm.java;

public class DoublelyLinkedList {
	DLLNode insert(DLLNode head,DLLNode node,int p) {
		DLLNode currentHead = head;
		DLLNode currentNode = head;
		int i = 1;
		if(head != null) {
			if(p == 1) {
				currentHead = node;
				currentHead.setNext(head); 
				head.setPrevious(currentHead);
			}else {
				for(i=1;i<=p;i++) {
					if(currentNode.getNext() == null && i<p) {
						
						currentNode.setNext(node);
						node.setPrevious(currentNode);
						node.setNext(null);
						break;
					}else if(i == p) {
						currentNode.getPrevious().setNext(node);
						node.setPrevious(currentNode.getPrevious());
						node.setNext(currentNode);
						currentNode.setPrevious(node);
					}
					currentNode = currentNode.getNext();
				}

			}
			
		}else {
			return node;
		}
		return currentHead;
	}
	
	public int listLength(DLLNode head) {
		int l = 0;
		DLLNode listNode = head;
		while(listNode != null) {
			l++;
			listNode = listNode.getNext();
		}
		return l;
	}

}
