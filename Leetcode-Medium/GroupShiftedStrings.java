import java.util.*;

public class GroupShiftedStrings {
	public static List<List<String>> groups(String[] groups) {
		List<List<String>> al = new ArrayList<List<String>>();
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		for (String x : groups) {
			int res = 0;
			for (int i = x.length() - 1; i > 0; i--) {
				res += ((x.charAt(i) - x.charAt(i - 1) + 26)) % 26;
			}
			hm.put(x, res);
		}
		ArrayList<String> al1 = new ArrayList<String>();
		HashSet<Integer> set = new HashSet<Integer>(hm.values());
		for (int i : set) {
			al1 = new ArrayList<String>();
			for (Map.Entry<String, Integer> e1 : hm.entrySet()) {
				if (e1.getValue().equals(i)) {
					al1.add(e1.getKey());
				}
			}
			al.add(al1);
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] group = { "abc", "bcd", "acef", "xyz", "az", "ba", "z", "a" };
		System.out.print(groups(group));
	}

}
