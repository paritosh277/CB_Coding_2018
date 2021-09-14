package july20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTree {
	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;

	public GenericTree() {
		this.root = construct(null, -1);
	}

	// create parent ith child, return the root node of subtree

	private Node construct(Node parent, int ith) {
		if (parent == null) {
			System.out.println("Enter the data of root node");
		} else {
			System.out.println("Enter the data of " + ith + "th child of " + parent.data);
		}

		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("Enter no. of children for" + nn.data);
		int noc = scn.nextInt();
		for (int i = 0; i < noc; i++) {
			Node child = construct(nn, i);
			nn.children.add(child);
		}
		return nn;

	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
//		String str = node.data + "=>";
//		for (Node child : node.children) {
//			str += child.data;
//			str += " ";
//		}
//		System.out.println(str);
//		for (Node child : node.children) {
//			display(child);
//		}
		
		// self work of printing
		
				if(node==null) {
					return;
				}
				String str = node.data + " -> ";

				for (Node child : node.children) {
					str += child.data + ", ";
				}

				str += ".";
				System.out.println(str);

				// smaller prob
				for (Node child : node.children) {
					display(child);
				}

	}

	public int size() {
		return size(this.root);
	}

	private int size(Node node) {

		int count = 0;
		for (Node child : node.children) {
			count += size(child);
		}
		return count + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int tm = node.data;

		for (Node child : node.children) {
			int cm = max(child);
			if (cm > tm) {
				tm = cm;
			}

		}
		return tm;

	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(Node node, int item) {
		if (item == node.data) {
			return true;
		}

		for (Node child : node.children) {
			boolean cf = find(child, item);
			if (cf) {
				return true;
			}
		}

		return false;
	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		int th = -1;

		for (Node child : node.children) {
			int ch = height(child);

			if (ch > th) {
				th = ch;
			}
		}

		return th + 1;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {

		for (Node child : node.children) {
			mirror(child);
		}

		int left = 0;
		int right = node.children.size() - 1;

		while (left < right) {

			Node ln = node.children.get(left);
			Node rn = node.children.get(right);

			node.children.set(left, rn);
			node.children.set(right, ln);
			left++;
			right--;
		}
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			preorder(child);
		}
	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}
		System.out.println(node.data);
	}

	public void levelorder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);

		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst(); 
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				queue.addLast(child);
			}
		}

	}

	public void levelorderlw() { // linewise
		LinkedList<Node> primary = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();

		primary.addLast(this.root);

		while (!primary.isEmpty()) {
			Node rn = primary.removeFirst();
			System.out.println(rn.data);
			for (Node child : rn.children) {
				helper.addLast(child);
			}

			if (primary.isEmpty()) {
				System.out.println();
				primary = helper;
				helper = new LinkedList<>();
			}

		}
	}

	public void levelorderzz() { // zig-zag
		LinkedList<Node> stack = new LinkedList<>();
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
//		int count = 0;
		int count = 1;

		while (!queue.isEmpty()) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			if (count % 2 == 0) {
				for (Node child : rn.children) {
					stack.addFirst(child);
				}
			} else {
				for (int i = rn.children.size() - 1; i >= 0; i--) {
					stack.addFirst(rn.children.get(i));
				}
			}

			if (queue.isEmpty()) {
				System.out.println();
				queue = stack;
				stack = new LinkedList<>();
				count++;
			}
		}
	}

	public void levelOrderR() {
		int s = this.height();
		for (int i = 0; i <= s; i++) {
			printAtLevel(i);
		}
	}

	public void printAtLevel(int level) {
		printAtLevel(this.root, level, 0);
	}

	private void printAtLevel(Node node, int level, int count) {
		if (count == level) {
			System.out.println(node.data);
			return;
		}

		for (Node child : node.children) {
			printAtLevel(child, level, count + 1);
		}
	}

	private class heapMover {
		boolean find;
		int max = Integer.MIN_VALUE;
		int size = 0;
		int ht;
		Node pred;
		Node succ;
		Node justLarger;

	}

//	public void multiSolver(int item) {
//		heapMover mover = new heapMover();
//		
//		multisolver(this.root)
//	}
	
	public class orderPair{
		Node node;
		Boolean selfdone;
		Boolean childone;
	}
	
	public void preorderI() {
		LinkedList<orderPair> stack = new LinkedList<>();
		
		
	}

}
