package aug1;

import java.util.Scanner;

public class LinkedList {

	private class Node {
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
		this.size += 1;
	}

	public static void display(LinkedList merged) {
		Node temp = merged.head;

		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
		System.out.println(" ");
	}

	public static LinkedList mergeTwosortedLL(LinkedList one, LinkedList other) {
		LinkedList merged = new LinkedList();
		Node temp1 = one.head;
		Node temp2 = other.head;

		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				merged.addLast(temp1.data);
				temp1 = temp1.next;
			} else {
				merged.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}

		if (temp1 == null) {

			while (temp2 != null) {
				merged.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}

		if (temp2 == null) {
			while (temp1 != null) {
				merged.addLast(temp1.data);
				temp1 = temp1.next;
			}
		}

		return merged;

	}

	public static void main(String[] args) {
		LinkedList fh = new LinkedList();
		LinkedList sh = new LinkedList();
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int size1 = scn.nextInt();
			for (int i = 0; i < size1; i++) {
				int x = scn.nextInt();
				fh.addLast(x);
			}

			int size2 = scn.nextInt();
			for (int i = 0; i < size2; i++) {
				int y = scn.nextInt();
				sh.addLast(y);
			}

			LinkedList merged = mergeTwosortedLL(fh, sh);

			display(merged);
			t--;
		}

	}

}
