import java.util.*;

public class BracketBalance {
	public static int bracketBalance(String str) {
		int balance = 0;
		int swap = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		char[] chars = str.toCharArray();
		int countLeft = 0;
		int countRight = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '[') {
				countLeft++;
				if (balance > 0) {
					swap += balance;
					balance--;
				}
			} else if (chars[i] == ']') {
				countRight++;
				balance = countRight - countLeft;
			}
		}
		return swap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[]][][";
		System.out.println(bracketBalance(str));
	}

}
