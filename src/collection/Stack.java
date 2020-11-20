package collection;

public class Stack <C> {
	
	private Node<C> head;
	
	public Stack() {
		head = new Node<C>(null); 
	}
	public C pop() {
		Node<C> predecessor = head;
		Node<C> current = predecessor.getNext();
		while(current!= null && current.getNext()!= null) {
			predecessor = current;
			current = current.getNext();
		}
		predecessor.setNext(null);
		if(current != null) {
			return current.getValue();
		}else {
			return null;
		}
	}
	public C peek() {
		Node<C> predecessor = head;
		Node<C> current = predecessor.getNext();
		while(current !=null && current.getNext()!= null) {
			predecessor = current;
			current = current.getNext();
		}
		if(current != null) {
			return current.getValue();
		}else {
			return null;
		}
	}
	public void push(C element) {
		Node<C> newNode = new Node<C>(element);
		Node<C> current = head;
		while(current.getNext()!=null) {
			current = current.getNext();
		}
		current.setNext(newNode);
	}
}
