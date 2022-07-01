package javaBasicExercises;

public class DoubleNote <T extends  Comparable<T>>{

	private T data;
	//Memory heavier than single linked list
	private DoubleNote<T> previousNode;
	private DoubleNote<T> nextNode;
	
	public DoubleNote(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DoubleNote<T> getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleNote<T> previousNode) {
		this.previousNode = previousNode;
	}

	public DoubleNote<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleNote<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return ""+ data ;
	}	
	
}
