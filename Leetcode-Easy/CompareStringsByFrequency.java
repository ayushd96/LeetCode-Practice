import java.util.*;

public class CompareStringsByFrequency {
	public static String compare(String[] queries, String[] words) {
		int[] counts = new int[12];
		for (String word : words) {
			counts[f(word)]++;
		}
		for (int i = 10; i >= 0; i--) {
			counts[i] += counts[i + 1];
		}
		int[] ans = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			ans[i] = counts[f(queries[i]) + 1];
		}
		return Arrays.toString(ans);
	}

	private static int f(String word) {
		char minchar = Character.MAX_VALUE;
		int freq = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch < minchar) {
				freq = 1;
				minchar = ch;
			} else if (ch == minchar) {
				freq++;
			}
		}
		return freq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] queries = { "cbd", "abc" };
		String[] words = { "aaa", "aabb" };
		System.out.println(compare(queries, words));
	}

}
