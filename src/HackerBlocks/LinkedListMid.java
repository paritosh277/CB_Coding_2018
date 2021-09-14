package HackerBlocks;

import java.util.LinkedList;
import java.util.Scanner;




public class LinkedListMid {
	private class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	private int size;
	
	public void addLast(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (this.size > 0) {
			this.tail.next = nn;
		} else {
			this.head = nn;
		}

		this.tail = nn;
		this.size+=1;
	}
	
	public void mid() {
		Node x = this.head;
		Node y = this.head;

		while (x.next != null && x.next.next != null) {
			x = x.next.next;
			y = y.next;
		}

		System.out.println(y.data);
	}
	
	public static void main(String[] args) {
		LinkedListMid fh = new LinkedListMid();
		
		Scanner scn = new Scanner(System.in);
		int size1 = scn.nextInt();
		for (int i = 0; i < size1; i++) {
			int x = scn.nextInt();
			fh.addLast(x);
		}

		fh.mid();		
		
	}
}
