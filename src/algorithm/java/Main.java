package algorithm.java;

import java.util.*;

public class Main{
	public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(0);
//		bt.addNode(bt.getRoot(), -3);
//		bt.addNode(bt.getRoot(), -10);
//		bt.addNode(bt.getRoot(), 9);
//		bt.addNode(bt.getRoot(), 5);
//		bt.preOrder(bt.getRoot());
		
        int[] a = {-10,-3,0,5,9};
        BinaryTree.TreeNode root = bt.sortedArrayToBST(a);
        bt.preOrder(root);
		

	}
}