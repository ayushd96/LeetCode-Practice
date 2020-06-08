import java.util.*;

public class ReplaceForBalanceString {
	/*
	 * public static int balanceString(String str) { HashMap<Character, Integer> hm
	 * = new HashMap<Character, Integer>(); ArrayList<Integer> al = new
	 * ArrayList<Integer>(); int count = 0; for (int i = 0; i < str.length(); i++) {
	 * hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1); } for (char key
	 * : hm.keySet()) { if (hm.get(key) > 1) { count++; } //
	 * System.out.println(count); } System.out.println(count); return 0; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str = "QQQQ";
		// System.out.println(balanceString(str));
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = " QQQW";// QQWE

		String[] arr = str.split("");
		HashSet<String> hs = new HashSet<String>(Arrays.asList(arr));
		ArrayList<String> all = new ArrayList<String>();
		all.addAll(hs);
		// System.out.println(all);
		int count = 0;
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).equals("Q")) {
				// all.get(i)= arr[i].replaceFirst("Q", "");
				count++;

			}
			if (all.get(i).equals("W")) {
				count++;
			}
			if (all.get(i).equals("E")) {
				count++;
			}
			if (all.get(i).equals("R")) {
				count++;
			}

		}
		// System.out.println(Arrays.toString(arr));
		// System.out.println(count);
		int res = arr.length - count;
		System.out.println(res);

	}

}
