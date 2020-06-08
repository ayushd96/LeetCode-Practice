import java.util.*;

public class ValidPalindrome2 {
	public static boolean validPalindrome(String str) {
		str = str.replaceAll("\\W+", "");
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb1 = new StringBuilder();
		sb1 = sb.reverse();

		return str.equals(sb1.toString());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		System.out.println(validPalindrome(str));
	}

}
