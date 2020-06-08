import java.util.*;

public class PalindromePartition {
	public static String parts(String str) {
		return "";
		/*
		 * String resString = ""; int[][] dp = new int[str.length()][str.length()]; for
		 * (int l = 1; l <= str.length(); l++) { for (int i = 0; i <= str.length() - l;
		 * i++) { int j = i + l - 1; if (str.charAt(i) == str.charAt(j)) { if (l == 1 ||
		 * l == 2) { dp[i][j] = 1; } else dp[i][j] = dp[i + 1][j - 1]; if (dp[i][j] ==
		 * 1) { resString += str.substring(i, j + 1) + " "; } else dp[i][j] = 0; } } }
		 * return resString + " ";
		 */}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		System.out.println(parts(str));
	}

}
