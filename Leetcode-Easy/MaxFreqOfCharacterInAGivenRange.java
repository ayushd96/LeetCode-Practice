import java.util.*;

public class MaxFreqOfCharacterInAGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int Q = Integer.parseInt(s.nextLine());
		int a = 0, b = 0;
		ArrayList<Character> al = null;
		ArrayList<Character> al1 = new ArrayList<Character>();
		HashMap<Character, Integer> hm = null;
		char req = '\0';
		for (int i = 0; i < Q; i++) {
			a = Integer.parseInt(s.next());
			b = Integer.parseInt(s.next());
			String substr = str.substring(a, b + 1);
			hm = new HashMap<Character, Integer>();
			for (char c : substr.toCharArray()) {
				hm.put(c, hm.getOrDefault(c, 0) + 1);
			}
			int maxValue = Collections.max(hm.values());
			// System.out.println(maxValue);
			for (char key : hm.keySet()) {
				if (hm.get(key) == maxValue) {
					req = key;
					al = new ArrayList<Character>();
					al.add(req);

				}
			}
			// System.out.println(al);

			al1.add(al.get(0));
			// System.out.println(al1);
		}
		System.out.println(al1);
	}
}
