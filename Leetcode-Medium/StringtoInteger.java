
public class StringtoInteger {
	public static int myAtoi(String str) {
		String[] parts = str.split(" ");
		int i = 0;
		for (String x : parts) {
			char[] c = x.toCharArray();
			for (int j = 0; j < c.length; j++) {
				if (Character.isDigit(c[j])) {
					i = Integer.parseInt(x);
				}
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "-345";
		System.out.println(myAtoi(str));
	}

}
