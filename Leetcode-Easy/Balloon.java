import java.util.*;

public class Balloon {
	public static int instances(String text) {
		int result = 0;
		String text2 = "balloon";
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (int i = 0; i < text.length(); i++) {
			if (map1.containsKey(text.charAt(i))) {
				map1.put(text.charAt(i), map1.get(text.charAt(i)) + 1);
			} else {
				map1.put(text.charAt(i), 1);
			}
		}
		for (int i = 0; i < text2.length(); i++) {
			if (map2.containsKey(text2.charAt(i))) {
				map2.put(text2.charAt(i), map2.get(text2.charAt(i)) + 1);
			} else {
				map2.put(text2.charAt(i), 1);
			}
		}
		// System.out.println(map1);
		// System.out.println(map2);
		for (Map.Entry<Character, Integer> e1 : map1.entrySet()) {
			for (Map.Entry<Character, Integer> e2 : map2.entrySet()) {
				if (e1.getKey() == e2.getKey()) {
					result = e1.getValue() / e2.getValue();
					// System.out.println(result);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		System.out.println(instances(text));
		s.close();
	}

}
