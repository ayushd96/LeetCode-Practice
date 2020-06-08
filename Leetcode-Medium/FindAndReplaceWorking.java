import java.util.*;

public class FindAndReplaceWorking {
	public static List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> ans = new ArrayList<>();
		for (String word : words)
			if (match(word, pattern))
				ans.add(word);
		return ans;
	}

	public static boolean match(String word, String pattern) {
		Map<Character, Character> M = new HashMap<>();
		for (int i = 0; i < word.length(); ++i) {
			char w = word.charAt(i);
			char p = pattern.charAt(i);
			if (!M.containsKey(w))
				M.put(w, p);
			if (M.get(w) != p)
				return false;
		}

		boolean[] seen = new boolean[26];
		for (char p : M.values()) {
			if (seen[p - 'a'])
				return false;
			seen[p - 'a'] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "abc" };
		String pattern = "def";
		System.out.println(findAndReplacePattern(words, pattern));
	}

}
