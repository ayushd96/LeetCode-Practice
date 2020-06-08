import java.util.*;

public class MostCommonWord {
	public static String mostCommonWord(String paragraph, String[] banned) {
		/*
		 * if (paragraph.isEmpty()) { return ""; } if (banned.length == 0) { return
		 * paragraph.toLowerCase(); }
		 * 
		 * String word = ""; for (String x : banned) { paragraph =
		 * paragraph.replaceAll(x, "").toLowerCase(); } paragraph =
		 * paragraph.replaceAll("\\W+", ""); LinkedHashMap<String, Integer> hm = new
		 * LinkedHashMap<String, Integer>(); String[] parts = paragraph.split("\\s+");
		 * for (int i = 0; i < parts.length; i++) { if (hm.containsKey(parts[i])) {
		 * hm.put(parts[i], hm.get(parts[i]) + 1); } else { hm.put(parts[i], 1); } }
		 * System.out.println(hm); int maxValue = (Collections.max(hm.values())); for
		 * (Map.Entry<String, Integer> e1 : hm.entrySet()) { if (e1.getValue() ==
		 * maxValue) { word = e1.getKey().toLowerCase(); } } return word;
		 */
		String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words)
			map.put(word, map.getOrDefault(word, 0) + 1);
		for (String word : banned)
			if (map.containsKey(word))
				map.remove(word);
		String res = null;
		for (String word : map.keySet())
			if (res == null || map.get(word) > map.get(res))
				res = word;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = { "a" };
		System.out.println(mostCommonWord(paragraph, banned));
	}

}
