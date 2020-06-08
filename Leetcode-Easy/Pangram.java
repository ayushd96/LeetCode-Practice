import java.util.*;

public class Pangram {
	private static final int ALPHABET_COUNT = 26;

	public static boolean isPangram(String str) {
		Boolean[] marked = new Boolean[ALPHABET_COUNT];
		Arrays.fill(marked, false);
		int alphaIndex = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				alphaIndex = str.charAt(i) - 'a';
				marked[alphaIndex] = true;
			}
		}
		for (boolean index : marked) {
			if (!index)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Two driven jocks help fax my big quiz";
		System.out.println(isPangram(str));
	}

}
