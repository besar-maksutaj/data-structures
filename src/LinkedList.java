
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
	
	 public boolean contain(T element) {
		 Node<T> current = head;
		 while(current.getNext() != null) {
			 current = current.getNext();
			 if(current.getValue().equals(element)) {
				 return true;
			 }
		 }
		 return false;
	 }
	 
	 public boolean delete(T element) {
		 Node<T> pred = head;
		 Node<T> current = pred.getNext();
		 while(current != null) {
			 if(current.getValue().equals(element)) {
				 pred.setNext(current.getNext());
				 return true;
			 }
			 pred = current;
			 current = current.getNext();
		 }
		 return false;
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
