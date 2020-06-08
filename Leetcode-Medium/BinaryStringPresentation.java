import java.util.*;

public class BinaryStringPresentation {
	/*
	 * public static boolean binaryString(String str, int N) { if (N == 0 || N == 1)
	 * { return true; } if (str.isEmpty()) { return false; } String str1 = "";
	 * ArrayList<String> al = new ArrayList<String>();
	 * 
	 * for (int i = 1; i <= N; i++) { str1 = Integer.toBinaryString(i);
	 * al.add(str1); } // System.out.println(al); ArrayList<String> al1 = new
	 * ArrayList<String>();
	 * 
	 * for (int i = 0; i < str.length(); i++) { for (int j = i + 1; j <=
	 * str.length(); j++) { al1.add(str.substring(i, j)); } } //
	 * System.out.println(al1);
	 * 
	 * if (al1.containsAll(al)) return true;
	 * 
	 * return false; }
	 */

	public static boolean queryString(String S, int N) {
		for (int i = N; i > N / 2; --i)
			if (!S.contains(Integer.toBinaryString(i)))
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "0110";
		int N = 4;
		System.out.println(queryString(str, N));
	}

}
