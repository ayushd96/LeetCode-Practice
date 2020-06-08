import java.util.*;

public class LexiographyLargestSubSequence {
	public static String lexoLargestSubSeq(String str, int k) {
		int n = str.length();
		int last = 0, newLast = 0, count = 0, size = 0;
		char[] t = new char[n];
		ArrayList<Character> al = new ArrayList<Character>();
		for (char ch = 'z'; ch >= 'a'; ch--) {
			count = 0;
			for (int i = last; i < n; i++) {
				if (str.charAt(i) == ch) {
					count++;
			 		// System.out.println(count);
				}
			}

			if (count >= k) {
				for (int i = last; i < n; i++) {
					if (str.charAt(i) == ch) {
						al.add(str.charAt(i));
						t[size++] = str.charAt(i);
						newLast = i;
					}
				}
				last = newLast;
			}
		}
		t[size] = '\0';
		String res = new String(t);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "banana";
		int k = 2;
		System.out.println(lexoLargestSubSeq(str, k));
	}

}
