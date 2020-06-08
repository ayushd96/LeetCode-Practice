import java.util.*;

public class SplitArrayIntoFibbonacci {
	public static List<Integer> fibonacci(String str) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		fibonacciHelper(str, al, 0);
		return al;
	}

	private static boolean fibonacciHelper(String str, ArrayList<Integer> al, int start) {
		// TODO Auto-generated method stub
		if (start == str.length() && al.size() >= 3) {
			return true;
		}
		long num = 0;
		for (int i = start; i < str.length(); i++) {
			if (str.charAt(i) == '0' && i > start) {
				break;
			}
			num = num * 10 + str.charAt(i) - '0';
			System.out.print(num + " ");
			if (num > Integer.MAX_VALUE)
				break;
			if (al.size() >= 2 && num > al.get(al.size() - 1) + al.get(al.size() - 2))
				break;

			if (al.size() <= 1 || num == al.get(al.size() - 1) + al.get(al.size() - 2)) {
				al.add((int) num);
				if (fibonacciHelper(str, al, i + 1))
					return true;
				al.remove(al.size() - 1);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123456579";
		System.out.println(fibonacci(str));
	}
}
