package Q2;

import java.util.*;

public class StringDemo {
	public static void main(String[] args) {
		class Stringcomparator implements Comparator<String> {
			@Override
			public int compare(String s1, String s2) {
				int diff = s1.length() - s2.length();
				return diff;
			}
		}
		Stringcomparator cmp = new Stringcomparator();

		List<String> s = new ArrayList<>();
		s.add("Om");
		s.add("Shri");
		s.add("Omb");
		s.add("Smb");
		System.out.println(Collections.max(s, cmp));

	}
}
