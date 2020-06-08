import java.util.*;

public class PallindromeFromSubstring {
	public static List<Boolean> canMakePallins(String str, int[][] queries) {
		List<Boolean> al = new ArrayList<Boolean>();
		for (int[] query : queries) {
			Set<Character> set = new HashSet<Character>();
			int left = query[0];
			int right = query[1];
			int k = query[2];
			if (k >= 13) {
				al.add(true);
			} else {
				for (int i = left; i <= right; i++) {
					if (!set.add(str.charAt(i)))
						set.remove(str.charAt(i));
				}
				System.out.println(set.size());
				boolean output = k >= set.size() / 2;
				al.add(output);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcda";
		int[][] queries = { { 3, 3, 0 }, { 1, 2, 0 }, { 0, 3, 1 }, { 0, 3, 2 }, { 0, 4, 1 } };
		System.out.println(canMakePallins(str, queries));
	}

}
