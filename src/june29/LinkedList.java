package june29;

public class LinkedList {
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
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

	public void addLast(int item) {
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

	public void addFirst(int item) {
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

	public void addAt(int item, int idx) throws Exception {
		if (idx < 0 || idx > this.size) {
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

	public int removeFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		int first;
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

	public int removeLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked List is Empty");
		}

		int last;
		if (this.size == 1) {
			last = this.tail.data;
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			last = this.tail.data;
			Node temp = getNodeAt(size - 2);
			this.tail = temp;
			this.tail.next = null;
			this.size--;
		}
		return last;
	}

	public int removeAt(int idx) throws Exception {
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
		
//		for(int i=0; i<this.size; i++) {
//			System.out.print(temp.data + " ");
//			temp=temp.next;
//		}
//		System.out.println();
	}

	public void reverseDataIteratively() throws Exception {
		for (int i = 0; i < this.size / 2; i++) {
			Node x = getNodeAt(i);
			Node y = getNodeAt(this.size - 1 - i);
			int temp;
			temp = x.data;
			x.data = y.data;
			y.data = temp;
		}
	}

	public void reversePointerIteratively() {
		Node prev = this.head;
		Node curr = this.head.next;
		while (curr.next != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;

		}
		curr.next = prev;
		this.head.next = null;
		this.tail = this.head;
		this.head = curr;

	}

	public void reversePointerRecursively() {
		reversePointerRecursively(this.head, this.head.next);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		tail.next = null;
	}

	private void reversePointerRecursively(Node prev, Node curr) {
		if (curr == null) {
			return;
		}

		reversePointerRecursively(prev.next, curr.next);

		curr.next = prev;

	}

	public void reverseDataRecursively() {
		reverseDataRecursively(this.head, this.head, 0);
	}

	private Node reverseDataRecursively(Node left, Node right, int count) {
		if (right == null) {
			return left;
		}

		left = reverseDataRecursively(left, right.next, count + 1);

		if (count >= this.size / 2) {
			int temp;
			temp = right.data;
			right.data = left.data;
			left.data = temp;
		}
		return left.next;
	}

	public void fold() {
		fold(this.head, this.head, 0);
	}

	private Node fold(Node left, Node right, int count) {
		if (right == null) {
			return left;
		}

		left = fold(left, right.next, count + 1);

		if (count > this.size / 2) {
			Node temp;
			temp = left.next;
			left.next = right;
			right.next = temp;
			return temp;

		}

		if (count == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}

		return null;
	}

	public int mid() throws Exception {
		Node x = this.head;
		Node y = this.head;

		while (x.next != null && x.next.next != null) {
			x = x.next.next;
			y = y.next;
		}

		return y.data;
		
//		Node x = getNodeAt((this.size - 1)/2);
//		return x.data;
	}

	private Node midNode() {
		Node x = this.head;
		Node y = this.head;

		while (x.next != null && x.next.next != null) {
			x = x.next.next;
			y = y.next;
		}

		return y;
	}

	public int kthFromLast(int k) {
		Node fast = this.head;
		Node slow = this.head;

		for (int i = 1; i < k; i++) {
			fast = fast.next;
			System.out.println("hello");
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}

	public void kReverse(int k) throws Exception {
		LinkedList prev = null;
//		LinkedList curr = null;

		while (this.size != 0) {
			LinkedList curr = new LinkedList();
			for (int i = 1; i <= k; i++) {
				curr.addFirst(this.removeFirst());
			}
			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}
		}
		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;

	}

	public LinkedList mergeTwoSortedLL(LinkedList other) {
		LinkedList merged = new LinkedList();
		Node temp1 = this.head;
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
//			merged.addLast(temp2.data);
//			temp2 = temp2.next;
		}

		if (temp2 == null) {
			
			while (temp1 != null) {
				merged.addLast(temp1.data);
				temp1 = temp1.next;
			}
//			merged.addLast(temp1.data);
//			temp1 = temp1.next;
		}

		return merged;
	}

	public void mergeSort() throws Exception{
		if (this.size == 1) {
			return;
		}

		Node mid = midNode();
		Node midn = mid.next;

		LinkedList fh = new LinkedList();
		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;

		LinkedList sh = new LinkedList();
		sh.head = midn;
		sh.tail = this.tail;
		sh.tail.next = null;
		sh.size = this.size / 2;

		fh.mergeSort();
		sh.mergeSort();
		LinkedList merged = fh.mergeTwoSortedLL(sh);

		this.head = merged.head;
		this.tail = merged.tail;
		this.size = merged.size;

	}
	
	public void swapNodes (int num1, int num2) throws Exception {
//		Node x = null;
//		Node y = null;
//		for(int i=0; i<this.size; i++){
//	        x = getNodeAt(i);
//	        if(num1 == x.data){
//	            break;
//	        }
//	        System.out.println("1");
//	    }  
	    
//	    for(int i=0; i<this.size; i++){
//	        y = getNodeAt(i);
//	       if(num2 == y.data){
//	            break;
//	        }
//	       System.out.println("2");
//	    }    
	    
//	    int temp = x.data;
//	    x.data = y.data;
//	    y.data = temp;
		
		Node x = this.head;
		for(int i=0; i<this.size; i++) {
			if(x.data==num1) {
				break;
			}
			x=x.next;
		}
		Node y = this.head;
		for(int i=0; i<this.size; i++) {
			if(y.data==num2) {
				break;
			}
			y=y.next;
		}
		
		int temp = x.data;
	    x.data = y.data;
	    y.data = temp;
	    
	    
	    
	}
	
	public void eliminateDuplicates() throws Exception {
		for(int i=0; i<this.size-1; i++) {
			Node x = getNodeAt(i);
			Node y = getNodeAt(i+1);
			
			while(x.data==y.data) {
				this.size--;
				y=y.next;
				if(y==null) {
					break;
				}
			}
			
			if(y==null) {
				x.next=null;
			}else {
				x.next=y;
			}
			
			
		}
	}
	
	
	
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		
		ll.display();
//		ll.mergeSort();
//		ll.display();
//		ll.swapNodes(4,8);
//		ll.display();
		
//		ll.addLast(11);
//		
//		ll.addLast(11);
//		ll.addLast(11);
//		ll.addLast(21);
//		ll.addLast(43);
//		ll.addLast(43);
//		ll.addLast(60);
//		
//		ll.display();
//		ll.addAt(99, 3);
		
//		ll.display();
//		
		ll.kReverse(3);
//		
		ll.display();
//		
//		System.out.println(ll.kthFromLast(1));
//		
//		System.out.println(ll.mid());
//		
//		ll.reversePointerIteratively();
//		ll.display();
//		
//		ll.fold();
//		ll.display();
		
		
//		System.out.println();
//		ll.display();
//		ll.eliminateDuplicates();
//		ll.display();
//		ll.reverseDataIteratively();
//		
//		ll.display();
//		
//		ll.reversePointerIteratively();
//		ll.display();
//		
//		ll.reverseDataRecursively();
//		ll.display();
//		
//		ll.reversePointerRecursively();
//		ll.display();
//		
//		ll.fold();
//		ll.display();
//		
//		System.out.println(ll.mid());
//		System.out.println(ll.kthFromLast(2));
//		
//		ll.mergeSort();
//		ll.display();
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getAt(1));
//		System.out.println(ll.getNodeAt(1));
//		ll.display();
//		System.out.println(ll.removeFirst());
//		ll.display();
//		
//		System.out.println(ll.mid());
		

	}


}
