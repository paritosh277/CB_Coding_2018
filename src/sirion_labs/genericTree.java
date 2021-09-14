package sirion_labs;

import java.util.ArrayList;
import java.util.Scanner;

public class genericTree {
	Scanner scn = new Scanner(System.in);
	
	private class Node{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}
	
	private Node root;
	
	public genericTree(){
		this.root = construct(null, -1);
	}
	
	private Node construct (Node parent, int ith){ 
		if(parent == null) {
			System.out.println("Enter the data of root node");
		}else {
			System.out.println("Enter the data of " + ith + "child of " + parent.data);
		}
		
		int item = scn.nextInt();
		Node nn = new Node();
		nn.data = item;
		System.out.println("Enter no. of children of" + nn.data);
		int noc = scn.nextInt();
		for(int i=0; i<noc; i++) {
			Node child= construct(nn, i);
			nn.children.add(child);
		}
		return nn;
	}
	
	public void display() {
		display(this.root);
	}
	
	private void display(Node node) {
		String str = node.data + "=>";
		for(Node child: node.children) {
			str+=child.data;
			str+=" ";
		}
		
		System.out.println(str);
		
		for(Node child: node.children) {
			display(child);
		}
	}
	
	public int size() {
		return size(this.root);
	}
	
	private int size(Node node) {
		int count = 0;
		
		for(Node child: node.children) {
			count+=size(child);
		}
		
		return count+1;
	}
	
	public int max() {
		return max(this.root);
	}
	
	private int max(Node node) {
		int tm = node.data;
		
		for(Node child: node.children) {
			int cm = max(child);
			if(cm>tm) {
				tm=cm;
			}
		}
		
		return tm;
	}
	
	public boolean find() {
		System.out.println("Enter number you want to find");
		int item = scn.nextInt();
		return find(this.root, item);
	}
	
	private boolean find(Node node, int item) {
		if(item == node.data) {
			return true;
		}
		
		for(Node child: node.children) {
			boolean ans = find(child, item);
			if(ans) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 3 20 2 50 0 60 0 30 0 40 1 70 0
		genericTree gt = new genericTree();
		gt.display();
		System.out.println("************");
		System.out.println(gt.size());
		System.out.println(gt.max());
		System.out.println(gt.find());

	}

}
