import java.util.*;

public class ShortestWordDistance {
	public static int shortDistance(String[] words, String word1, String word2) {
		int m = -1;
		int n = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			if (word1.equals(str)) {
				m = i;
				if (n != -1) {
					min = Math.min(min, m - n);
				}
			} else if (word2.equals(str)) {
				n = i;
				if (m != -1) {
					min = Math.min(min, n - m);
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"practice" , "makes" , "perfect" , "coding", "makes"};
		String word1 = "practice";
		String word2 = "coding";
		System.out.println(shortDistance(words, word1, word2));
	}

}
