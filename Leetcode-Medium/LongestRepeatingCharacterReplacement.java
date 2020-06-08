import java.util.*;

public class LongestRepeatingCharacterReplacement {
	public static int replacement(String str, int k) {
		int freq[] = new int[26];
		int mostFreq = 0;
		int left = 0;
		int max = 0;
		for (int right = 0; right < str.length(); right++) {
			freq[str.charAt(right) - 'A']++;
			mostFreq = Math.max(mostFreq, freq[str.charAt(right) - 'A']);
			int change = (right - left + 1) - mostFreq;
			if (change > k) {
				freq[str.charAt(left) - 'A']--;
				left++;
				mostFreq--;
			}
			max = Math.max(max, right - left + 1);
		}
		return max;
	}
	/*
	 * int len = str.length(); int[] count = new int[26]; int start = 0, maxLength =
	 * 0, maxCount = 0; for (int end = 0; end < str.length(); end++) { maxCount =
	 * Math.max(maxCount, ++count[str.charAt(end) - 'A']); while (end - start + 1 -
	 * maxCount > k) { count[str.charAt(start) - 'A']--; start++; } maxLength =
	 * Math.max(maxLength, end - start + 1); } return maxLength;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AABABBA";
		int k = 1;
		System.out.println(replacement(str, k));
	}

}
