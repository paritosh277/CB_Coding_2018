package aug1;

import java.util.ArrayList;

public class HeapGeneric<T extends Comparable<T>> {

	private ArrayList<T> data = new ArrayList<>();

	public void add(T item) {
		data.add(item);
		int ci = data.size() - 1;
		upheapify(ci);
	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (isLargest(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	private void swap(int i, int j) {
		T idata = data.get(i);
		T jdata = data.get(j);
		data.set(i, jdata);
		data.set(j, idata);
	}

	public void display() {
		System.out.println(this.data);
	}

	public T get() {
		return this.data.get(0);
	}

	public T remove() {
		swap(0, data.size() - 1);
		T rv = data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;

		if (lci < data.size() && isLargest(data.get(mini), data.get(lci)) > 0) {
			mini = lci;

		}

		if (rci > data.size() && isLargest(data.get(mini), data.get(rci)) > 0) {
			mini = rci;

		}

		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}

	}

	public int isLargest(T t, T o) {
		return t.compareTo(o);
	}

}
