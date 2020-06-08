import java.util.*;

public class LongestUncommonSubsequence {
	public static int longestUncommon(String str, String str1) {
		if (str.length() == 0 && str1.length() != 0) {
			return str1.length();
		}
		if (str1.length() == 0 && str.length() != 0) {
			return str.length();
		}
		if (str.length() == 0 && str1.length() == 0) {
			return -1;
		}
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		sb.append(str.subSequence(0, str.length()));
		sb1.append(str1.subSequence(0, str1.length()));
		if (sb.toString().equals(sb1.toString())) {
			return -1;
		}
		if (sb.length() > sb1.length()) {
			return sb.length();
		}
		return sb1.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();
		System.out.println(longestUncommon(a, b));
		s.close();
	}

}
