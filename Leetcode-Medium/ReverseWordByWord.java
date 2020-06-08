
public class ReverseWordByWord {
	public static String reverse(String str) {
		String[] parts = str.split("\\s+");
		String resultStr = "";

		for (int i = parts.length - 1; i >= 0; i--) {
			resultStr += parts[i] + " ";
		}
		return resultStr.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The sky is blue";
		System.out.println(reverse(str));
	}

}
