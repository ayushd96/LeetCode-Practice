import java.util.*;

public class MinimumWindowSubsStringHard {
	public static void minimumWindowSubs(String str, String target) {

		// return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ADOBACODEBANC";
		String target = "ABC";

		int lenT = target.length();
		int minLen = Integer.MAX_VALUE;
		String result = "";

		if (target.isEmpty()) {
			System.out.println();
		}
		if (str.isEmpty()) {
			System.out.println();
		}

		HashMap<Character, Integer> hmT = new HashMap<Character, Integer>();

		for (char c : target.toCharArray()) {
			hmT.put(c, hmT.getOrDefault(c, 0) + 1);
		}
		int i = 0;
		int total = 0;
		HashMap<Character, Integer> hmS = new HashMap<Character, Integer>();
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (!hmT.containsKey(c)) {
				continue;
			}
			int count = hmS.getOrDefault(c, 0);
			if (count < hmT.get(c)) {
				total++;
			}
			hmS.put(c, count + 1);

			if (total == lenT) {
				while (!hmT.containsKey(str.charAt(i)) || hmS.get(str.charAt(i)) > hmT.get(str.charAt(i))) {
					char c1 = str.charAt(i);
					if (hmT.containsKey(c1) && hmS.get(c1) > hmT.get(c1)) {
						hmS.put(c1, hmS.get(c1) - 1);
					}
					i++;
				}
				if (minLen > j - i + 1) {
					minLen = j - i + 1;
					result = str.substring(i, j + 1);
				}
			}
		}
		System.out.print(result);
	}

}
