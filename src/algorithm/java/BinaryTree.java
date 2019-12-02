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
	 * ���������������
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
	 * ��ͬ����
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
	 * �Գƶ�����
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
	 * 二叉树的最大深度
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
	
}