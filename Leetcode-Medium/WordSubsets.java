import java.util.*;

public class WordSubsets {
	public static List<String> findSubsets(String[] A, String[] B) {
		ArrayList<String> al = new ArrayList<String>();
		HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tempCount = new HashMap<Character, Integer>();
		for (String b : B) {
			tempCount = updated(b);
			System.out.println("tempCount==>" + tempCount);
			for (char key : tempCount.keySet()) {
				if (bMap.containsKey(key)) {
					bMap.put(key, Integer.max(tempCount.get(key), bMap.get(key)));
				} else
					bMap.put(key, tempCount.get(key));
			}
		}
		System.out.println("bMap ==" + bMap);
		for (String a : A) {
			if (isTrue(a, bMap)) {
				al.add(a);
			}
		}
		return al;
	}

	private static boolean isTrue(String a, HashMap<Character, Integer> bMap) {
		Map<Character, Integer> aMap = new HashMap<Character, Integer>();
		aMap = updated(a);
		for (char c : bMap.keySet()) {
			if (!aMap.containsKey(c)) {
				return false;
			} else if (aMap.get(c) < bMap.get(c)) {
				return false;
			}
		}
		return true;
	}

	private static HashMap<Character, Integer> updated(String b) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : b.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] A = { "amazon", "apple", "facebook", "google", "leetcode" };
		String[] B = { "ec", "oc", "ceo" };
		System.out.println(findSubsets(A, B));
	}

}
/*
 * int[] count = new int[26], temp; int i; for (String b : B) { temp =
 * counter(b); for (i = 0; i < 26; i++) { count[i] = Math.max(count[i],
 * temp[i]); } } List<String> al = new ArrayList<String>(); for (String a : A) {
 * temp = counter(a); for (i = 0; i < 26; i++) { if (temp[i] < count[i]) {
 * break; } } if (i == 26) al.add(a); }
 * 
 * return al;
 */
/*
 * }
 * 
 * private static int[] counter(String word) { int[] count = new int[26]; for
 * (char c : word.toCharArray()) count[c - 'a']++; return count;
 * 
 */