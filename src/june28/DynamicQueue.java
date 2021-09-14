package june28;

public class DynamicQueue extends queue {

	public void enqueue(int item) throws Exception {
		// twice
		if (this.data.length == this.size) {
			int[] oa = data;
			int[] na = new int[2 * data.length];

			for (int i = 0; i < this.size; i++) {
				int idx = (i + this.front) % this.data.length;
				na[i] = oa[idx];

			}

			this.data = na;
			this.front = 0;
		}
		super.enqueue(item);

	}

}
