import java.util.*;

public class SmallestSubSequence {
	public static String smallestSubSequence(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			count[c - 'a']++;
		}
		System.out.println(Arrays.toString(count));
		boolean[] used = new boolean[26];
		Arrays.fill(used, false);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (used[c - 'a']) {
				count[c - 'a']--;
				continue;
			}
			int last = sb.length() - 1;
			while (sb.length() > 0 && c < sb.charAt(last) && count[sb.charAt(last) - 'a'] > 0) {
				used[sb.charAt(last) - 'a'] = false;
				sb.deleteCharAt(last);
				last -= 1;
			}
			used[c - 'a'] = true;
			sb.append(c);
			count[c - 'a']--;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cdadabcc";
		System.out.println(smallestSubSequence(str));
	}

}
