import java.util.*;

public class LongestSubsequenceWithKChars {
	public static String longestSubs(String str, int k) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		String faltuString = "";
		Set<Character> splitSet = new HashSet<Character>();
		for (char c : hm.keySet()) {
			if (hm.get(c) < k) {
				splitSet.add(c);
				faltuString += c;
			}
		}
		str = str.replace(faltuString, "");
		if (splitSet.isEmpty()) {
			return str;
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		int k = 2;
		System.out.println(longestSubs(str, k));
	}

}
