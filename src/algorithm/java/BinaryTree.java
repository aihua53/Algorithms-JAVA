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
	 * traverse
	 */
	
	public void infixorder(TreeNode current) {
		if(current != null) {
			System.out.print(current.value+" ");
			infixorder(current.left);
			infixorder(current.right);
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
	 * is the same?
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