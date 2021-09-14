package Practice_DS;

import java.util.HashMap;

public class myLinkedList {
	
	private class Node{
		int data;
		Node next;
//		Node next = null;
		
		Node(){
			next =null;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void addLast(int item) {
		Node current = this.head;
		Node nn = new Node();
		nn.data = item;
//		nn.next = null;
		if(current == null) {
			this.head = nn;
			this.tail = nn;
		}else {
			this.tail.next = nn;
			this.tail = nn;
		}
		
		this.size++ ;
	}
	
	
	public void addFirst(int item) {
		Node nn = new Node();
		nn.data=item;
		
		if(this.size==0) {
//			nn.next=null;
			this.head=nn;
			this.tail=nn;
		}else {
			nn.next=this.head;
			this.head=nn;
		}
		
		this.size++;
	}
	
	
	public void addAt(int item, int idx) throws Exception {
		if(idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index");
		}
		
		if(idx==0) {
			addFirst(item);
		}else if(idx==this.size) {
			addLast(item);
		}else {
			Node current = this.head;
			for(int i=0; i<idx-1; i++) {
				current = current.next;
			}
			
			Node nn = new Node();
			nn.data=item;
			nn.next = current.next;
			current.next = nn;
			this.size++;
			
			
//			Node nn = new Node();
//			nn.data=item;
//			
//			Node nm1 = getNodeAt(idx-1);
//			Node n = getNodeAt(idx);
//			nm1.next=nn;
//			nn.next=n;
//			this.size++;
			
		}
		
		
	}
	
	public int getFirst() throws Exception{
		if(this.size==0) {
			throw new Exception("Empty LinkedList");
		}
		
		return this.head.data;
	}
	
	public int getLast() throws Exception{
		if(this.size==0) {
			throw new Exception("Empty LinkedList");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int idx) throws Exception{
		if(idx<0 || idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		Node current = this.head;
		
		for(int i=0; i<idx; i++) {
			current = current.next;
		}
		
		return current.data;
	}
	
	public Node getNodeAt(int idx) throws Exception{
		if(idx<0 || idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		Node current = this.head;
		
		for(int i=0; i<idx; i++) {
			current = current.next;
		}
		
		return current;
	}
	
	public int removeFirst() throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		
		int first = this.head.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size--;
		}else {
			Node current = this.head;
			current = current.next;
			this.head=current;
			this.size--;
		}
		
		return first;
		
		
	}

	
	public int removeLast() throws Exception{
		if(this.size == 0) {
			throw new Exception("Linked List is Empty");
		}
		
		int last = this.tail.data;
		
		if(this.size==1) {
			this.head= null;
			this.tail=null;
			this.size--;
		}else {
			Node current = getNodeAt(this.size-2);
			this.tail=current;
			this.tail.next=null;
			this.size--;
		}
		
		return last;
	}

	
	public int removeAt(int idx) throws Exception{
		if(idx<0 || idx>= this.size) {
			throw new Exception("Invalid Index");
		}
		int item;
		
		if(idx==0) {
			item = removeFirst();
		}else if (idx==this.size-1) {
			item = removeLast();
		}else {
			Node nm1 = getNodeAt(idx-1);
			Node nn =getNodeAt(idx);
			Node np1 = getNodeAt(idx+1);
			nm1.next=np1;
			item=nn.data;
		}
		
		return item;
	}
	
	
	public void display() {
		Node current = this.head;
		
		while(current!=null) {
			System.out.print(current.data + "->");
			current =current.next;
		}
		System.out.println();
	}
	
	public void reversePointerIteratively() {
		
//		for(int i=1; i<this.size; i++) {
//			Node front = getNodeAt(this.size-1-i);
//			Node last = getNodeAt(this.size-i);
//			
//			last.next =front;
//			this.tail=front;
//		}
//	
//		this.head=this.tail;
////		this.tail=front;
//		this.tail.next=null;
		Node prev = this.head;
		Node curr = this.head.next;
		while(curr.next!=null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev=curr;
			curr=ahead;
		}
		curr.next=prev;
		this.tail=this.head;
		this.tail.next=null;
		this.head=curr;
		
//		curr.next = prev;
//		this.head.next = null;
//		this.tail = this.head;
//		this.head = curr;
	}
	
	
	public void reverseDataIteratively() throws Exception{
		
//		if(this.size == 0) {
//			throw new Exception("Linked List Is Empty");
//		}
		for(int i =0 ;i<(this.size/2); i++) {
			Node front = getNodeAt(i);
			Node back = getNodeAt(this.size-1-i);
			int temp=front.data;
			front.data=back.data;
			back.data=temp;
		}
	}
	
	public int mid() throws Exception {
		Node fast = this.head;
		Node slow = this.head;
		
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		return slow.data;
	}
	
	public Node midNode() {
		Node fast = this.head;
		Node slow = this.head;
		
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		return slow;
	}
	
	public int kthFromLast(int pos){
//		int data = getAt(this.size-pos);
//		return data;
		
		//without using length of linked list
		
		Node fast = this.head;
		Node slow = this.head;
		
		for(int i=1; i<pos; i++) {
			fast=fast.next;
		}
		
		while(fast.next!=null) {
			fast= fast.next;
			slow= slow.next;
		}
		
		return slow.data;
	}
	
	public void kReverse(int k) throws Exception{
		this.head = kReverse(this.head, k);
	}
	
	private Node kReverse(Node head, int k) throws Exception{
		Node current = head;
		Node prev = null;
		Node next = null;
		int count=0; 
		
		while(current!=null && count<k) {
			next = current.next;
			current.next = prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null) {
			head.next = kReverse(next, k);
		}
		
		return prev;
	}
	
	
	public myLinkedList mergetwosortedLL(myLinkedList other) {
		myLinkedList merged = new myLinkedList();
		
		Node temp1 = this.head;
		Node temp2 = other.head;
		
		while(temp1!=null && temp2!= null) {
			if(temp1.data<temp2.data) {
				merged.addLast(temp1.data);
				temp1=temp1.next;
			}else {
				merged.addLast(temp2.data);
				temp2=temp2.next;
			}
		}
		
		if(temp1==null) {
//			merged.addLast(temp2.data);
//			temp2=temp2.next;
			
			while (temp2 != null) {
				merged.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}
		
		if(temp2==null) {
//			merged.addLast(temp1.data);
//			temp1=temp1.next;
			
			while (temp1 != null) {
				merged.addLast(temp1.data);
				temp1 = temp1.next;
			}
		}
		
		return merged;
	}
	
	
	
	
	public void mergeSort(){
		if(this.size==1) {
			return;
		}
		
//		myLinkedList fh = new myLinkedList();
//		myLinkedList sh = new myLinkedList();
		
		Node mid = midNode();
		Node mid2 = mid.next; 
		
		myLinkedList fh = new myLinkedList();
		myLinkedList sh = new myLinkedList();
		
		fh.head=this.head;
		fh.tail=mid;
		fh.tail.next=null;
		fh.size=(this.size+1)/2;
		
//		myLinkedList sh = new myLinkedList();
		sh.head=mid2;
		sh.size=this.size/2;
		sh.tail=this.tail;
		sh.tail.next=null;
		
		fh.mergeSort();
		sh.mergeSort();
		
		myLinkedList merged =fh.mergetwosortedLL(sh);
		this.head = merged.head;
		this.tail = merged.tail;
		this.size = merged.size;
		
	}
	
	public void eliminateDuplicates() { 
//		mergeSort();
		sortLinkedList();
		Node back = this.head;
		Node front = this.head.next;
		int n = this.size;
		for(int i=1; i<n; i++) {
			if(back.data==front.data) {
				front=front.next;
				back.next=front;
				this.size--;
			}else {
				back=back.next;
				front=front.next;
			}
			
		}
	}
	
	public void eliminateDuplicates2() {
		HashMap<Integer, Integer> map = new HashMap<>();
		Node temp = this.head;
		Node temp2 = this.head.next;
		map.put(temp.data, 1);
		while(temp2!=null) {
			if(!map.containsKey(temp2.data)) {
				map.put(temp2.data, 1);
				temp=temp.next;
				temp2=temp2.next;
			}else {
				temp2=temp2.next;
				temp.next=temp2;
				this.size--;
			}
		}
	}
	
	public void sortLinkedList() {
		Node x = new Node();
		Node y = new Node();
		for(x=this.head; x!=null; x=x.next) {
			for(y=x.next; y!=null; y=y.next) {
				if(x.data>y.data) {
					int temp = x.data;
					x.data = y.data;
					y.data = temp;
				}
			}
		}
	}
	
	public void kAppend(int k) {
		Node slow = this.head;
		Node fast = this.head;
		
		for(int i=0; i<k; i++) {
			fast=fast.next;
		}
		
		while(fast.next!=null) {
			slow=slow.next;
			fast=fast.next;
		}
		
		fast.next = this.head;
		this.tail=slow;
		slow=slow.next;
		this.tail.next=null;
		this.head=slow;
	}
	
	
	public void oddEven() {
		myLinkedList nll = new myLinkedList();
		
		Node temp = this.head;
		
		while(temp!=null) {
			if(temp.data%2!=0) {
				nll.addLast(temp.data);
			}
			temp=temp.next;
		}
		
		Node temp2 = this.head;
		
		while(temp2!=null) {
			if(temp2.data%2==0) {
				nll.addLast(temp2.data);
			}
			temp2=temp2.next;
		}
		
		
		this.head=nll.head;
		this.tail=nll.tail;
		this.size=nll.size;
		
		
	}
	
	
	public boolean palindrome() throws Exception{
		
		for(int i=0; i<this.size/2; i++) {
			Node back = getNodeAt(i);
			Node front = getNodeAt(this.size-1-i);
			
			if(back.data!=front.data) {
				return false;
			}else {
				continue;
			}
		}
		
		return true;
	}
	
	public void fold() throws Exception {
		Node mid = midNode();	//Find the middle point
		Node midn = mid.next;
		Node n1 = this.head;
		Node n2 = mid.next;
		mid.next=null;		// Split the linked list into two halves using found middle point
		

		//Reverse the second half linked list
		Node prev = n2;
		Node curr = n2.next;
		while(curr.next!=null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev=curr;
			curr=ahead;
		}
		curr.next=prev;
		n2.next=null;
		n2=curr;
		
		//Do alternate merge of first and second halves.
		myLinkedList merged = new myLinkedList();
		while(n1!=null || n2!=null) {
			
			if(n1!=null) {
				merged.addLast(n1.data);
				n1=n1.next;
			}
			
			if(n2!=null) {
				merged.addLast(n2.data);
				n2=n2.next;
			}
			
			
		}
		this.head=merged.head;
		this.tail=merged.tail;
		this.size=merged.size;
	}
	
	public void intersectionNode(myLinkedList other) {
		int longerLL = this.size;
		int smallerLL = other.size;
		
		int difference = Math.abs(longerLL-smallerLL);
		
		Node temp1 = this.head;
		for(int i=0; i<difference; i++) {
			temp1=temp1.next;
		}
		
		Node temp2 = other.head;
		int count=0;
		for(count=0; count<smallerLL; count++) {
			if(temp1.data == temp2.data) {
				System.out.println("Intersection Node: "+temp1.data);
				break;
			}else {
				temp1=temp1.next;
				temp2=temp2.next;
			}
		}
		
		if(count==smallerLL) {
			System.out.println("No Intersection Node");
		}
		
	}
	
	public void pairwiseSwap() {
		  Node temp = this.head; 
		  
	        /* Traverse only till there are atleast 2 nodes left */
	        while (temp != null && temp.next != null) { 
	  
	            /* Swap the data */
	            int k = temp.data; 
	            temp.data = temp.next.data; 
	            temp.next.data = k; 
	            temp = temp.next.next; 
	        } 
	}
	
	public static void main(String[] args) throws Exception {
		myLinkedList ll = new myLinkedList();
//		myLinkedList l1 = new myLinkedList();
//		myLinkedList l2 = new myLinkedList();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.display();
		ll.pairwiseSwap();
//		ll.addLast(10);
//		ll.addLast(8);
//		ll.kReverse(3);
//		
//		ll.addLast(1);
//		ll.addLast(2);
//		ll.addLast(2);
//		ll.addLast(2);
//		ll.addLast(1);
//		ll.addLast(6);
//		ll.addLast(70);
		
		ll.display();
//		ll.kAppend(2);
//		System.out.println(ll.palindrome());
//		ll.display();
		
//		l2.addLast(15);
//		l2.addLast(25);
//		l2.addLast(40);
//		l2.addLast(50);
		
//		l1.intersectionNode(l2);
		
//		System.out.println(ll.kthFromLast(4));
//		ll.addLast(5);
//		ll.addLast(6);
		
		
		
//		ll.addLast(300);
		
//		ll.addFirst(5);
//		ll.addFirst(2);
		
	
		
//		ll.fold();
//		ll.display();
//		ll.display();
//		ll.eliminateDuplicates2();
//		ll.display();
//		ll.kAppend(3);
//		ll.display();
//		ll.oddEven();
//		ll.display();
//		ll.display();
//		System.out.println(ll.palindrome());
		
//		System.out.println(ll.mid());
//		
//		ll.reverseDataIteratively();
//		ll.display();
	}
	
	

}
