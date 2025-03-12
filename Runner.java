package hasSet;

import java.util.TreeSet;

public class Runner {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();
		// Maintain insersation order
		// Duplicate not allow
		// maintain ascending order
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(10);
		t.add(500);
		t.add(2);
		System.out.println(t);
		for (Integer integer : t) {
			System.out.println(integer);
		}
	}
}
