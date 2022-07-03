package javaBasicExercises;

public class LinkedListMod<T extends Comparable<T>> implements ListMod<T>{

	//Head Node
	private Node<T> root;
	//Item Counter
	private int numofItems;
	
	public void insert(T data) {
		// TODO Auto-generated method stub
		if(root==null) {
			//It's the first node
			root = new Node<>(data);
		}
		else {
			//this not the first node so root is not null
			insertBegining(data);
		}
	}
	public void reverse() {
		Node<T> currentNode = this.root;
		Node<T> prevNode = null;
		Node<T> nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.getNextNode();
			currentNode.setNextNode(prevNode);
			currentNode = nextNode;
		}
		this.root = prevNode;
		traverse();
	}
	//just need to update reference
	private void insertBegining(T data) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}
	//First find the last item
	private void insertEnding(T data,Node<T> node) {
		if(node.getNextNode()!=null) {
		//iterating the linked list
		insertEnding(data, node.getNextNode());
	}	else {
			//We reach the last node 
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	public void remove(T data) {
		// TODO Auto-generated method stub
		if(root == null) return;
		//if we want the root node
		if(root.getData().compareTo(data)==0){
			root = root.getNextNode();
		}
		else {
			remove(data,root,root.getNextNode());
		}
	}

	private void remove(T data, Node<T> previousNode,Node<T>actualNode) {
		// TODO Auto-generated method stub
		while (actualNode!=null) {
			if(actualNode.getData().compareTo(data)==0) {
				numofItems--;
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode=null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
	}
	public void traverse() {
		// TODO Auto-generated method stub
		if(root==null) return;
		Node<T> actualNode = root;
		while (actualNode !=null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}
	}
	public Node<T> getMiddleNode(){
		//Method for finding middle node
		Node<T> slowPointer = this.root;
		Node<T> fastPointer = this.root;
		//Fast pointer is twice faster than slow pointer
		//So when fast pointer reach the tail node slowPointer points the middle node
		while (fastPointer.getNextNode()!=null && fastPointer.getNextNode().getNextNode()!=null) {
			slowPointer = slowPointer.getNextNode();
			fastPointer = fastPointer.getNextNode().getNextNode();
		}
		return slowPointer;
	}

	public int size() {
		// TODO Auto-generated method stub
		
		return numofItems;		
	}

	
}
