
public class MinimumSwaps {
	public static int minSwaps(String str1, String str2) {
		int count = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < str1.length(); ++i) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (str1.charAt(i) == 'x') {
					++x;
				} else
					++y;
			}
		}
		count = x + y;
		if (count % 2 == 1)
			return -1;
		return (count / 2) + (x % 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "xy";
		String str2 = "yx";
		System.out.println(minSwaps(str1, str2));
	}

}
