
public class ReverseStringII {
	public static String reverse(String str, int k) {
		StringBuilder sb = new StringBuilder(str);
		for (int j = 0; j < str.length(); j += 2 * k) {
			for (int i = j; i < j + k && i < str.length(); i++) {
				sb.insert(j, str.charAt(i));
			}
			for (int i = j + k; i < j + 2 && i < str.length(); i++) {
				sb.append(str.charAt(i));
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		int k = 2;
		System.out.println(reverse(str, k));
	}

}
