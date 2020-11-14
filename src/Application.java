
public class Application {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
			for(int i = 0; i < 100; i++) {
				list.add(i);
		}
		assert list.contain(99);
		assert list.delete(5);
		assert !list.contain(5);
	}
	
}
