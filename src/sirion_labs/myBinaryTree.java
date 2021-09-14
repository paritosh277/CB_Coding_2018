package sirion_labs;

import java.util.LinkedList;
import java.util.Scanner;

public class myBinaryTree {
	Scanner scn = new Scanner(System.in);
	
	private class Node{
		int data;
		Node left=null;
		Node right=null;
	}
	
	private Node root;
	
	public myBinaryTree() {
		this.root = construct(null, false);
	}
	
	public Node construct(Node parent, boolean ilc) {
		if(parent == null) {
			System.out.println("Enter data for root node");
		}else {
			if(ilc) {
				System.out.println("Enter data for left child of "+ parent.data);
			}else {
				System.out.println("Enter data for right child of "+ parent.data);
			}
		}
		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;
		nn.left = null;
		nn.right =null;
		
		System.out.println(nn.data +" has left child ?");
		boolean hlc = scn.nextBoolean();
		
		if(hlc) {
			nn.left=construct(nn, hlc);
		}
		
		System.out.println(nn.data + " has right child ?");
		boolean hrc = scn.nextBoolean();
		
		if(hrc) {
			nn.right=construct(nn, false);
		}
		
		return nn;
		
	}
	
	public void display() {
		display(this.root);
	}
	
	private void display(Node node) {
		if(node == null) {
			return;
		}
		
		String str = " ";
		
		if(node.left != null) {
			str+= node.left.data;
		}else {
			str+=".";
		}
		
		str+= "<--" + node.data + "-->";
		
		if(node.right != null) {
			str+= node.right.data;
		}else {
			str+=".";
		}
		
//		if (node.left == null) {
//			str += ".";
//		} else {
//			str += node.left.data;
//		}
//
//		str += "-->" + node.data + "<--";
//
//		if (node.right == null) {
//			str += ".";
//		} else {
//			str += node.right.data;
//		}
		
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	
	public int size() {
		return (size(this.root));
	}
	
	private int size(Node node) {
		if(node==null) {
			return 0;
		}
		
		int ls = size(node.left);
		int rs = size(node.right);
		
		return ls+rs+1;
		
	}
	
	public int max() {
		return(max(this.root));
	}
	
	private int max(Node node) {
		
		if(node == null) {
			return Integer.MIN_VALUE;
		}
		
		int lm = max(node.left);
		int rm = max(node.right);
		
		return (Math.max(node.data,Math.max(lm, rm)));
	}
	
	
	public boolean find(int item) {
		return find(this.root, item);
	}
	
	private boolean find(Node node, int item) {
		if(node == null) {
			return false;
		}
		
		if(node.data == item) {
			return true;
		}
		
		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);
		
		return (lf || rf);
	}
	
	public int ht() {
		return ht(this.root);
	}
	
	private int ht(Node node) {
		if(node==null) {
			return -1;
		}
		
		int lht = ht(node.left);
		int rht = ht(node.right);
		
		return Math.max(lht, rht)+1;
	}
	
	public int diameter() {
		return diameter(this.root);
	}
	
	private int diameter(Node node) {
		if(node==null) {
			return 0;
		}
		
		int ld = diameter(node.left);
		int rd = diameter(node.right);
		int sp = ht(node.left) + ht(node.right) + 2;
		
		return (Math.max(sp, Math.max(ld, rd)));
	}
	
	public void preorder() {
		preorder(this.root);
	}
	
