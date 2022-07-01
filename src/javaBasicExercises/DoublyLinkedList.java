package javaBasicExercises;

public class DoublyLinkedList <T extends Comparable<T>>{

	private Note<T> head;
	private Note<T> tail;
	
	public void insert(T data) {
		Note<T> newNode = new Note<>(data);
		
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
		Note<T> actualNote = head;
		while (actualNote != null) {
			System.out.println(actualNote);
			actualNote = actualNote.getNextNode();
		}
	}
	public void traversBackward(T data) {
		Note<T> actualNote = tail;
		while (actualNote != null) {
			System.out.println(actualNote);
			actualNote = actualNote.getPreviousNode();
		}
	}
}
