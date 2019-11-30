package algorithm.java;



class BinaryTree{
	
	private TreeNode root;	

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
	 * 二叉树的中序遍历
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
	 * 相同的数
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
}