	private void preorder(Node node) {
		if(node == null)
			return;
		
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);
	}
	
	
	public void inorder() {
		inorder(this.root);
	}
	
	private void inorder(Node node) {
		if(node == null) {
			return;
		}
		
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	
	public void postorder() {
		postorder(this.root);
	}
	private void postorder(Node node) {
		if(node == null)
			return;
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}
	
	
	public void levelorder() {
		levelorder(this.root);
	}
	
	private void levelorder(Node node) {
		if(node == null) {
			return;
		}
		
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(node);
		
		while(!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			if(rn.left != null) {
				queue.addLast(rn.left);
			}
			
			if(rn.right != null) {
				queue.addLast(rn.right);
			}
		}
		
	}
	
	public void levelorderLineByLine() {
		levelorderLineByLine(this.root);
	}
	
	private void levelorderLineByLine(Node node) {
		if(node == null) {
			return;
		}
		
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(node);
		queue.addLast(null);
		
		while(!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			if(rn==null && !queue.isEmpty()) {
				System.out.println();
				queue.addLast(null);
			}
			
			if(rn!=null) {
				System.out.print(rn.data + " ");
				if(rn.left != null) {
					queue.addLast(rn.left);
				}
				
				if(rn.right != null) {
					queue.addLast(rn.right);
				}
			}
		}
	}

		
	
	
	public void levelorderzz() {
		LinkedList<Node> currentLevel = new LinkedList<>();
		LinkedList<Node> nextLevel = new LinkedList<>();
		
		currentLevel.addFirst(this.root);
		int count=0;
		
		while(!currentLevel.isEmpty()) {
			Node nn = currentLevel.removeFirst();
			System.out.print(nn.data + " ");
			
			if(count%2==0) {
				if(nn.left != null) {
					nextLevel.addFirst(nn.left);
				}
				
				if(nn.right!=null) {
					nextLevel.addFirst(nn.right);
				}
			}else {
				if(nn.right!=null) {
					nextLevel.addFirst(nn.right);
				}
				
				if(nn.left != null) {
					nextLevel.addFirst(nn.left);
				}
			}
			if(currentLevel.isEmpty()) {
				System.out.println();
				currentLevel = nextLevel;
				nextLevel = new LinkedList<>();
				count++;
			}
		
		}
		
		
	}
	
	
//	public void levelOrderZZ() {
//		levelOrderZZ(this.root);
//	}
//	private void levelOrderZZ(Node node) {
//		if(node == null) {
//			return;
//		}
//		
//		LinkedList<Node> queue = new LinkedList<>();
//		
//		queue.addFirst(this.root);
//		int count=1;
//		
//		while(!queue.isEmpty()) {
//			int size = queue.size();
//			
//			for(int i=0;i<size;i++) {
//				Node rn = queue.removeFirst();
//				System.out.print(rn.data+" ");
//			
//				if(count%2!=0) {
//					if(rn.left!=null) {
//						queue.addFirst(rn.left);
//					}
//				
//					if(rn.right!=null) {
//						queue.addFirst(rn.left);
//					}
//				}else {
//					if(rn.left!=null) {
//						queue.addLast(rn.left);
//					}
//				
//					if(rn.right!=null) {
//						queue.addLast(rn.right);
//					}
//				}
//			}
//			count++;
//		}
//		
//	}

	
	public void levelorderzzend() {
		LinkedList<Node> currentLevel = new LinkedList<>();
		LinkedList<Node> nextLevel = new LinkedList<>();
		
		currentLevel.addFirst(this.root);
		int count=0;
		System.out.print(this.root.data + " ");
		
		while(!currentLevel.isEmpty()) {
			Node nn = currentLevel.removeFirst();
//			System.out.print(nn.data + " ");
			
			if(count%2==0) {
				if(nn.left != null) {
					nextLevel.addFirst(nn.left);
				}
				
				if(nn.right!=null) {
					nextLevel.addFirst(nn.right);
				}
			}else {
				if(nn.right!=null) {
					nextLevel.addFirst(nn.right);
				}
				
				if(nn.left != null) {
					nextLevel.addFirst(nn.left);
				}
			}
			
			
			if(currentLevel.isEmpty()) {
				
				if(!nextLevel.isEmpty()) {
					Node ans = nextLevel.getFirst();
					System.out.print(ans.data + " ");
				}
				currentLevel = nextLevel;
				nextLevel = new LinkedList<>();
				count++;
			}
		
		}
		
		
	}
	
	public int findDist(int item) {
		return findDist(this.root, item);
	}
	
	private int findDist(Node root, int item) {
		if(root==null) {
			return -1;
		}
		
		if(root.data==item) {
			return 0;
		}
		
		int left = findDist(root.left, item);
		int right = findDist(root.right, item);
		
		if(left==-1 && right==-1) {
			return -1;
		}else {
			return Math.max(left, right)+1;
		}
	}
	
	public void printLeafNodes() {
		System.out.println(printLeafNodes(this.root));
		
	}
	
	private int printLeafNodes(Node root) {
		if(root==null) {
			return 0;
		}
		
		if(root.left==null && root.right==null) {
			System.out.print(root.data+ " ");
			return 1;
		}
		
		int left = printLeafNodes(root.left);
		int right = printLeafNodes(root.right);
		
		return left+right;
	}
	
	public void boundaryLevelTraversal() {
		System.out.print(this.root.data+ " ");
		printleftBoundary(root.left);
		printleafBoundary(this.root);
		printrightBoundary(root.right);
		
	}
	
	public void printleftBoundary(Node root) {
		if(root==null) {
			return;
		}
		
		// if leaf node, ignore while printing edges
		if(root.left==null && root.right==null) {
			return;
		}
		
		System.out.print(root.data+" ");
		
		// If left is null, right will be the boundary edge
		if(root.left==null) {
			printleftBoundary(root.right);
		}else {
			printleftBoundary(root.left);
		}

		
	}
	
	public void printleafBoundary(Node root) {
		if(root==null) {
			return;
		}
		
		//Whenever you encounter leaf node, print it.
		if(root.left==null && root.right==null) {
			System.out.print(root.data+ " ");
			return;
		}
		
		printleafBoundary(root.left);
		printleafBoundary(root.right);
		
	}
	
	public void printrightBoundary(Node root) {
		if(root==null) {
			return;
		}
		
		// if leaf node, ignore while printing edges
		if(root.left==null && root.right==null) {
			return;
		}
		
		// If right is null, left will be the boundary edge
		if(root.right==null) {
			printrightBoundary(root.left);
		}else {
			printrightBoundary(root.right);
		}
		
		System.out.print(root.data+" ");

		
	}
	
	public void printRootToLeafPaths() {
		printRootToLeafPaths(this.root," ");
	}
	
	private void printRootToLeafPaths(Node root, String ans) {
		if(root==null) {
			return;
		}
		
		if(root.left==null && root.right==null) {
			ans=ans+" "+root.data;
			System.out.println(ans);
			return;
		}
		
		ans=ans+" "+root.data;
		printRootToLeafPaths(root.left, ans);
		printRootToLeafPaths(root.right, ans);
		
		
	}
	
	public void mirrorOfBinaryTree() {
		mirrorOfBinaryTree(this.root);
		display();
	}
	
	private void mirrorOfBinaryTree(Node root) {
		if(root==null) {
			return;
		}
		
		mirrorOfBinaryTree(root.left);
		mirrorOfBinaryTree(root.right);
		
		 /* swap the left and right pointers */
		Node temp = root.left;
		root.left=root.right;
		root.right=temp;
	}
	
	
	public static void main(String[] args) {
		
//		20 true 8 true 4 false false true 12 true 10 false false true 14 false false true 22 false true 25 false false
		 
		//40 true 20 true 10 false true 5 false true 45 false false true 30 false false true 60 true 50 false true 55 false false true 70 false false
		myBinaryTree bt = new myBinaryTree();
		bt.display();
		
		System.out.println("**************");
//		bt.printLeafNodes();
//		bt.boundaryLevelTraversal();
//		bt.printRootToLeafPaths();
//		bt.mirrorOfBinaryTree();
		
//		System.out.println(bt.findDist(15));
//		bt.levelOrderZZ();
//		System.out.println(bt.size());
//		System.out.println("**************");
//		System.out.println(bt.max());
//		System.out.println("**************");
//		System.out.println(bt.find(22));
//		System.out.println(bt.ht());
//		System.out.println(bt.diameter());
//		bt.preorder();
//		System.out.println();
//		bt.postorder();
//		System.out.println();
//		bt.inorder();
//		System.out.println();
		System.out.println("************** LEVEL ORDER");
		bt.levelorder();
		System.out.println();
		System.out.println("************** LEVEL ORDER ZIG ZAG");
		bt.levelorderzz();
		System.out.println("************** LEVEL ORDER ZIG ZAG END");
		bt.levelorderzzend();

	}

}
