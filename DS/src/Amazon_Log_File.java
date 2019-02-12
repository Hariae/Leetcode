import java.util.*;

public class Amazon_Log_File {

	public List<List<String>> sortStrings(List<List<String>> strings) {
		List<String> compactStrings = new ArrayList<String>();
		String temp = "";
		HashMap<String, List<String>> hm1 = new HashMap<String, List<String>>();
		HashMap<String, String> hm2 = new HashMap<String, String>();

		for (int i = 0; i < strings.size(); i++) {

			// first hash

			hm1.put(strings.get(i).get(0), strings.get(i).subList(1, strings.get(i).size()));

			for (int j = 1; j < strings.get(i).size(); j++) {
				temp += strings.get(i).get(j);
			}

			compactStrings.add(temp);
			// second hash
			hm2.put(temp, strings.get(i).get(0));
			temp = "";
		}

		Collections.sort(compactStrings);
		List<List<String>> result = new ArrayList<List<String>>();
		
		String digitString = "";
		//List<String> compactStringsNew = compactStrings;
		int counter=0;
		List<String> digitStrings = new ArrayList<String>();
		for (int i = 0; i < compactStrings.size(); i++) {
			if (compactStrings.get(i).chars().allMatch(Character::isDigit)) {
				//compactStringsNew.remove(compactStrings.get(i));
				//System.out.println(compactStrings.get(i));
				//counter++;
				digitStrings.add(compactStrings.get(i));
			}
		}
		compactStrings.removeAll(digitStrings);
		
		for(int i=0;i<digitStrings.size();i++) {
			compactStrings.add(digitStrings.get(i));
		}
		
		
		for (int i = 0; i < compactStrings.size(); i++) {
			//System.out.println(compactStrings.get(i));
			// System.out.println(hm2.get(compactStrings.get(i)));

			String key = hm2.get(compactStrings.get(i));
			List<String> tempList = hm1.get(key);
			tempList.add(0, key);
			//System.out.println("TMP size " + tempList.size() + "last elem : " + tempList.get(tempList.size() - 1));
			result.add(tempList);
		}

		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.print(result.get(i).get(j) + ", ");
			}
			System.out.println();
		}

		return strings;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_Log_File obj = new Amazon_Log_File();
		List<String> str = new ArrayList<String>();
		str.add("a1");
		str.add("9");
		str.add("2");
		str.add("3");
		str.add("1");
		List<List<String>> strings = new ArrayList<List<String>>();
		strings.add(str);

		str = new ArrayList<String>();
		str.add("g1");
		str.add("act");
		str.add("car");
		strings.add(str);

		str = new ArrayList<String>();
		str.add("z04");
		str.add("4");
		str.add("7");
		strings.add(str);

		str = new ArrayList<String>();
		str.add("ab1");
		str.add("off");
		str.add("key");
		str.add("dog");
		strings.add(str);

		str = new ArrayList<String>();
		str.add("a8");
		str.add("act");
		str.add("zoo");
		
		strings.add(str);

		obj.sortStrings(strings);
	}

}
