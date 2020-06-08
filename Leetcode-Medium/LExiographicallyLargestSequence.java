import java.util.*;

public class LExiographicallyLargestSequence {
	public static String lexxt(String str) {
		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				al.add(str.substring(i, j));
			}
		}
		// System.out.println(al);
		String res = "";
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).compareTo(al.get(j)) < 0) {
					res = al.get(j);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(lexxt(str));
	}

}
