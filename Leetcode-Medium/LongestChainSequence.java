import java.util.*;

public class LongestChainSequence {
	public static int longestChain(String[] words) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		Arrays.sort(words, (a, b) -> a.length() - b.length());
		// System.out.println("After Sort : == > " + Arrays.toString(words));
		int res = 0;
		for (String word : words) {
			int best = 0;
			for (int i = 0; i < word.length(); ++i) {
				String prev = word.substring(0, i) + word.substring(i + 1);
				// System.out.println("prev == >" + prev);
				best = Math.max(best, hm.getOrDefault(prev, 0) + 1);
				// System.out.println("Best == > " + best);
			}
			hm.put(word, best);
			// System.out.println(hm);
			res = Math.max(best, res);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "a", "b", "ba", "bca", "bda", "bdca" };
		System.out.println(longestChain(words));
	}

}
