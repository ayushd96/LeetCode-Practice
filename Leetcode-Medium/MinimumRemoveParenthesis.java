
public class MinimumRemoveParenthesis {
	public static String minimumRemove(String str) {
		StringBuilder sb = new StringBuilder();
		int open = 0;
		for (char c : str.toCharArray()) {
			if (c == '(') {
				open++;

			} else if (c == ')') {
				if (open == 0) {
					continue;
				}
				open--;
			}
			sb.append(c);
			System.out.println("sb == > " + sb.toString());
			System.out.println("open == >" + open);
		}
		for (int i = sb.length() - 1; i >= 0 && open > 0; i--) {
			if (sb.charAt(i) == '(') {
				sb.deleteCharAt(i);
				open--;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "lee(((((((t(c)o)))de))";
		System.out.println(minimumRemove(str));

	}

}
