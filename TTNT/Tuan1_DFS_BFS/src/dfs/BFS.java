package dfs;

import java.util.*;

public class BFS {
	public void bfsUsingQueue(Node initial, int goal) {
		Node s = initial;
		if (s.state == goal) {
			System.out.println("Path: "+s.state);
		} else {
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(s);
			while (queue != null) {
				Node p = queue.remove();
				System.out.println(p.state);
				p.visited = true;
				if(p.state==goal){
					System.out.println("Ve dich roi");
					printPath(p, initial);
					break;
				}
					else {
						List<Node> l = p.getNeighbour();
						System.out.println("size l "+ l.size());
						for (int j = 0; j < l.size(); j++) {
							if (l.get(j).visited == false){
								l.get(j).parent=p;
								queue.add(l.get(j));
							System.out.println("node con "+l.get(j).state);
							}
						}
					}
				}
			}
		}
	

	private void printPath(Node node, Node initial) {
		String s = "";
		while (node != initial) {
//			System.out.println("tets "+ node.state);
			s = node.state + " " + s;
			node = node.parent;
		}
		System.out.println("Path: " + initial.state + " " + s);
	}
	public static void main(String[] args) {
		Node node40= new Node(40);
		Node node10= new Node(10);
		Node node20= new Node(20);
		Node node30= new Node(30);
		Node node60= new Node(60);
		Node node50= new Node(50);
		Node node70= new Node(70);
		node40.addNeighbours(node10);
		node40.addNeighbours(node20);
		node10.addNeighbours(node30);
		node20.addNeighbours(node30);
		node20.addNeighbours(node60);
		node20.addNeighbours(node50);
		node30.addNeighbours(node60);
		node60.addNeighbours(node70);
		node50.addNeighbours(node70);
		BFS bfs= new BFS();
		bfs.bfsUsingQueue(node40, 70);
//		System.out.println(node40.toString());
	}
}
