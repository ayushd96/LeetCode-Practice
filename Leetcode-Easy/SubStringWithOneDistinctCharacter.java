import java.util.*;

public class SubStringWithOneDistinctCharacter {
	public static void subs(String str) {
		int l = str.length();
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < l) {
			while ((j < l) && str.charAt(j) == str.charAt(i)) {
				j++;
			}
			int n = j - i;
			count += (n * (n + 1) / 2);
			i = j;
		}
		System.out.println(count);
		// return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			al.add(s.nextLine());
		}
		for (String s1 : al) {
			subs(s1);
			// System.out.println(k);
		}
	}

}
