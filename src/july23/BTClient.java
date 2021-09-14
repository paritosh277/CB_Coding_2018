package july23;

public class BTClient {

	public static void main(String[] args) {
//		BinaryTree bt = new BinaryTree();
//		System.out.println("LCA: "+ bt.findLCA(3, 4));
//		bt.findDistBetwTwoNodes(8, 5);
//		1 true 2 true 4 false false true 5 false false true 3 true 6 false true 8 false false true 7 false false
		
//		bt.leftView();
//		System.out.println();
//		bt.rightView();
//		BinaryTree bt2 = new BinaryTree();
//		System.out.println(bt.isStructurallyIdentical(bt2));
		int[] in = { 4, 8, 2, 5, 1, 6, 3, 7 };
		int[] post = { 8, 4, 5, 2, 6, 7, 3, 1 };
		BinaryTree bt = new BinaryTree(post, in);
//		bt.constructTreeUsingPostAndIn(post, in);
//		System.out.println("The given binary tree is "+ bt.isBst());
		bt.display();
//		bt.preorder();
//		System.out.println();
//		bt.inorder();
//		System.out.println();
//		bt.postorder();
//		bt.isBST();
		// 10 true 20 true 40 false false true 50 true 80 false false false true 30 true 60 false false true 70 false false
		// bt.display();
		// System.out.println(bt.size());
		// System.out.println(bt.max());
		// System.out.println(bt.find(70));
//		 System.out.println(bt.ht());
//		 System.out.println(bt.diameter());
//		 System.out.println(bt.size());
		// bt.preorder();
		// System.out.println();
		// bt.inorder();
		// System.out.println();
		// bt.postorder();
		// System.out.println();
		// System.out.println(bt.isBalanced());
		//
		//
		// bt.

	}

}
