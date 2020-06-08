import java.util.*;

public class WordBreak {
	public static int wordB(Set<String> dict, String test) {
		int n = test.length();
		boolean[] dp = new boolean[n + 1];
		for (int i = 1; i <= test.length(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.println("Subs :-" + test.substring(j, i));
				if (dp[j] && dict.contains(test.substring(j, i))) {
					dp[j] = true;
					break;
				}
			}
		}
		return dp[test.length()] ? 0 : 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i like sam sung samsung mobile ice cream icecream man go mango";
		String[] splited = str.split(" ");
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < splited.length; i++) {
			set.add(splited[i]);
		}
		String test = "ilike";
		System.out.println(wordB(set, test));
	}

}
