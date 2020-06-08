import java.util.*;

public class ReverseWordsInAString {
	public static String reverse(String str) {
		StringBuilder sb1;
		StringBuilder sb2 = new StringBuilder();
		String finalString = "";
		String[] parts = str.split(" ");
		for (String x : parts) {
			sb1 = new StringBuilder(x);
			finalString = sb1.reverse().toString();
			sb2.append(finalString + " ");
		}
		return sb2.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(reverse(str));
		s.close();
	}

}
