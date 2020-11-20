package collection;

public class Queue<B> {

	private Node<B> head;

	public Queue() {
		head = new Node<B>(null);
	}

	public B poll() {
		if (head.getNext() == null) {
			return null;
		} else {
			Node<B> result = head.getNext();
			head.setNext(result.getNext());
			return result.getValue();
		}
	}
	public void add(B element) {
		Node<B> node = new Node<>(element);
		Node<B> current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(node);
	}
}
