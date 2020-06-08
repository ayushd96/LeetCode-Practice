//import java.util.*;

public class LongestPalindromeSubsString {
	public static int lo, max;

	public static String longestSubsString(String str) {
		/*
		 * int ans = 0; for (int i = 0; i < str.length(); i++) { int j = i; int k = i;
		 * while ((j >= 0) && (k < str.length()) && (str.charAt(j) == str.charAt(k))) {
		 * ans++; j--; k++; } j = i; k = i + 1; while ((j >= 0) && (k < str.length()) &&
		 * (str.charAt(j) == str.charAt(k))) { ans++; j--; k++; } } return ans;
		 */

		int len = str.length();
		if (len < 2) {
			return str;
		}
		for (int i = 0; i < str.length(); i++) {
			check(str, i, i);
			check(str, i, i + 1);
		}
		return str.substring(lo, lo + max);
	}

	/*
	 * ArrayList<String> al = new ArrayList<String>(); ArrayList<String> al1 = new
	 * ArrayList<String>(); // StringBuilder sb = new StringBuilder(); for (int i =
	 * 0;i<str.length();i++) { for (int j = i + 1; j <= str.length(); j++) {
	 * al.add(str.substring(i, j)); } }
	 * 
	 * for( String x:al) { StringBuilder sb = new StringBuilder(x); sb.reverse(); if
	 * (x.equals(sb.toString())) { al1.add(x); } } // Collections.sort(al1);
	 * 
	 * System.out.println(al1);if(al.isEmpty()) { return ""; }if(al1.size()==1) {
	 * return al.get(0); } String max = Collections.max(al1,
	 * Comparator.comparing(String::length));return max;
	 */

	private static void check(String str, int j, int k) {
		while (j >= 0 && k < str.length() && str.charAt(j) == str.charAt(k)) {
			j--;
			k++;
		}
		if (max < k - j - 1) {
			lo = j + 1;
			max = k - j + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaa";
		System.out.print(longestSubsString(str));
	}

}
