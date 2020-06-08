import java.util.*;

public class FindDuplicateFiles {
	public static List<List<String>> findDuplicates(String[] paths) {
		ArrayList<List<String>> al = new ArrayList<List<String>>();
		Map<String, Set<String>> hm = new HashMap<String, Set<String>>();
		for (String files : paths) {
			String[] str = files.split("\\s+");
			for (int i = 1; i < str.length; i++) {
				int index = str[i].indexOf("(");
				String fileContext = str[i].substring(index);
				String fileName = str[0] + "/" + str[i].substring(0, index);
				Set<String> fileNames = hm.getOrDefault(fileContext, new HashSet<String>());
				fileNames.add(fileName);
				// System.out.println("set==>" + fileNames);
				hm.put(fileContext, fileNames);
				// System.out.println("hm==>" + hm);
			}
		}
		for (String key : hm.keySet()) {
			if (hm.get(key).size() > 1) {
				al.add(new ArrayList<String>(hm.get(key)));
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] paths = { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)",
				"root 4.txt(efgh)" };
		System.out.println(findDuplicates(paths));
	}

}
