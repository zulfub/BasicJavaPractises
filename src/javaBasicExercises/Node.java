package javaBasicExercises;

public class Node<T extends Comparable<T>> {
	//This the data we store in data structure
	private T data;
	//this is why linkedList need more memory
	private Node<T> nextNode;
	
	public Node(T data) {
		// TODO Auto-generated constructor stub
		this.data =data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return ""+data;
	}
	
	
	
}
