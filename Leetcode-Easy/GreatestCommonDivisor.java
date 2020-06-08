import java.util.*;

public class GreatestCommonDivisor {
	public static String GCD(String str1, String str2) {
		if (str1.length() < str2.length())
			return GCD(str2, str1);
		if (str2.isEmpty())
			return str1;
		if (!str1.contains(str2))
			return "";
		str1 = str1.replace(str2, "");
		return GCD(str2, str1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		System.out.println(GCD(str1, str2));
		s.close();
	}

}
