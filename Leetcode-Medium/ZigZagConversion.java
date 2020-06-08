import java.util.Arrays;

public class ZigZagConversion {
	public static String zigzag(String str, int n) {
		if (n == 1)
			return str;
		char[] str1 = str.toCharArray();
		int len = str.length();
		String[] arr = new String[len];
		Arrays.fill(arr, "");
		int row = 0;
		boolean down = true;
		for (int i = 0; i < str.length(); i++) {
			arr[row] += str1[i];
			if (row == n - 1)
				down = false;
			else if (row == 0)
				down = true;
			if (down)
				row++;
			else
				row--;
		}

		String resString = "";
		if (str.length() < n) {
			return str;
		}
		for (int i = 0; i < n; i++) {
			resString += arr[i];
		}
		return resString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "paypalishiring";
		int n = 3;

		System.out.print(zigzag(str, n));
	}

}
