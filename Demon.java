package hasSet;

import java.util.TreeSet;

public class Demon {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet();
		t.add("A");
		t.add("Z");
		t.add("J");
		t.add("AF");
		t.add("B");
		t.add("A");
		t.add("Apple");
		t.add("Banana");
		t.add("Papaya");
		System.out.println(t);
		for (String string : t) {
			System.out.println(string);
		}
	}
}
