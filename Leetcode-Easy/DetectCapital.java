import java.util.*;

public class DetectCapital {
	public static boolean detection(String str) {
		return str.equals(str.toLowerCase()) || str.equals(str.toUpperCase())
				|| Character.isUpperCase(str.charAt(0)) && str.substring(1).equals(str.substring(1).toLowerCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "USA";
		System.out.println(detection(str));
	}

}
