package collection;

public class BoundedLinkedList<T> {

	private int size;
	private int currentSize;
	private Node<T> head;
	
	public BoundedLinkedList(int size) {
		this.size = size;
		this.currentSize = 0;
		this.head = new Node<>(null);
	}
	
	public boolean add(T element) {
		if(currentSize < size) {
			Node<T> newNode = new Node<>(element);
			Node<T> current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
			currentSize++;
			return true;
		}
		return false;
	}
	
	public boolean delete(T element) {
		Node<T> pred = head;
		Node<T> current = pred.getNext();
		while(current != null) {
			if(current.getValue().equals(element)) {
				pred.setNext(current.getNext());
				currentSize--;
				return true;
			}
			pred = current;
			current = current.getNext();
		}
		return false;
	}
	
	
	
	
}
