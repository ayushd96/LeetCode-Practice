
public class DeleteFrom2Stirngs {
	public static int deleteFromStrings(String word1, String word2) {
		int dp[][] = new int[word1.length() + 1][word2.length() + 1];
		for (int i = 0; i <= word1.length(); i++) {
			for (int j = 0; j <= word2.length(); j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else
					dp[i][j] = (word1.charAt(i - 1) == word2.charAt(j - 1)) ? dp[i - 1][j - 1] + 1
							: Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		int val = dp[word1.length()][word2.length()];
		return word1.length() - val + word2.length() - val;
	}
	/*
	 * if (str1.isEmpty()) { return str2.length(); } if (str2.isEmpty()) { return
	 * str1.length(); } if (str1.isEmpty() && str2.isEmpty()) { return 0; }
	 * 
	 * int count = 0; char[] c1 = str1.toCharArray(); char[] c2 =
	 * str2.toCharArray(); Arrays.sort(c1); Arrays.sort(c2); String newStr1 = new
	 * String(c1); String newStr2 = new String(c2); StringBuilder sb1 = new
	 * StringBuilder(newStr1); StringBuilder sb2 = new StringBuilder(newStr2); int n
	 * = sb1.length(); int m = sb2.length(); int min = Math.min(n, m);
	 * 
	 * for (int i = 0; i < min; i++) { if (c1[i] == c2[i]) { if (sb1.length() <
	 * sb2.length()) { count += sb2.length() - 1; } continue; } if (c1[i] != c2[i])
	 * { sb1.deleteCharAt(i); count++; sb2.deleteCharAt(i); count++; } if
	 * (sb1.length() > sb2.length()) { count += sb1.length(); }
	 * 
	 * } return count;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "a";
		String str2 = "ab";
		System.out.println(deleteFromStrings(str1, str2));
	}

}
