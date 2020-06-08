import java.util.*;

public class FindAndReplace {
	public static List<String> findAndReplace(String[] words, String pattern) {
		boolean flag = true;
		ArrayList<Boolean> patternAl = new ArrayList<Boolean>();
		ArrayList<Boolean> wordsAl = null;
		ArrayList<String> mainList = new ArrayList<String>();
		// patternAl.add(flag);
		for (int i = 0; i < pattern.length() - 1;) {
			if (pattern.charAt(i) == pattern.charAt(i + 1)) {
				// flag = false;
				patternAl.add(flag);
				i++;
				continue;
			} else {
				// flag = true;
				patternAl.add(!flag);
				i++;
			}

		}
		System.out.println("pattern arraylist : --> " + patternAl);
		for (String x : words) {
			wordsAl = new ArrayList<Boolean>();
			// wordsAl.add(flag);
			for (int i = 0; i < x.length() - 1; i++) {
				if (x.charAt(i) == x.charAt(i + 1)) {
					flag = false;
					wordsAl.add(flag);
					// continue;
				}
				if (x.charAt(i) != x.charAt(i + 1)) {
					// flag = true;
					wordsAl.add(!flag);
					System.out.println("words list --> " + " " + x + " :--> " + wordsAl);
				}
			}
			if (patternAl.equals(wordsAl)) {
				// System.out.println(x);
				mainList.add(x);
				// System.out.println(mainList);
			}
		}

		// System.out.println(wordsAl);
		return mainList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "abc", "cba", "xyx", "yxx", "yyx" };
		String pattern = "abc";
		System.out.println(findAndReplace(words, pattern));
	}

}
