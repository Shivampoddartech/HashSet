package hasSet;

import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(20.20);
		h.add(null);
		h.add("Java");
		h.add(10);
		System.out.println(h);

		System.out.println("----------------------");

		for (Object obj : h) {
			System.out.println(obj);
		}
	}
}
