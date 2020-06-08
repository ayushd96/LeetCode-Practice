/*import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.stream.Stream;*/

public class ComplexNumberSum {
	/*
	 * public static String complex(String a, String b) { int[] coefs1 =
	 * Stream.of(a.split("\\+|i")).mapToInt(Integer::parseInt).toArray(), coefs2 =
	 * Stream.of(b.split("\\+|i")).mapToInt(Integer::parseInt).toArray(); return
	 * (coefs1[0] * coefs2[0] - coefs1[1] * coefs2[1] + "+" + (coefs1[0] * coefs2[1]
	 * + coefs1[1] * coefs2[0]) + "i"); }
	 */
	public static String complex(String a, String b) {
		int[] valA = getValue(a);
		int[] valB = getValue(b);
		int real = valA[0] * valB[0] - valA[1] * valB[1];
		int imag = valA[0] * valB[1] + valA[1] * valB[0];
		return real + "+" + imag + "i";
	}

	private static int[] getValue(String s) {
		// TODO Auto-generated method stub
		String[] str = s.split("\\+");
		int[] val = new int[2];
		val[0] = Integer.parseInt(str[0]);
		int indexOfI = str[1].indexOf('i');
		val[1] = Integer.valueOf(str[1].substring(0, indexOfI));
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1+1i";
		String b = "1+1i";
		System.out.print(complex(a, b));
	}

}
