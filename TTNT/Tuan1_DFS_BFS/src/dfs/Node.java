package dfs;

import java.util.*;

public class Node {
	int state;
	boolean visited;
	List<Node> neighbours;
	Node parent;
	public Node( int state) {
	this.state=state;
	this.neighbours= new ArrayList<>();
	this.parent=null;
	}
	public void addNeighbours(Node neighbourNode){
		this.neighbours.add(neighbourNode);
	}
	public List<Node> getNeighbour(){
		return neighbours;
	}
	@Override
	public String toString() {
		return "Node [state=" + state + ", visited=" + visited + ", neighbours=" + neighbours + ", parent=" + parent
				+ "]";
	}
	
}
