
public class LinkedList {
	private Link first;
	
	
	/**
	 * Class constructor
	 */
	public LinkedList() {
		this.first = null;
	}
	
	
	/**
	 * Checking if the linked list is empty
	 * @return
	 */
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	/**
	 * Inserting value into the linked list
	 * @param key
	 * @param value
	 */
	public void insertFirst(int key, int value) {
		Link newLink = new Link(key, value);
		newLink.next = first;
		first = newLink;
	}
	
	
	/**
	 * Deleting first value from the linked list
	 * @return
	 */
	public Link deleteFirst() {
		Link temp = this.first;
		this.first = this.first.next;
		return temp;
	}
	
	
	/**
	 * Displaying all the values in the linked list
	 */
	public void displayList() {
		Link currentLink = this.first;
		while(currentLink != null) {
			currentLink.displayLink();
			currentLink = currentLink.next;
		}
	}

}
