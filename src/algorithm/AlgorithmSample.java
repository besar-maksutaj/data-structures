package algorithm;

import java.util.HashSet;
import java.util.Set;

public class AlgorithmSample {

	public boolean findTuple(int target, int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean findTuble1(int target, int[] numbers) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			if (set.contains(numbers[i]) == false)
				set.add(target - numbers[i]);
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 5, 7, 9, 8, 11 };
		int target = 11;
		AlgorithmSample algo = new AlgorithmSample();
		boolean result = algo.findTuple(target, numbers);
		System.out.println(result);
		System.out.println(algo.findTuble1(target, numbers));
	}
}
