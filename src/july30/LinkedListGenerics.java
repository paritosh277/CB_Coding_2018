package july30;



public class LinkedListGenerics<T> {
	private class Node {
		T data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public T getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		return this.head.data;
	}

	public T getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		return this.tail.data;
	}

	public T getAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		Node temp = this.head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(T item) {
		Node nn = new Node(); // create node
		nn.data = item;
		nn.next = null;

		if (this.size > 0)
			this.tail.next = nn; // attach
		else
			this.head = nn;

		this.tail = nn; // update
		this.size += 1;
	}

	public void addFirst(T item) {
		Node nn = new Node();
		nn.data = item;

		if (this.size > 0) {
			nn.next = this.head;
			this.head = nn;
		} else {
			nn.next = null;
			this.head = nn;
			this.tail = nn;
		}
		this.size += 1;

	}

	public void addAt(T item, int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == this.size) {
			addLast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			Node nm1 = getNodeAt(idx - 1);
			Node np1 = getNodeAt(idx);
			nn.next = np1;
			nm1.next = nn;
			this.size++;
		}
	}

	public T removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		T first;
		if (this.size == 1) {
			first = this.head.data;
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			first = this.head.data;
			this.head = this.head.next;
			this.size--;
		}
		return first;
	}

	public T removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		T last;
		if (this.size == 1) {
			last = this.tail.data;
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			last = this.tail.data;
			Node temp = getNodeAt(size - 2);
			tail = temp;
			this.tail.next = null;
			this.size--;
		}
		return last;
	}

	public T removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}
		if (idx == 0) {
			return removeFirst();
		} else if (idx == this.size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = getNodeAt(idx);
			Node np1 = getNodeAt(idx + 1);

			nm1.next = np1;
			return n.data;
		}
	}

	public void display() {
		Node temp = this.head;
		System.out.println("********************");
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.print(temp.data + " ");
		System.out.println(" ");
	}
}
