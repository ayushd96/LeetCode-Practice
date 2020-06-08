import java.util.*;

public class GenerateParenthesis {
	public static List<String> generate(int N) {
		List<String> al = new ArrayList<String>();
		parenthesis(al, "", 0, 0, N);
		return al;
	}

	private static void parenthesis(List<String> al, String string, int i, int j, int n) {
		if (string.length() == n * 2) {
			al.add(string);
			return;
		}
		if (i < n)
			parenthesis(al, string + "(", i + 1, j, n);
		if (j < i)
			parenthesis(al, string + ")", i, j + 1, n);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		System.out.println(generate(N));
	}

}
