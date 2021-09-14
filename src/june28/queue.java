package june28;

public class queue {
	protected int[] data;
	protected int front;
	protected int size;
	
	public queue() {
		this.data=new int[5];
		this.front=0;
		this.size=0;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		if(this.size==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enqueue(int item) throws Exception{
		
		if(this.data.length==this.size) {
			throw new Exception("Queue is Full");
		}
		
		
		int idx= (this.front + this.size) % this.data.length;
		this.data[idx]=item;
		this.size++;
	}
	
	
	public int dequeue() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		int rv=this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv;
	}
	
	public int getfront() throws Exception{
		if(this.isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int rv=this.data[this.front];
		return rv;
	}
	
	public void display() {
		System.out.println("***********************");
		for(int i=0;i<this.size;i++) {
			System.out.println(this.data[(i+this.front)%this.data.length]);
		}
	}
	
}
