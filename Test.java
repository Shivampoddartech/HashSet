package hasSet;

import java.util.LinkedHashSet;

public class Test {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Java");
		lhs.add("python");
		lhs.add("javaScript");
		lhs.add("Java");

		System.out.println(lhs);

		System.out.println("-----------------");
		for (String string : lhs) {
			System.out.println(string);
		}
	}
}
