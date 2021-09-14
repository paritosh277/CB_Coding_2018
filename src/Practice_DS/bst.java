package Practice_DS;

import java.util.ArrayList;
import java.util.LinkedList;





public class bst {
	
	private class Node{
		int data;
		Node left;
		Node right;
		
		Node(){
			left = null;
			right = null;
		}
	}
	
	private Node root;
	
	public void construct(int[] in) {
		this.root = construct(in, 0, in.length-1);
	}
	
	private Node construct(int[] in, int lo, int hi) {
		if(lo > hi) {
			return null;
		}
		
		int mid = (lo+hi)/2;
		
		Node nn = new Node();
		nn.data = in[mid];
		nn.left = construct(in, lo, mid-1);
		nn.right = construct(in, mid+1, hi);
		return nn;
		
		
	}
	
	public void add(int item) {
		this.root = add(this.root, item);
	}
	
	private Node add(Node root, int item) {
		if(root==null) {
			Node nn = new Node();
			nn.data=item;
			return nn;
		}
		
		if(item<root.data) {
			root.left=add(root.left,item);
		}else if(item>root.data) {
			root.right = add(root.right, item);
		}
//		else {
//			return root;
//		}
//		
		return root;
	}
	
	
	public void display() {
		display(this.root);
	}
	
	private void display(Node root) {
		if(root==null) {
			return;
		}
		
		String str = " ";
		if(root.left!=null) {
			str+=root.left.data;
		}else {
			str+=".";
		}
		
		str+= "<-" + root.data + "->";
		
		if(root.right!=null) {
			str+=root.right.data;
		}else {
			str+=".";
		}
		System.out.println(str);
		
		
		display(root.left);
		display(root.right);
		
//		return;
	}
	
	public int ht() {	//No. of edges in the longest path from root node to leaf node (Height of tree)
		return ht(this.root);
	}
	
	private int ht(Node node) {
		if(node == null) {
			return -1;
		}
		
		int lht = ht(node.left);
		int rht = ht(node.right);
		
		int ans = Math.max(lht, rht)+1;
		return ans;
	}
	
	public boolean find(int item) {
		return find(this.root, item);
	}
	
	private boolean find(Node node, int item) {
		if(node == null) {
			return false;
		}
		
		
		boolean ans;
		if(item == node.data) {
			return true;
		}else if(item<node.data) {
			return find(node.left, item);
		}else {
			return find(node.right, item);
		}
//		return ans;
	}
	
	public int max() {
		return max(this.root);
	}
	
	private int max(Node node) {
		if(node.right==null) {
			return node.data;
		}
		
//		int ans = max(node.right);
//		return ans;
		
		return max(node.right);
	}
	
	public int size() {			//Code of height and size are similar 
		return size(this.root);
	}
	
	private int size(Node node) {
		if(node == null) {
			return 0;
		}
		
		int ls = size(node.left);
		int rs = size(node.right);
		
		return ls+rs+1;
	}
	
	public void printInRange(int lo, int hi) {
		printInRange(this.root, lo, hi);
	}
	
	private void printInRange(Node node, int lo, int hi) {
		if(node == null) {
			return;
		}
		
		
		if(node.data>lo) {
			printInRange(node.left, lo, hi);
		}
		if(node.data>=lo && node.data<=hi) {
			System.out.print(node.data + " ");
		}
		
		if(node.data<hi) {
			printInRange(node.right, lo, hi);
		}	
	}
	
	public void printInDec() {
		printInDec(this.root);
	}
	
	private void printInDec(Node node) {
		if(node == null) {
			return;
		}
		
		printInDec(node.right);
		System.out.print(node.data+ " ");
		printInDec(node.left);
	}
	
	public void remove(int item) {
		remove(this.root, null, item);
	}
	
