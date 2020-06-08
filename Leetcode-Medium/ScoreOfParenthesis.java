import java.util.*;

public class ScoreOfParenthesis {
	public static int scoreOfParenthesis(String str) {
		int count = 0;
		int open = 0;
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				open++;
				flag = true;

			} else {
				if (flag) {
					count += Math.pow(2, open - 1);
					flag = false;
				}
				open--;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(()(())";
		System.out.println(scoreOfParenthesis(str));
	}

}
