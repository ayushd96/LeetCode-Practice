import java.util.*;

public class LCSStr {
	public static int lcsstrr(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int max = 0;
		int row = 0, col = 0;
		int len = 0;
		int[][] dp = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = 1 + dp[i - 1][j - 1];
					}
					if (max < dp[i][j]) {
						max = dp[i][j];
						row = i;
						col = j;
					}
				}
			}
		}
		String resString = "";

		while (dp[row][col] != 0) {
			resString = str1.charAt(row - 1) + resString;
			len--;
			row--;
			col--;
		}
		System.out.println(resString);
		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String str2 = "abc";
		System.out.println(lcsstrr(str1, str2));
	}

}
