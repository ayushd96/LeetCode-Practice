import java.util.*;

public class GroupAnagrams {
	public static List<List<String>> group(String[] strs) {
		Arrays.sort(strs);
		HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			String currentString = strs[i];
			// System.out.println("current String -->" + currentString);
			char[] charArr = strs[i].toCharArray();

			Arrays.sort(charArr);
			// System.out.println("charArr ==>" + Arrays.toString(charArr));
			String sortedString = new String(charArr);
			// System.out.println("sorted String ==>" + sortedString);
			List<String> tempList = hm.getOrDefault(sortedString, new ArrayList<String>());
			tempList.add(currentString);
			// System.out.println("tempList ==> " + tempList);
			hm.put(sortedString, tempList);
			// System.out.println("hm == >" + hm);
		}
		return new ArrayList<List<String>>(hm.values());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "ball", "tea", "allb" };
		System.out.println(group(strs));
	}

}
