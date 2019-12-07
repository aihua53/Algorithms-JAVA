package algorithm.java;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.javafx.collections.ArrayListenerHelper;

class BinaryTree{
	
	private TreeNode root;
	private Object TreeNode;	

	class TreeNode{
		private int value;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			value = data;
		}	
	}

	public BinaryTree(int value) {
		root = new TreeNode(value);
	}
	
	public TreeNode getRoot() {
		return root;
	}
	

	
	/* 
	 * leetcode #94
	 * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
	 * infix traverse
	 */
	
	public void infixOrder(TreeNode current) {
		if(current != null) {
			infixOrder(current.left);
			System.out.print(current.value+" ");
			infixOrder(current.right);
		}
	}
	
	/*
	 * pre traverse
	 */
	
	public void preOrder(TreeNode current) {
		if(current != null) {
			System.out.print(current.value+" ");
			preOrder(current.left);
			preOrder(current.right);
		}
	}
	
	/*
	 * post traverse
	 */
	
	public void postOrder(TreeNode current) {
		if(current != null) {
			postOrder(current.left);
			postOrder(current.right);
			System.out.print(current.value+" ");
		}
	}
	/*
	 * add node
	 */
	public TreeNode addNode(TreeNode current, int value) {
		if(current == null) {
//			System.out.println("new "+value);
			return new TreeNode(value);
		}
//		System.out.println("add "+current.value);
		if(value < current.value) {
			current.left = addNode(current.left,value);
		}else if(value > current.value) {
			current.right = addNode(current.right,value);
		}else {
			return current;
		}
		return current;
	}
	
	
	/*
	 * leetcode #100
	 * 锟斤拷同锟斤拷锟斤拷
	 */
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p != null && q != null) {
			if(p.value != q.value) {
				return false;
			}
			if(isSameTree(p.left, q.left) && isSameTree(p.right,q.right)){
				return true;
			}
		}else if(p == null && q == null) {
			return true;
		}
	    return false;
	}
	
	/*
	 * leetcode #101
	 * 锟皆称讹拷锟斤拷锟斤拷
	 */
	public static boolean isSymmetric(TreeNode root) {
		return isMirror(root,root);
	}
	
	public static boolean isMirror(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null) {
			return true;
		}	
		if(t1 ==null || t2 == null) {
			return false;
		}
		if((t1.value == t2.value)&&isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left)) {
			return true;
		}
		return false;
		
	}
	
	/*
	 * leetcode #104
	 * 浜屽弶鏍戠殑鏈�澶ф繁搴�
	 */
	public int maxDepth(TreeNode root) {
		int leftDepth = 0;
		int rightDepth = 0;
		if(root.left == null && root.right == null)
			return 0;
		if(root.left != null) {
			leftDepth = maxDepth(root.left);
		}
		if(root.right != null) {
			rightDepth = maxDepth(root.right);
		}
		return (leftDepth>rightDepth)?leftDepth+1:rightDepth+1;
	}
	

	/*
     * leetcode #108
	 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
	 */
	public TreeNode sortedArrayToBST_1(int[] nums) {
		TreeNode tN = new TreeNode(nums[nums.length/2]);
		TreeNode tNL,tNR;
		int[] left,right;
		if(nums.length<2) {
			return tN;
		}else if(nums.length<3) {
			tNL = new TreeNode(nums[0]);
			tN.left = tNL;
		}else {
			left = new int[nums.length/2];
			for(int i=0;i<nums.length/2;i++) {
				left[i] = nums[i];
			}
			tNL = sortedArrayToBST_1(left);
			tN.left = tNL;

			int length = (nums.length%2!=0)?(nums.length/2):(nums.length/2-1);
			right = new int[length];
			for(int i=0;i<length;i++) {
				right[i] = nums[nums.length/2+1+i];
			}
			tNR = sortedArrayToBST_1(right);
			tN.right = tNR;
		}
		return tN;
	}
	
	public TreeNode sortedArrayToBST_2(int[] nums) {
		return sortedArrayToBST(nums,0,nums.length);
	}
	
	public TreeNode sortedArrayToBST(int[] nums,int start, int end) {
		if(start == end) {
			return null;
		}
		int mid = (start+end)>>>1;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums,start,mid);
		node.right = sortedArrayToBST(nums,mid+1,end);
		return node;
	}
}