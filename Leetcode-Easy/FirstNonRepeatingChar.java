import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static int firstUniq(String str) {
		int k = 0;
		int result = 0;
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (lhm.containsKey(str.charAt(i))) {
				lhm.put(str.charAt(i), lhm.get(str.charAt(i)) + 1);
			} else {
				lhm.put(str.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> e1 : lhm.entrySet()) {
			if (e1.getValue().equals(1)) {
				k++;
				result = k - 1;
				break;
			} else
				k++;
		}
		// System.out.println(lhm);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "loveleetcode";
		System.out.println(firstUniq(str));
	}

}
