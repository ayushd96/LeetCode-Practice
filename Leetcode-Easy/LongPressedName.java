
public class LongPressedName {
	public static boolean longPressed(String name, String typed) {
		char[] c1 = name.toCharArray();
		char[] c2 = typed.toCharArray();
		int flag = 0;
		for (int i = 0; i < c2.length; i++) {
			if (flag < c1.length) {
				if (c1[flag] == c2[i])
					flag++;
			}
		}
		return (flag == c1.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "alex";
		String typed = "aalleeexx";
		System.out.println(longPressed(name, typed));
	}

}
