import java.util.*;

public class BalancedStrings {
	public static int balanced(String str) {

		int count = 0;
		int total = 0;

		for (char c : str.toCharArray()) {
			if (c == 'R')
				count++;
			if (c == 'L')
				count--;
			if (count == 0)
				total++;
		}

		return total;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(balanced(str));
		s.close();
	}

}
