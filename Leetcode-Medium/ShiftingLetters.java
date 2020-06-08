
public class ShiftingLetters {
	public static String shift(String str, int[] shifts) {
		char[] arr = str.toCharArray();
		int[] intArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = (int) arr[i];
		}
		for (int j = 0; j < shifts.length; j++) {
			for (int i = 0; i <= j; i++) {
				intArr[i] += shifts[j];
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] %= 26;
			arr[i] = (char) (intArr[i] + 'a');

		}
		String res = new String(arr);
		return res;
	}

	public static void main(String[] args) {
		String str = "bad";
		int[] shifts = { 10, 20, 30 };
		System.out.println(shift(str, shifts));
	}
}
