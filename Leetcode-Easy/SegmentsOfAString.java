
public class SegmentsOfAString {
	public static int segment(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))
				res++;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ", , , ,        a, eaefa";
		System.out.println(segment(str));
	}

}
