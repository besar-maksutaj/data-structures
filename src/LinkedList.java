
public class LinkedList<T> {

	private Node<T> head;
	
	public LinkedList() {
		head = new Node<>(null);
	}
	
	 public void add(T element) {
		 Node<T> newNode = new Node<>(element);
		 Node<T> predecessor = head; // Vorgängerin newNode.
		 while(predecessor.getNext() != null) {
			 predecessor = predecessor.getNext();
		 }
		 predecessor.setNext(newNode);
	 }
	
	 public String toString() {
		 String value = "";
		 Node<T> successor = head;
		 while((successor = successor.getNext()) != null) {
			 value = value + successor.getValue().toString() + " "; 
		 }
		 return value;
	 }
	 
}
