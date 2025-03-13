package hasSet;

import java.util.TreeSet;

public class Family {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<>();
		t.add("Shivam");
		t.add("Ravi");
		t.add("Seema");
		t.add("Veena");
		System.out.println(t);
		System.out.println("---------");

		for (String string : t) {
			System.out.println(string);
		}
		TreeSet<Integer> t1 = new TreeSet<>();
		t1.add(10);
		t1.add(100);
		t1.add(20);
		t1.add(200);
		t1.add(30);
		t1.add(300);
		System.out.println(t1);
		for (Integer integer : t1) {
			System.out.println(integer);
		}
	}
}
