import java.util.*;

public class MultiplyStrings {
	public static int multiplyStrings(String str1, String str2) {
		if (str1.length() == 1 && str2.length() == 1) {
			return 0;
		}
		int count = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		int carry = 0;
		String[] n2 = str2.split("");
		for (String x : n2) {
			int n = Integer.parseInt(x);
			for (int i = str1.length() - 1; i >= 0; i--) {
				int n1 = str1.charAt(i) - '0';
				if (n1 * n + carry >= 10) {
					carry = n1 * n / 10;
					// System.out.println(carry);
					al.add(carry);
					count++;
				}

			}

		}
		System.out.println(al);
		int sum = 0;
		for (int i = 0; i < al.size(); i++) {
			sum += al.get(i);
		}
		System.out.println(sum);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "124";
		String str2 = "456";
		System.out.println(multiplyStrings(str1, str2));
	}

}
