import java.util.*;

public class UniqueEmailAdress {
	public static int numberOfUniqueEmails(String[] emails) {
		HashSet<String> hs = new HashSet<String>();
		for (String x : emails) {
			String eMail = "";
			if (x.isEmpty()) {
				continue;
			}
			StringBuilder sb = new StringBuilder();
			int index1 = x.indexOf('@');
			String userName = x.substring(0, index1);
			if (userName.contains("+")) {
				int index2 = userName.indexOf('+');
				eMail = userName.substring(0, index2).replaceAll("\\.", "");
			} else {
				eMail = userName.substring(0, index1).replaceAll("\\.", "");
			}
			String domainName = x.substring(index1 + 1, x.length());
			sb.append(eMail).append('@').append(domainName);
			hs.add(sb.toString());
		}
		return hs.size();

		/*
		 * Set<String> normalized = new HashSet<>(); // used to save simplified email
		 * address, cost O(n) sapce. for (String email : emails) { String[] parts =
		 * email.split("@"); // split into local and domain parts. String[] local =
		 * parts[0].split("\\+"); // split local by '+'.
		 * normalized.add(local[0].replace(".", "") + "@" + parts[1]); // remove all
		 * '.', and concatenate '@' and // domain. } return normalized.size();
		 */
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String[] emails = new String[1];
		for (int i = 0; i < emails.length; i++) {
			emails[i] = s.nextLine();
		}
		System.out.println(numberOfUniqueEmails(emails));
		s.close();
	}

}
