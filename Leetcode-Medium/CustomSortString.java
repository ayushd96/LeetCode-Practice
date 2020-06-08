import java.util.*;

public class CustomSortString {
	public static String customString(String S, String T) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char t : T.toCharArray()) {
			hm.put(t, hm.getOrDefault(t, 0) + 1);
			// System.out.println(hm);
		}
		StringBuilder sb = new StringBuilder();
		for (char s : S.toCharArray()) {
			int freq = hm.getOrDefault(s, 0);
			for (int i = 0; i < freq; i++) {
				sb.append(s);
				// System.out.println(sb.toString());
			}
			hm.remove(s);
			// System.out.println(hm);
		}
		for (char t : hm.keySet()) {
			int freq = hm.getOrDefault(t, 0);
			for (int i = 0; i < freq; i++) {
				sb.append(t);
				// System.out.println(sb.toString());
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "cba  ";
		String T = "abcd";
		System.out.println(customString(S, T));
	}

}
