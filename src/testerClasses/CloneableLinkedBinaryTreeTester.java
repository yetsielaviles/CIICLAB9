package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class CloneableLinkedBinaryTreeTester {

	public static void main(String[] args) throws CloneNotSupportedException { 
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree(); 
		Utils.displayTree("Original content of tree t: ", t);
		
		LinkedBinaryTree<Integer> clone =  t.clone();
		Utils.displayTree("clone of t: ", clone);
	}

}