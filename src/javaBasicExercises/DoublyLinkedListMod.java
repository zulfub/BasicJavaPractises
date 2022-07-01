package javaBasicExercises;

public class DoublyLinkedListMod <T extends Comparable<T>>{

	private DoubleNote<T> head;
	private DoubleNote<T> tail;
	
	public void insert(T data) {
		DoubleNote<T> newNode = new DoubleNote<>(data);
		
		if(tail == null) {
			tail = newNode;
			head = newNode;
		}
		else {
			newNode.setPreviousNode(tail);
			tail.setNextNode(newNode);
			tail = newNode;			
		}
	}
	
	public void traversFoward(T data) {
		DoubleNote<T> actualNote = head;
		while (actualNote != null) {
			System.out.println(actualNote);
			actualNote = actualNote.getNextNode();
		}
	}
	public void traversBackward(T data) {
		DoubleNote<T> actualNote = tail;
		while (actualNote != null) {
			System.out.println(actualNote);
			actualNote = actualNote.getPreviousNode();
		}
	}
}