	private void remove(Node node, Node parent, int item) {
//		if(node==null) {
//			return;
//		}
		
		if(item<node.data) {
			remove(node.left, node, item);
		}else if(item>node.data) {
			remove(node.right, node, item);
		}else {
			if(node.left==null && node.right==null) {
				if(parent.left==node) {
					parent.left=null;
				}else {
					parent.right=null;
				}
			}else if(node.left!=null && node.right==null) {
				if(parent.left==node) {
					parent.left=node.left;
				}else {
					parent.right=node.left;
				}
			}else if(node.left==null && node.right!=null) {
				if(parent.left==node) {
					parent.left=node.right;
				}else {
					parent.right=node.right;
				}
			}else {
				int temp=max(node.left);
				remove(node.left, node ,temp);
				node.data=temp;
			}
			
			
		}
	}
	
	public void sumAtLevelK(int k) {
		System.out.println(sumAtLevelK(this.root, k));;
	}
	
	private int sumAtLevelK(Node node, int k) {
		if(node == null) {
			return 0;
		}
		
		if(k<=0) {
			return node.data;
		}
		
		int l = sumAtLevelK(node.left, k-1);
		int r = sumAtLevelK(node.right, k-1);
		
		return l+r;
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
	
	public int isBalanced() {
		return isBalanced(this.root);
	}
	private int isBalanced(Node node) {
		if(node==null) {
			return -1;
		}
		
		int lht=isBalanced(node.left);
		int rht=isBalanced(node.right);
		
		if(Math.abs(lht-rht)>1) {
			return -1;
		}else {
			return Math.max(lht, rht)+1;
		}
	}
	
	public boolean isStructurallyIdentical(bst other) {
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
	
	public void createTreeUsingPreandIn(int[] pre, int[] in) {
		this.root=createTreeUsingPreandIn(pre, 0, pre.length-1, in, 0, in.length-1);
	}
	
	
	
	private Node createTreeUsingPreandIn(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
		if (plo > phi || ilo > ihi) {
			return null;
		}

		Node nn = new Node();
		nn.data = pre[plo];
		int si = -1;

		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == nn.data) {
				si = i;
				break;
			}
		}
		int nel = si - ilo;
		nn.left = createTreeUsingPreandIn(pre, plo + 1, plo + nel, in, ilo, si - 1);
		nn.right = createTreeUsingPreandIn(pre, plo + nel + 1, phi, in, si + 1, ihi);

		return nn;

	}
	
	
	public void modifyBST() {
		int[] arr= {0};
//		int sum =0;
		modifyBST(this.root, arr);
	}
	
	private void modifyBST(Node node, int[] sum) {
		if(node==null) {
			return;
		}
		
		modifyBST(node.right, sum);
//		int temp = node.data;
//		sum=sum+temp;
//		node.data=sum;
		
		sum[0] = sum[0]+node.data;
		node.data=sum[0];
		
		modifyBST(node.left,sum);
	}
	
	public static int sumTree(Node root, int sum) {
		if (root == null)
			return sum;
		sum = sumTree(root.right,sum);
		root.data+=sum;
		sum = sumTree(root.left,root.data);
		return sum;
	}
	
	
	public void ancestor(int target) {
		int ans = ancestor(this.root,target);
	}
	
	private int ancestor(Node node, int target) {
		if(node==null) {
			return 0;
		}
		
		if(node.data==target) {
			return 1;
		}
		
		
		int lans = ancestor(node.left,target);
		int rans = ancestor(node.right, target);
		
		if(lans==1||rans==1) {
			System.out.println(node.data);
			return 1;
		}else {
			return 0;
		}
	}
	
	public void printkDistanceNodes(int k) {
		printkDistanceNodes(this.root, k);
	}
	
	private void printkDistanceNodes(Node node, int k) {
		if(node==null) {
			return;
		}
		
		if(k==0) {
			System.out.print(node.data+ " ");
//			return;
		}
		
		printkDistanceNodes(node.left, k-1);
		printkDistanceNodes(node.right, k-1);
	}
	
	public int findDist(int item) {
		return findDist(this.root, item);
	}
	
