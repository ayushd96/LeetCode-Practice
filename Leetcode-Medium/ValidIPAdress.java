import java.util.Arrays;

public class ValidIPAdress {
	public static String validIP(String IP) {
		String[] parts = IP.split("\\.");
		System.out.println(Arrays.toString(parts));
		for (String x : parts) {
			// int i = Integer.parseInt(x);
			if (x.charAt(0) == '0') {
				return "Not Valid";
			} else if (Integer.parseInt(x) < 0 && Integer.parseInt(x) > 255) {
				return "Not Valid";
			} else if (x.length() > 3 && x.length() < 1) {
				return "Not Valid";
			}
			if (x.length() == 4 && x.matches("[0-9a-fA-f]")) {
				System.out.println("IPV6");
			}
			/*
			 * else { return "IPV4"; }
			 */
		}
		return "IPV4";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String IP = "172a.a160.a254.1aa0";
		System.out.println(validIP(IP));
	}

}
