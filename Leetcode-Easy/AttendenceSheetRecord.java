
public class AttendenceSheetRecord {
	public static boolean attendence(String str) {
		if (str.contains("LLL"))
			return false;
		String str1 = str.replace("A", "");
		if ((str.length() - str1.length()) > 1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PPPP";
		System.out.println(attendence(str));
	}

}
