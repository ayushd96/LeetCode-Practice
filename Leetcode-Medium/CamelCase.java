import java.util.*;
import java.util.regex.Pattern;

public class CamelCase {
	public static List<Boolean> checkCamelCase(String[] queries, String pattern) {
		List<Boolean> al = new ArrayList<Boolean>();
		for (String query : queries) {
			al.add(isMatch(query, pattern));
		}
		return al;
	}

	private static Boolean isMatch(String query, String pattern) {
		// TODO Auto-generated method stub
		int i = 0;
		for (char c : query.toCharArray()) {
			if (i < pattern.length() && c == pattern.charAt(i))
				i++;
			else if (c < 'a')
				return false;
		}
		return i == pattern.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String queries[] = { "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack" };
		String pattern = "FB";
		System.out.println(checkCamelCase(queries, pattern));
	}

}
