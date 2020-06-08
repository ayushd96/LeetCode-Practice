
public class ShortestWord3 {
	public static int shortDistance(String[] words, String word1, String word2) {
		int m = -1;
		int n = -1;
		int min = Integer.MAX_VALUE;
		int turn = 0;
		if (word1.equals(word2))
			turn = 1;

		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			if (word1.equals(s) && (turn == 1 || turn == 0)) {
				m = i;
				if (turn == 1)
					turn = 2;
				if (n != -1)
					min = Math.min(min, m - n);
				else if (word2.equals(s) && (turn == 2 || turn == 0)) {
					n = i;
					if (turn == 2)
						turn = 1;
					if (m != -1)
						min = Math.min(min, n - m);
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "practice", "makes", "coding", "perfect", "makes" };
		String word1 = "makes";
		String word2 = "makes";
		System.out.println(shortDistance(words, word1, word2));
	}

}
