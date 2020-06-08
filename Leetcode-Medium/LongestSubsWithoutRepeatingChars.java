import java.util.*;

public class LongestSubsWithoutRepeatingChars {
	public static int longestSs(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int max = 0;
		for (int i = 0, j = 0; i < str.length(); ++i) {
			if (hm.containsKey(str.charAt(i))) {
				j = Math.max(j, hm.get(str.charAt(i)) + 1);
			}
			hm.put(str.charAt(i), i);
			max = Math.max(max, i - j + 1);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "pwwkew";
		System.out.println(longestSs(str));
	}

}
