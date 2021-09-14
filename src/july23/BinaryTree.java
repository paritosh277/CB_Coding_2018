package july23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class BinaryTree {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;
		Node(){
			left=null;
			right=null;
		}
	}

	private Node root;
	
	
	
	private class MinMax{
		boolean isBST;
		int size;
		int min;
		int max;
		MinMax(){
			isBST=true;
			size=0;
			min=Integer.MAX_VALUE;
			max=Integer.MIN_VALUE;
		}
	}

	public BinaryTree() {
		this.root = construct(null, false);
	}

	public Node construct(Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter the data for root node ?");
		} else {
			if (ilc) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;
		

		System.out.println(nn.data + " has left child?");
		boolean hlc = scn.nextBoolean();

		if (hlc) {
			nn.left = construct(nn, hlc);
		}

		System.out.println(nn.data + " has right child?");
		boolean hrc = scn.nextBoolean();

		if (hrc) {
			nn.right = construct(nn, false);  //put hrc = false
		}

		return nn;

	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}

		String str = " ";
		if (node.left == null) {
			str += ".";
		} else {
			str += node.left.data;
		}

		str += "-->" + node.data + "<--";

		if (node.right == null) {
			str += ".";
		} else {
			str += node.right.data;
		}

		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = size(node.left);
		int rs = size(node.right);

		return ls + rs + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lm = max(node.left);
		int rm = max(node.right);

		return Math.max(node.data, Math.max(lm, rm));
	}

	public boolean find(int item) {

		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (node == null) {
			return false;
		}

		if (node.data == item) {
			return true;
		}
		boolean lf = find(node.left, item);
		boolean rf = find(node.right, item);

		return lf || rf;

	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int hl = ht(node.left);
		int hr = ht(node.right);

		return Math.max(hl, hr) + 1;
	}

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(Node node) {
		if (node == null) {
			return 0;
		}

		int ld = diameter(node.left);
		int rd = diameter(node.right);

		int sp = ht(node.left) + ht(node.right) + 2 +1; // self participation++ //1 maine baad me likha hai

		return Math.max(sp, Math.max(ld, rd));
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.data + " ");
		preorder(node.left);

		preorder(node.right);
	}

	public void inorder() {
		inorder(this.root);
	}

	private void inorder(Node node) {
		if (node == null) {
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
		if (node == null) {
			return;
		}

		postorder(node.left);

		postorder(node.right);
		System.out.print(node.data + " ");
	}

	private class balancePair {
		boolean isBalance;
		int height;
	}

	public boolean isBalanced() {
		return isBalanced(this.root).isBalance;
	}

	private balancePair isBalanced(Node node) {
		if (node == null) {
			balancePair bb = new balancePair();
			bb.isBalance = true;
			bb.height = -1;
			return bb;
		}

		balancePair leftB = isBalanced(node.left);
		balancePair rightB = isBalanced(node.right);
		balancePair selfB = new balancePair();

		selfB.height = Math.max(leftB.height, rightB.height) + 1;
		int bfactor = Math.abs(leftB.height - rightB.height);
		if (leftB.isBalance && rightB.isBalance && bfactor <= 1) {
			selfB.isBalance = true;

		}
		return selfB;
	}

	private class OrderPair {
		Node node;
		Boolean selfdone;
		Boolean leftdone;
		Boolean rightdone;
	}

	public void preorderI() {
		LinkedList<OrderPair> stack = new LinkedList<>();

		while (!stack.isEmpty()) {

		}

	}

//	public BinaryTree(int[] pre, int[] in) {
//		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
//	}

//	private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
//		if (plo > phi || ilo > ihi) {
//			return null;
//		}
//
//		Node nn = new Node();
//		nn.data = pre[plo];
//		int si = -1;
//
//		for (int i = ilo; i <= ihi; i++) {
//			if (in[i] == nn.data) {
//				si = i;
//				break;
//			}
//		}
//		int nel = si - ilo;
//		nn.left = construct(pre, plo + 1, plo + nel, in, ilo, si - 1);
//		nn.right = construct(pre, plo + nel + 1, phi, in, si + 1, ihi);
//
//		return nn;
//
//	}
//	
	public BinaryTree(int[] post, int[] in) {
		this.root = construct(post, 0, post.length-1, in, 0, in.length-1);
	}
	
//	public void constructTreeUsingPostAndIn(int[] post, int[] in) {
//		this.root = constructTreeUsingPostAndIn(post, 0, post.length-1, in, 0, in.length-1);
//	}
	
	public Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
		if(plo>phi || ilo>ihi) {
			return null;
		}
		
		Node nn = new Node();
		nn.data=post[phi];
		int si=-1;
		
		for(int i=ilo; i<=ihi; i++) {
			if(nn.data==in[i]) {
				si=i;
				break;
			}
		}
		
		int nel = si-ilo;
		nn.left = construct(post, plo, plo+nel-1, in, ilo, si-1);
		nn.right = construct(post, plo+nel, phi-1, in, si+1, ihi);
		return nn;
	}
	

	private class BSTPair {
		Node largestBSTRootNode;
		int size = 0;
		boolean isBST = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
	}

	public void isBST() {
		BSTPair res = isBST(this.root);
		System.out.println(res.largestBSTRootNode.data);
		System.out.println(res.size);
	}

	private BSTPair isBST(Node node) {
		if (node == null) {
			return new BSTPair();
		}

		BSTPair lp = isBST(node.left);
		BSTPair rp = isBST(node.right);

		BSTPair sp = new BSTPair();

		sp.max = Math.max(node.data, Math.max(lp.max, rp.max));
		sp.min = Math.min(node.data, Math.min(lp.min, rp.min));

		if (lp.isBST && rp.isBST && node.data > lp.max && node.data < rp.min) {
			sp.largestBSTRootNode = node;
			sp.isBST = true;
			sp.size = lp.size + rp.size + 1;
		} else {
			sp.isBST = false;

			if (lp.size > rp.size) {
				sp.size = lp.size;
				sp.largestBSTRootNode = lp.largestBSTRootNode;
			} else {
				sp.size = rp.size;
				sp.largestBSTRootNode = rp.largestBSTRootNode;
			}
		}
		return sp;
	}
	
	public boolean isStructurallyIdentical(BinaryTree other) {
		return isStructurallyIdentical(this.root, other.root);
	}
	
	private boolean isStructurallyIdentical(Node fnode, Node snode) {
		//Both trees are empty
		if(fnode==null && snode ==null) {
			return true;
		}
		
		//One tree is empty other is not
		if(fnode==null || snode ==null) {
			return false;
		}
		
		//Both trees are not empty, recursively check for left and right subtrees
		//(fnode.data==snode.data) 
		boolean ans = (isStructurallyIdentical(fnode.left, snode.left) && isStructurallyIdentical(fnode.right, snode.right));
		return ans;
	}
	
	public boolean isBst() {
		return isBst(Integer.MIN_VALUE, Integer.MAX_VALUE, this.root);
	}
	
	private boolean isBst(int low, int high, Node node) {
		if(node==null) {
			return true;
		}
		
		if(node.data<=low ||node.data>=high) {
			return false;
		}
		
		boolean lans = isBst(low, node.data, node.left);
		boolean rans = isBst(node.data, high, node.right);
		
		if(lans==false || rans==false) {
			return false;
		}else {
			return true;
		}
	}
	
	public int largestBST() {
		MinMax mm = largestBST(this.root);
		return mm.size;
	}
	
	public MinMax largestBST(Node node) {
		if(node==null) {
			MinMax m1 = new MinMax();
			return m1;
		}
		
		MinMax leftMinMax = largestBST(node.left);
		MinMax rightMinMax = largestBST(node.right);
		
		MinMax m = new MinMax();
		
		if(leftMinMax.isBST==false || rightMinMax.isBST==false || leftMinMax.max>node.data || rightMinMax.min<=node.data) {
			m.isBST=false;
			m.size=Math.max(leftMinMax.size, rightMinMax.size);
			return m;
		}
		
		
		m.isBST=true;
		m.size=leftMinMax.size+rightMinMax.size+1;
		
		if(node.left!=null) {
			m.min = leftMinMax.min;
		}else {
			m.min=node.data;
		}
		
		if(node.right!=null) {
			m.max = rightMinMax.max;
		}else {
			m.max=node.data;
		}
		
		return m;
		
	}
	
	public void leftView() {		//Print First element of each level order traversal
		leftView(this.root);
	}
	
	private void leftView(Node node) {
		if(node==null) {
			return;
		}
		
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(node);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0;i<size;i++) {
				Node ans = queue.removeFirst();
				
				if(i==0) {
					System.out.print(ans.data + " ");
				}
				
				if(ans.left!=null) {
					queue.addLast(ans.left);
				}
				
				if(ans.right!=null) {
					queue.addLast(ans.right);
				}
			}
		}
	}
	
	public void rightView() {			//Print last element of each level order traversal
		rightView(this.root);
	}
	
	private void rightView(Node node) {
		if(node==null) {
			return;
		}
		
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(node);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0;i<size;i++) {
				Node ans = queue.removeFirst();
				
				if(i==size-1) {
					System.out.print(ans.data + " ");
				}
				
				if(ans.left!=null) {
					queue.addLast(ans.left);
				}
				
				if(ans.right!=null) {
					queue.addLast(ans.right);
				}
			}
		}
	}
	
	public int findLCA(int target1, int target2) {
		ArrayList<Integer> path1 = new ArrayList<>();
		ArrayList<Integer> path2 = new ArrayList<>();
		findLCA(this.root,target1, path1);
		findLCA(this.root,target2, path2);
		int i;
//		for(i=0; i<path1.size(); i++) {
//			for(int j=0; j<path2.size(); j++) {
//				if(path1.get(i)==path2.get(j)) {
//					System.out.println(path2.get(j));
//					return(path1.get(i));
//				}
//			}
//		}
		
		for (i = 0; i < path1.size() && i < path2.size() ; i++) {
		        if (path1.get(i) != path2.get(i)) {
		            break; 
				}
		}	
		return path1.get(i-1);
		
		
		
	}
	
	private int findLCA(Node root, int target, ArrayList<Integer> path) {
		if(root==null) {
			return 0;
		}
		
		if(root.data==target) {
			path.add(0, root.data);
			return 1;
		}
		
		int left = findLCA(root.left, target, path);
		int right = findLCA(root.right, target, path);
		
		if(left==1||right==1) {
			path.add(0, root.data);
			return 1;
		}else {
			return 0;
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
	
	public void findDistBetwTwoNodes(int target1, int target2) {
		int dist1 = findDist(target1);
		int dist2 = findDist(target2);
		int lca = findLCA(target1, target2);
		int dist3 = findDist(lca);
		System.out.println("**** DISTANCE BETWEEN TWO NODES *****");
		System.out.println(dist1+dist2-(2*dist3));
	}
	

}
