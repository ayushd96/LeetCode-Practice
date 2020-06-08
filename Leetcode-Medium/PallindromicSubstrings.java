import java.util.*;

public class PallindromicSubstrings {
	static int count = 1;

	public static int countSubs(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			checkPalindrome(str, i, i); // checking odd length strings
			checkPalindrome(str, i, i + 1); // checking even length strings
		}
		return count;

		/*
		 * if (str.isEmpty()) { return 0; } ArrayList<String> al = new
		 * ArrayList<String>(); ArrayList<String> al1 = new ArrayList<String>();
		 * StringBuilder sb = new StringBuilder(); String subs = ""; for (int i = 0; i <
		 * str.length(); i++) { for (int j = i + 1; j <= str.length(); j++) { subs =
		 * str.substring(i, j); al.add(subs); } } for (String x : al) { StringBuilder
		 * sb1 = new StringBuilder(x); sb1 = sb1.reverse(); if
		 * (x.equals(sb1.toString())) { al1.add(x); } } return al1.size();
		 */ }

	private static void checkPalindrome(String str, int i, int j) {
		while (i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
			count++;
			i--;
			j++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaa";
		System.out.println(countSubs(str));
	}

}
