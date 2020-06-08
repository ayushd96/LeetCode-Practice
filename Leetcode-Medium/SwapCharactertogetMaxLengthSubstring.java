
public class SwapCharactertogetMaxLengthSubstring {
	public static int swaptogetMaximum(String text) {
		int[] freq = new int[26];
		char[] ch = text.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			freq[ch[i] - 'a']++;
		}
		int max = 0;
		for (int i = 0; i < ch.length; i++) {
			char currentChar = ch[i];
			int j = 1;
			int count = 0;
			int diff = 0;
			while (j < ch.length && (currentChar == ch[j] || diff == 0) && count < freq[currentChar - 'a']) {
				if (currentChar != ch[j]) {
					++diff;
				}
				++count;
				++j;
			}
			max = Math.max(max, count);
		}
		for (int i = ch.length - 1; i >= 0; i--) {
			char curr = ch[i];
			int j = i;
			int count = 0;
			int diff = 0;
			while (j >= 0 && (curr == ch[j] || diff == 0) && count < freq[curr - 'a']) {
				if (curr != ch[j])
					++diff;
				++count;
				--j;
			}
			max = Math.max(max, count);
		}
		return max;
	}

	public static void main(String[] args) {
		String text = "aaabbaaa";
		System.out.println(swaptogetMaximum(text));
	}

}
