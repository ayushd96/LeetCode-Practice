import java.util.*;

public class RemoveComments {
	public static List<String> removeComments(String[] source) {
		List<String> al = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (String s : source) {
			for (int i = 0; i < s.length(); i++) {
				if (flag) {
					if (s.charAt(i) == '*' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
						flag = false;
						i++;
					}
				} else {
					if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
						break;
					} else if (s.charAt(i) == '/' && i < s.length() && s.charAt(i + 1) == '*') {
						flag = true;
						i++;
					} else {
						sb.append(s.charAt(i));

					}
				}
			}
			if (!flag && sb.length() > 0) {
				al.add(sb.toString());
				sb = new StringBuilder();
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] source = { "/*Test program */", "int main()", "{", "// variable declaration", "int a, b, c;",
				"/* This is a test", "multiline", "comment for", "testing */", "a = b + c;", "}" };
		System.out.println(removeComments(source));
	}

}
