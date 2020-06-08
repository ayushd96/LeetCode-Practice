
public class ReverseOnlyLetters {
	public static String reverseLetters(String str) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (Character.isLetter(c))
				sb.append(c);
		}
		sb.reverse();
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i)))
				sb.insert(i, str.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a-bC-dEf-ghIj";
		System.out.println(reverseLetters(str));

	}

}
