package sep18;

public class LinkedList {
	
	private class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void addLast(int item) {
		Node nn = new Node();
		nn.data=item;
		nn.next=null;
		if(this.size>0) {
			this.tail.next=nn;
		}else {
			this.head=nn;
			
		}
		this.tail=nn;
		this.size++;
	}
	
	public void addFirst(int item) {
		Node nn = new Node();
		nn.data=item;
		if(this.size>0) {
			nn.next=this.head;
			head=nn;
		}else {
			nn.next=null;
			this.head=nn;
			this.tail=nn;
		}
		this.size++;
	}
	
	public int getFirst() throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		
		return this.head.data;
	}
	
	public int getLast() throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int idx) throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		
		if(idx<0 || idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		Node temp = this.head;
		
		for(int i=1; i<=idx;i++) {
			temp=temp.next;
		}
		
		return temp.data;
	}
	
	private Node getNodeAt(int idx) throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is Empty");
		}
		
		if(idx<0 || idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		Node temp = this.head;
		
		for(int i=0; i<idx;i++) {
			temp=temp.next;
		}
		
		return temp;
	}
	
	public void addAt(int item, int idx) throws Exception{
		if(idx<0 || idx>this.size) {
			throw new Exception("Invalid Index");
		}
		
		if(idx==0) {
			addFirst(item);
		}else if(idx==this.size) {
			addLast(item);
		}else {
			Node nn = new Node();
			nn.data=item;
			Node nm1 = getNodeAt(idx-1);
			Node np1 = nm1.next;
			nm1.next=nn;
			nn.next=np1;
			this.size++;
		}
	}

	public int removeFirst() throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is empty");
		}
		
		
		
		int first;
		if(this.size==1) {
			first = this.head.data;
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
			first = this.head.data;
			this.head=this.head.next;
			this.size--;
		}
		
		return first;
	}
	
	public int removeLast() throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is empty");
		}
		
		
		
		int last = this.tail.data;
		if(this.size==1) {
			this.head=null;
			this.tail=null;
			this.size=0;
		}else {
			Node lastm2 = getNodeAt(this.size-2);
			lastm2.next=null;
			this.tail=lastm2;
			this.size--;
		}
		return last;
	}
	
	public int removeAt(int idx) throws Exception{
		if(this.size==0) {
			throw new Exception("Linked List is empty");
		}
		if(idx<0 || idx>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		
		if(idx==0) {
			return removeFirst();
		}else if(idx==this.size-1){
			return removeLast();
		
		}else {
			Node nm1= getNodeAt(idx-1);
			Node n = getNodeAt(idx);
			Node np1 = getNodeAt(idx+1);
			nm1.next=np1;
			this.size--;
			return n.data;
		}
		
		
	}
	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.display();
		
		ll.removeAt(3);
		
//		ll.removeFirst();
		
//		ll.addAt(85, 3);
		ll.display();
		
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		
//		System.out.println(ll.getAt(4));

	}

}
