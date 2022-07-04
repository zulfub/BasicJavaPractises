package javaBasicExercises;

public class StackWithArrays<T> {

	private T[] stack;
	private int count;
	
	public StackWithArrays() {
		//In java T type array can't be created so , create an Object from Object class and cast it to T type 
		stack = (T[]) new Object[1];
	}
	
	public void push(T newData) {
		
		if(count==stack.length) {
		//Resize the array when no empty space left in array
			resize(2*count);
		}
		//count++ in array columns means , first assign value to array and increase 1 to counter
		stack[count++]=newData;
	}
	//Returns and removes the last item
	public T pop() {
		if(isEmpty())return null;
		//Arrays start with 0 so first decreases the count
		T item = stack[--count];
		//Garbage Collection 
		stack[count] = null;
		if(count >0 && count == stack.length/4)
			//decrease the array capacity
			resize(count/2);
		return item;
		
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}

	private void resize(int capacity ) {
		//This is the bottleneck of app == O(N)		
		T[] stackCopy = (T[]) new Object[capacity];
		//copy the items from stack to stackCopy array
		for(int i=0;i<count;i++) {
			stackCopy[i] = stack[i];
		}
		//update the references
		stack=stackCopy;
	}
}
