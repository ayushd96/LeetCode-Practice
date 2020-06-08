import java.util.*;

public class KlengthSubstringWithNoReps {
	public static int kLengthSubs(String str, int k) {
		HashSet<Character> hs = new HashSet<Character>();
		int ans = 0;
		int i = 0;
		for (int j = 0; j < str.length(); j++) {
			while (hs.contains(str.charAt(j))) {
				hs.remove(str.charAt(i++));
			}
			hs.add(str.charAt(j));
			System.out.println(hs);
			if (j - i + 1 >= k) {
				ans++;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "havefunonleetcode";
		int k = 5;
		System.out.println(kLengthSubs(str, k));
	}

}
