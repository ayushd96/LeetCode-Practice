import java.util.*;

public class PermutationPresentInString {
	/*
	 * public static boolean checkIfPermutationPresent(String str1, String str2) {
	 * HashMap<Character, Integer> hmStr1 = new HashMap<Character, Integer>(); for
	 * (char c : str1.toCharArray()) { hmStr1.put(c, hmStr1.getOrDefault(c, 0) + 1);
	 * } System.out.println(hmStr1); HashMap<Character, Integer> hmStr2 = null; int
	 * start = 0; for (int end = str1.length(); end <= str2.length(); end++) {
	 * String sub = str2.substring(start, end); System.out.println(sub); hmStr2 =
	 * new HashMap<Character, Integer>(); for (char c : sub.toCharArray()) {
	 * hmStr2.put(c, hmStr2.getOrDefault(c, 0) + 1); } System.out.println(hmStr2);
	 * if (hmStr2.keySet().equals(hmStr1.keySet())) { ArrayList<Integer> al = new
	 * ArrayList<Integer>(); ArrayList<Integer> al1 = new ArrayList<Integer>();
	 * al.addAll(hmStr2.values()); al1.addAll(hmStr1.values()); if (al.equals(al1))
	 * { return true; } } else start = start + 1; } // start++;
	 * 
	 * return false; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ab";
		String str2 = "eidbaooo";
		System.out.println(checkIfPermutationPresent(str1, str2));
	}

	private static boolean checkIfPermutationPresent(String s1, String s2) {
		int[] hash = new int[26];
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (hash[s1.charAt(i) - 'a'] == 0)
				count++;
			hash[s1.charAt(i) - 'a']++;
		}
		int l = 0;
		int[] hash2 = new int[26];
		for (int i = 0; i < s2.length(); i++) {
			if (hash[s2.charAt(i) - 'a'] > 0) {
				int j = i;
				l = 0;
				while (j < s2.length() && hash[s2.charAt(j) - 'a'] > 0 && j < i + s1.length()) {
					hash2[s2.charAt(j) - 'a']++;
					if (hash2[s2.charAt(j) - 'a'] == hash[s2.charAt(j) - 'a']) {
						l++;
					}
					if (l == count)
						return true;
					j++;

				}
				Arrays.fill(hash2, 0);
			}
		}
		return false;

	}

}
