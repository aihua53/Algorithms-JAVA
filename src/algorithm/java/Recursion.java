package algorithm.java;


public class Recursion{
	
	/**
	* leetcode #21
	    * 合并两个有序链表
	*/
	public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2)  {
		if(l1 == null) {
			return l2;
		}else if(l2 == null) {
			return l1;
		}else if(l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next,l2);
			return l1;
		}else {
			l2.next = mergeTwoLists(l1,l2.next);
			return l2;
		}

	}
	
	

/**
 * 求两个数的最大公约数
 */
	public static int gcd(int a, int b) {
		return a%b==0?b:gcd(b,a%b);
	}
}