
public class BinaryStrings {
	public static int binaryString(String str) {
		int count = 0;
		int prev = 0;
		int curr = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1))
				curr++;
			else {
				prev = curr;
				curr = 1;
			}
			if (prev >= curr) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10101";
		System.out.println(binaryString(str));
		
	}

}
