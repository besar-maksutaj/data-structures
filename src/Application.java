import collection.BoundedLinkedList;
import collection.Queue;
import collection.Stack;
import collection.UnboundedLinkedList;

public class Application {

	public static void main(String[] args) {
		
		UnboundedLinkedList<Integer> list = new UnboundedLinkedList<>();
			for(int i = 0; i < 100; i++) {
				list.add(i);
		}
		assert list.contain(99);
		assert list.delete(5);
		assert !list.contain(5);
		
		BoundedLinkedList<Integer>list1 = new BoundedLinkedList<>(50);
		for(int i = 0; i < 50; i++) {
			list1.add(i);
		}
		
		assert !list1.add(42);
		assert list1.delete(22);
		assert !list1.delete(56);
		assert list.contain(33);
		
		
		Queue<Integer> queue = new Queue<>();
		queue.add(27);
		int result = queue.poll();
		assert result == 27;
		assert queue.poll() == null;
		
		Stack<String> stack = new Stack<>();
		stack.push("Test");
		assert stack.peek().equals("Test"); 
		assert stack.pop().equals("Test");
		assert stack.pop() == null;
		assert stack.peek() == null;
	}
	
}
