
public class ValidSubstitutions {
	public static boolean validSubs(String str) {
		StringBuilder sb = new StringBuilder(str);
		while (true) {
			int index = sb.indexOf("abc");
			if (index < 0) {
				break;
			}
			sb.delete(index, index + 3);
		}
		if (sb.length() == 0)
			return true;
		else

			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabc";
		System.out.println(validSubs(str));
	}

}