	private int findDist(Node root, int item) {
		if(root==null) {
			return -1;
		}
		
		int ans;
		if(root.data==item) {
			return 0;
		}else if(item<root.data) {
			ans = findDist(root.left, item);
		}else {
			ans = findDist(root.right, item);
		}
		
		
		
		if(ans==-1) {
			return -1;
		}else {
			return ans+1;
		}
	}
	
	public int findLCA(int target1, int target2) {
		ArrayList<Integer> path1 = new ArrayList<>();
		ArrayList<Integer> path2 = new ArrayList<>();
		findLCA(this.root,target1, path1);
		findLCA(this.root,target2, path2);
		System.out.println(path1);
		System.out.println(path2);
		int i;
		for(i=0; i<path1.size(); i++) {
			for(int j=0; j<path2.size(); j++) {
				if(path1.get(i)==path2.get(j)) {
					System.out.println(path2.get(j));
					return(path1.get(i));
					
					
				}
			}
			
		}
		return -1;
	}
	
	private int findLCA(Node root, int target, ArrayList<Integer> path) {
		if(root==null) {
			return 0;
		}
		
		if(root.data==target) {
			path.add(root.data);
			return 1;
		}
		
		int left = findLCA(root.left, target, path);
		int right = findLCA(root.right, target, path);
		
		if(left==1||right==1) {
			path.add(root.data);
			return 1;
		}else {
			return 0;
		}
	}
	
	public int sumOfNodes() {
		return sumOfNodes(this.root);
	}
	
	private int sumOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		
		int leftsum = sumOfNodes(root.left);
		int rightsum = sumOfNodes(root.right);
		
		return root.data+leftsum+rightsum;
	}

	public static void main(String[] args) {
		bst bt = new bst();
//		int[] in = {20,30,40,50,60,70,80};
//		int[] in = {1,2,3,4,5,6,7};
//		bt.construct(in);
//		bt.display();
//		bt.leftView();
//		System.out.println();
//		bt.rightView();
	
//		bt.modifyBST();
//		bt.display();
//		int[] in = {8, 4, 10, 9, 11, 2, 5, 1, 6, 3, 7};
//		int[] pre = {1, 2, 4, 8, 9, 10, 11, 5, 3, 6, 7};
//		
//		bt.createTreeUsingPreandIn(pre, in);
//		bt.display();
		
//		bst bt2 = new bst();
//		int[] in = {20,30,40,50,60,70,80};
//		int[] in = {1,3,4,6,7,8,10,13,14};
//		bt.construct(in);
		bt.add(10);
		bt.add(3);
		bt.add(12);
		bt.add(1);
		
		bt.add(4);
		bt.add(11);
		bt.add(13);
		bt.display();
		
		System.out.println(bt.sumOfNodes());
//		int ans = bt.findLCA(14, 8);
//		System.out.println("LCA: "+ans);
//		bt.printkDistanceNodes(2);
	
//		System.out.println(bt.findDist(70));
//		
//		bt.printInRange(25, 55);
//		bt.display();
//		System.out.println("**********");
//		bt.modifyBST();
//		
//		bt.display();
//		bt.add(7);
//		bt.add(13);
		
		
		
//		bt2.add(8);
//		bt2.add(3);
//		bt2.add(10);
//		bt2.add(1);
//		bt2.add(6);
//		bt2.add(14);
//		bt2.add(4);
//		bt2.add(7);
//		bt2.add(13);
//		
//		
//		System.out.println(bt.isStructurallyIdentical(bt2));
//		bt.remove(3);
//		bt.display();
//		int ans = bt.isBalanced();
//		if(ans==-1) {
//			System.out.println("false");
//		}else {
//			System.out.println("true");
//		}
//		System.out.println(bt.ht());
//		bt.sumAtLevelK(3);
		
//		System.out.println("*********");
//		bt.remove(4);
//		bt.display();
//		bt.leftView();
//		System.out.println("*********");
//		bt.rightView();
//		System.out.println("*********");
		
//		System.out.println(bt.ht());
//		System.out.println(bt.find(14));
//		System.out.println(bt.max());
//		System.out.println(bt.size());
////		bt.printInRange(-4, 21);
//		bt.printInDec();
		

	}

}
