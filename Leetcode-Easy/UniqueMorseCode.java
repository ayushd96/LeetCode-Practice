import java.util.*;

public class UniqueMorseCode {
	public static int uniqueMorseCode(String[] words) {
		String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		HashSet<String> s = new HashSet<>();
		for (String w : words) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < w.length(); ++i)
				sb.append(codes[w.charAt(i) - 'a']);
			s.add(sb.toString());
		}
		return s.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] words = new String[4];
		for (int i = 0; i < words.length; i++) {
			words[i] = s.nextLine();
		}
		s.close();
		System.out.println(uniqueMorseCode(words));
	}

}
