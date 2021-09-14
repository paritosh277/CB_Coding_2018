package aug4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	private HashMap<String, Vertex> vertices = new HashMap<>();

	public int numVertex() {
		return vertices.size();
	}

	public boolean containsVertex(String vname) {
		if (vertices.containsKey(vname)) {
			return true;
		} else {
			return false;
		}
	}

	public void addVertex(String vname) {
		Vertex vtx = new Vertex();
		vertices.put(vname, vtx);
	}

	public int numEdges() {
		int size = 0;
		for (String key : vertices.keySet()) {
			String vname = key;
			size += vertices.get(vname).nbrs.size();
		}
		return size / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {
		if (vertices.containsKey(vname1) == false || vertices.containsKey(vname2) == false
				|| vertices.get(vname1).nbrs.containsKey(vname2) == false) {

			return false;
		} else {
			return true;
		}
	}

	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vtx1 = vertices.get(vname1);
		Vertex vtx2 = vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		} else {
			vtx1.nbrs.put(vname2, cost);
			vtx2.nbrs.put(vname1, cost);
		}
	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vtx1 = vertices.get(vname1);
		Vertex vtx2 = vertices.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		} else {
			vtx1.nbrs.remove(vname2);
			vtx2.nbrs.remove(vname1);
		}
	}

	public void display() {
		System.out.println("*******************");
		for (String key : vertices.keySet()) {
			Vertex vtx = vertices.get(key);
			System.out.println(key + "---->" + vtx.nbrs);
		}
		System.out.println("*******************");

	}

	public boolean hasPath(String src, String dst, HashMap<String, Boolean> processed) {
		// 0.processed
		processed.put(src, true);

		// 1.contains
		if (containsEdge(src, dst)) {
			return true;
		}

		for (String nbrs : vertices.get(src).nbrs.keySet()) {
			if (!processed.containsKey(nbrs) && hasPath(nbrs, dst, processed)) {
				return true;
			}
		}
		return false;
	}

	private class Pair {
		String vname;
		String psf; // path so far
	}

	public boolean BFS(String src, String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		// make a pair and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		queue.addLast(sp);

		// while queue is not empty keep on removing pairs
		while (!queue.isEmpty()) {
			Pair rp = queue.removeFirst();

			// duplicate C in queue ignore ignore it
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// put in processed
			processed.put(rp.vname, true);

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// nbrs
			Vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					queue.addLast(np);
				}
			}
		}
		return false;
	}

	public boolean DFS(String src, String dst) {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		// make a pair and put in queue
		Pair sp = new Pair();
		sp.vname = src;
		sp.psf = src;
		stack.addFirst(sp);

		// while queue is not empty keep on removing pairs
		while (!stack.isEmpty()) {
			Pair rp = stack.removeFirst();

			// duplicate C in queue ignore ignore it
			if (processed.containsKey(rp.vname)) {
				continue;
			}

			// put in processed
			processed.put(rp.vname, true);

			// direct edge
			if (containsEdge(rp.vname, dst)) {
				System.out.println(rp.psf + dst);
				return true;
			}

			// nbrs
			Vertex vtx = vertices.get(rp.vname);
			for (String nbr : vtx.nbrs.keySet()) {
				// process only unprocessed nbrs
				if (!processed.containsKey(nbr)) {
					Pair np = new Pair();
					np.vname = nbr;
					np.psf = rp.psf + nbr;
					stack.addLast(np);
				}
			}
		}
		return false;
	}

	public void BFTraversal() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		// make a pair and put in queue

		for (String key : vertices.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			// while queue is not empty keep on removing pairs
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();

				// duplicate C in queue ignore ignore it
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// put in processed
				processed.put(rp.vname, true);

				// direct edge
				System.out.println(rp.vname + " via " + rp.psf);

				// nbrs
				Vertex vtx = vertices.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addLast(np);
					}
				}
			}
		}
	}

	public void DFTraversal() {
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> stack = new LinkedList<>();

		// make a pair and put in queue

		for (String key : vertices.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			stack.addFirst(sp);

			// while queue is not empty keep on removing pairs
			while (!stack.isEmpty()) {
				Pair rp = stack.removeFirst();

				// duplicate C in queue ignore ignore it
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// put in processed
				processed.put(rp.vname, true);

				// direct edge
				System.out.println(rp.vname + " via " + rp.psf);

				// nbrs
				Vertex vtx = vertices.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						stack.addLast(np);
					}
				}
			}
		}
	}

	public boolean isCyclic() {

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		// make a pair and put in queue

		for (String key : vertices.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			// while queue is not empty keep on removing pairs
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();

				// duplicate C in queue ignore ignore it
				if (processed.containsKey(rp.vname)) {
					return true;
				}

				// put in processed
				processed.put(rp.vname, true);

				// nbrs
				Vertex vtx = vertices.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addLast(np);
					}
				}
			}
		}

		return false;
	}

	public boolean isConnected() {

		int flag = 0;

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		// make a pair and put in queue

		for (String key : vertices.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			flag++;
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			// while queue is not empty keep on removing pairs
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();

				// duplicate C in queue ignore ignore it
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				//flag++;
				// put in processed
				processed.put(rp.vname, true);

				

				// nbrs
				Vertex vtx = vertices.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addLast(np);
					}
				}
			}
		}

		if (flag == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isTree() {

		return !isCyclic() && isConnected();
	}
	
	public ArrayList<ArrayList<String>> getCC(){
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList>
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();

		// make a pair and put in queue

		for (String key : vertices.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			Pair sp = new Pair();
			sp.vname = key;
			sp.psf = key;
			queue.addLast(sp);

			// while queue is not empty keep on removing pairs
			while (!queue.isEmpty()) {
				Pair rp = queue.removeFirst();

				// duplicate C in queue ignore ignore it
				if (processed.containsKey(rp.vname)) {
					continue;
				}

				// put in processed
				processed.put(rp.vname, true);

				// direct edge
				System.out.println(rp.vname + " via " + rp.psf);

				// nbrs
				Vertex vtx = vertices.get(rp.vname);
				for (String nbr : vtx.nbrs.keySet()) {
					// process only unprocessed nbrs
					if (!processed.containsKey(nbr)) {
						Pair np = new Pair();
						np.vname = nbr;
						np.psf = rp.psf + nbr;
						queue.addLast(np);
					}
				}
			}
		}
	}
	
	public boolean isBipartite() {
		
	}

}
