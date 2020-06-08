//import java.util.*;

public class FindAndReplaceString {
	/*
	 * Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // starting
	 * index in S -> matched source index in // sources
	 * 
	 * for (int i = 0; i < indexes.length; ++i) { String source = sources[i];
	 * System.out.println(source); int idx = indexes[i]; System.out.println(idx); if
	 * (S.substring(idx, idx + source.length()).equals(source)) { map.put(idx, i); }
	 * } System.out.println(map); StringBuilder sb = new StringBuilder(); for (int i
	 * = 0; i < S.length();) { if (map.containsKey(i)) {
	 * sb.append(targets[map.get(i)]); i += sources[map.get(i)].length(); } else {
	 * sb.append(S.charAt(i++)); } } return sb.toString();
	 */
	/*
	 * List<Integer> al = new ArrayList<Integer>();
	 * 
	 * for (int i = 0; i < indexes.length; i++) { al.add(indexes[i]); }
	 * Collections.sort(al); int index = 0; for (int x : al) { index = x; }
	 * 
	 * System.out.println(al); String resultstr = "";
	 */ /*
		 * String resultstr = ""; for (int i = 0; i < indexes.length; i++) { int index =
		 * indexes[i]; String source = sources[i]; if (str.startsWith(sources[i],
		 * indexes[i])) { resultstr = str.replace(sources[i], targets[i]); }
		 * 
		 * if (str.substring(index, index + source.length()).equals(source)) { resultstr
		 * = resultstr.replace(str.substring(index, index + sources[i].length()),
		 * targets[i]); }
		 */
	/*
	 * if (resultstr.endsWith(sources[i])) { resultstr =
	 * resultstr.replace(sources[i], targets[i]); } else i++;
	 */
	/*
	 * return resultstr;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "vmokgggqzp";
		int[] indexes = { 3, 5, 1 };
		String[] sources = { "kg", "ggq", "mo" };
		String[] targets = { "s", "so", "bfr" };
		System.out.println(findAndReplace(str, indexes, sources, targets));

	}

	public static String findAndReplace(String str, int[] indexes, String[] sources, String[] targets) {
		StringBuilder sb = new StringBuilder(str);
		int index = 0;
		String source = "";
		for (int i = 0; i < indexes.length; i++) {
			index = indexes[i];
			System.out.println(index);
			source = sources[i];
			System.out.println(source);
			System.out.println(str.substring(index, index + source.length()));
			if (str.substring(index, index + source.length()).equals(source)) {
				sb.delete(index, index + source.length());
				System.out.println("String after delettion===> " + sb.toString());
				sb.insert(index, targets[i]);
				System.out.println("String after insertion == > " + sb.toString());
				System.out.println(sb.toString());
			}

		}
		return sb.toString();
	}

}
