import java.util.*;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {

		if (strs == null) {
			return "";
		}
		String prefix = "";
		if (strs[0].isEmpty())
			prefix = strs[1];
		else
			prefix = strs[0];

		for (int i = 1; i < strs.length && !prefix.isEmpty(); i++) {
			while (!strs[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "", "flow", "floa" };
		System.out.print(longestCommonPrefix(strs));

	}

}
