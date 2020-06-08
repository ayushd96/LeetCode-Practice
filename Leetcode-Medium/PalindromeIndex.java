import java.util.*;

public class PalindromeIndex {

	public static int palinIndex(String str) {
		int start = 0;
		int end = str.length() - 1;
		if (isPalindrome(str))
			return -1;
		while (true) {
			if (start > end) {
				break;
			}
			if (str.charAt(start) == str.charAt(end)) {
				start++;
				end--;
				continue;
			}
			if (isPalindrome(str.substring(0, start) + str.substring(start + 1))) {
				System.out.println(str.substring(0, start) + str.substring(start + 1));
				return start;
			} else if (isPalindrome(str.substring(0, end) + str.substring(end + 1))) {
				System.out.println(str.substring(0, end) + str.substring(end + 1));
				return end;
			} else
				return -1;
		}
		return -1;
	}

	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		if (str.equals(rev)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaab";
		System.out.println(palinIndex(str));
	}

}
