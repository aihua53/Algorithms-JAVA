package algorithm.java;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		//PrintGraph.printDiamond(9);
		BinaryTree bt = new BinaryTree(6);
		bt.addNode(bt.getRoot(), 1);
		bt.addNode(bt.getRoot(), 3);
		bt.addNode(bt.getRoot(), 4);
		bt.addNode(bt.getRoot(), 5);
		bt.addNode(bt.getRoot(), 8);
		
		System.out.println(bt.maxDepth(bt.getRoot()));
		

	}
}