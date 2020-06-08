import java.util.*;

public class IsSubSequence {
	public static boolean isSubs(String s, String t) {
		if (s.length() == 0)
			return true;
		int indexOfS = 0;
		int indexOfT = 0;
		while (indexOfT < t.length()) {
			if (t.charAt(indexOfT) == s.charAt(indexOfS)) {
				indexOfS++;
				if (indexOfS == s.length())
					return true;
			}
			indexOfT++;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubs(s, t));
	}

}
