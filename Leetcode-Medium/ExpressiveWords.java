import java.util.*;

public class ExpressiveWords {
	public static int expressive(String str, String[] words) {
		int count = 0;
		int mainCount = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		// System.out.println(hm);
		HashMap<Character, Integer> hm1 = null;
		for (String word : words) {
			hm1 = new HashMap<Character, Integer>();
			for (char c : word.toCharArray()) {
				hm1.put(c, hm1.getOrDefault(c, 0) + 1);
			}
			// System.out.println(hm1);
			if (hm.keySet().equals(hm1.keySet())) {
				for (char key : hm.keySet()) {
					if (hm.get(key).equals(hm1.get(key))) {
						count++;
						continue;
					}
					if ((hm1.get(key) * 3) == hm.get(key)) {
						count++;
					}
					if ((hm1.get(key) * 3) != hm.get(key)) {
						break;
					}
				}
			}
			if (count == hm.size()) {
				mainCount++;
			}
			count = 0;
		}
		return mainCount;
	}
	/*
	 * int count = 0; for (String s : words) { if (isMatch(S, 0, s, 0)) { count++; }
	 * } return count; }
	 * 
	 * private static boolean isMatch(String s1, int i, String s2, int j) { if (i >=
	 * s1.length() && j >= s2.length()) { return true; } else if (i >= s1.length()
	 * || j >= s2.length()) { return false; }
	 * 
	 * if (s1.charAt(i) != s2.charAt(j)) { return false; }
	 * 
	 * boolean res = false;
	 * 
	 * if (i + 2 < s1.length() && s1.charAt(i + 1) == s2.charAt(j) && s1.charAt(i +
	 * 2) == s2.charAt(j)) { int m = i + 2; int n = j + 1; while (m < s1.length() &&
	 * s1.charAt(m) == s2.charAt(j)) { m++; } while (n < s2.length() && s2.charAt(n)
	 * == s2.charAt(n - 1)) { n++; } if (n - j > m - i) { return false; }
	 * 
	 * res = isMatch(s1, m, s2, n); }
	 * 
	 * res = res | isMatch(s1, i + 1, s2, j + 1);
	 * 
	 * return res;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "heeellooo";
		String[] words = { "hello", "hi", "helo" };
		System.out.println(expressive(str, words));
	}

}
