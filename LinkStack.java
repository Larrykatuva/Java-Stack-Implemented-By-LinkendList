
public class LinkStack {
	private LinkedList theList;
	
	/**
	 * Class constructor
	 */
	public LinkStack() {
		this.theList = new LinkedList();
	}
	
	
	/**
	 * Insert value into the stack
	 * @param key
	 * @param value
	 */
	public void push(int key, int value) {
		this.theList.insertFirst(key, value);
	}
	
	
	/**
	 * Pop value from the stack
	 * @return
	 */
	public Link pop() {
		return this.theList.deleteFirst();
	}
	
	
	/**
	 * Check if the stack is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.theList.isEmpty();
	}
	
	
	/**
	 * Displaying all the stack values
	 */
	public void displayStack() {
		this.theList.displayList();
	}

}
