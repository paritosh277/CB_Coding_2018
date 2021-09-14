package june28;

public class StackUQueuePushE {

	private DynamicQueue primaryQueue = new DynamicQueue();
	
	public void push(int item) throws Exception{
		
		try {
			DynamicQueue helper = new DynamicQueue();
			helper.enqueue(item);
			
			while(this.primaryQueue.size!=0) {
				int temp=primaryQueue.dequeue();
				helper.enqueue(temp);
			}
			primaryQueue=helper;
		}catch(Exception e) {
			throw new Exception("Stack is Full.");
		}
	}
	
	public int pop() throws Exception{
		
		try {
			return this.primaryQueue.dequeue();
		}catch(Exception e) {
			throw new Exception("Stack is Empty");
		}
	}
	
	public int top() throws Exception{
		try {
			return this.primaryQueue.getfront();
		}catch(Exception e) {
			throw new Exception("Stack is Empty");
		}
	}
	
	public int size() {
		return primaryQueue.size() ;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	public void display() throws Exception{
		primaryQueue.display();
	}
	
	

}
