
public class CheckValidParenthesis {
	public static boolean validParenthesis(String str) {
		int i = 0;
		int left = 0;
		int right = 0;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				left++;
				right++;
			} else if (str.charAt(i) == ')') {
				if (left > 0) {
					left--;
				}
				right--;
			} else {
				if (left > 0) {
					left--;
				}
				right++;
			}
			if (right < 0) {
				return false;
			}
		}
		return left == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(*))))";
		System.out.println(validParenthesis(str));
	}
}
