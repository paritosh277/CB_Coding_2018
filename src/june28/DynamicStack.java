package june28;

public class DynamicStack extends stack {
	@Override
	public void push (int item) throws Exception {
		
		//twice
		if(this.size()==this.data.length) {
			int[] oa = data;
			int[] na = new int[2*data.length];
			
			for(int i=0;i<oa.length;i++) {
				na[i]=oa[i];
			}
			this.data = na;
			//super.push(item);
			
		}//else {
			super.push(item);
		//}
		

	}

}
