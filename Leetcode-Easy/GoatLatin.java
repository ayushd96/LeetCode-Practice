import java.util.*;

public class GoatLatin {
	private static final HashSet<Character> vowels = new HashSet<>(
			Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

	public static String goatLatin(String S) {

		if (S == null || S.length() == 0) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		StringBuilder suffix = new StringBuilder("a");

		for (String w : S.split(" ")) {
			if (sb.length() != 0) {
				sb.append(" ");
			}

			char fChar = w.charAt(0);
			if (vowels.contains(fChar)) {
				sb.append(w);
			} else {
				sb.append(w.substring(1));
				sb.append(fChar);
			}

			sb.append("ma").append(suffix);

			suffix.append("a");
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I speak Goat Latin";
		System.out.println(goatLatin(str));
	}

}
