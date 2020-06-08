import java.util.*;

public class StringCompression {
	public static int compression(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char x : str.toCharArray()) {
			hm.put(x, hm.getOrDefault(x, 0) + 1);
		}
		StringBuilder sb = new StringBuilder();
		int minKey = Collections.min(hm.values());
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == minKey) {
				sb.append(entry.getKey());
			} else
				sb.append(entry.getKey()).append(entry.getValue());
		}
		return sb.toString().length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbbbbbbbbbbbbbb";
		System.out.println(compression(str));
	}

}
