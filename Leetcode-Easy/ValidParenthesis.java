import java.util.*;

public class ValidParenthesis {
	public static boolean parenthesis(String str) {
		int length;
		do {
			length = str.length();
			str = str.replace("()", "").replace("[]", "").replace("{}", "");
		} while (length != str.length());
		return str.length() == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{{{{{{{{}}}}}}}}}}}(((((()))))))) {[[[][][]][][][][][][";
		System.out.println(parenthesis(str));
	}

}
