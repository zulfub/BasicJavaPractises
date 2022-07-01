package javaBasicExercises;

public class Note <T extends  Comparable<T>>{

	private T data;
	//Memory heavier than single linked list
	private Note<T> previousNode;
	private Note<T> nextNode;
	
	public Note(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Note<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Note<T> previousNode) {
		this.previousNode = previousNode;
	}

	public Note<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Note<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return ""+ data ;
	}	
	
}
