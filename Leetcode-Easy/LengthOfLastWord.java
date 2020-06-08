
public class LengthOfLastWord {
	public static int length(String str) {
		int len = 0;
		if (Character.isWhitespace(str.charAt(0))) {
			return 0;
		}
		String[] parts = str.split(" ");
		for (int i = parts.length - 1;;) {
			len = parts[i].length();
			return len;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(length(str));
	}

}
