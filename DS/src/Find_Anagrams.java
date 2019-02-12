import java.util.*;

public class Find_Anagrams {
	
	public List<String[]> findAnagramWithHash(List<String> words){
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for(int i=0;i<words.size();i++) {
			int hash = 0;
			for(int j=0;j<words.get(i).length();j++) {
				hash+=(int)words.get(i).charAt(j);
			}
			hm.put(hash, words.get(i));
		}
		
		List<String[]> result = new ArrayList<String[]>();
		for(int i=0;i<words.size();i++) {
			int hash = 0;
			for(int j=0;j<words.get(i).length();j++) {
				hash+=(int)words.get(i).charAt(j);
			}
			if(hm.containsKey(hash) && !hm.get(hash).equals(words.get(i))) {
				String[] res = new String[2];
				res[0] = hm.get(hash);
				res[1] = words.get(i);
				result.add(res);
			}
		}
		
		
		return result;
	}

	public String[] findAnagrams(String[] strings) {
		String[] res = new String[strings.length];
		int z=0;
		for(int i=0;i<strings.length;i++) {
			for(int j=i+1;j<strings.length;j++) {
				if(i != j) {
					char[] temp = strings[i].toLowerCase().toCharArray();
					char[] temp1 = strings[j].toLowerCase().toCharArray();
					Arrays.sort(temp); Arrays.sort(temp1);
					
					if(Arrays.equals(temp, temp1)) {
						//System.out.println(strings[i] + " " + strings[j]);
						res[z] = strings[i];z++; res[z] = strings[j]; z++;
						break;
					}
					
				}
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_Anagrams obj = new Find_Anagrams();
		String[] strings = {"tea", "ate", "eat", "apple", "java", "vaja", "cut", "utc"};
		/*
		 * String[] res = obj.findAnagrams(strings);
		 * 
		 * for(int i=0;i<res.length;i++) { System.out.println(res[i]); }
		 */
		List<String> words = new ArrayList<String>();
		words.add("tea");words.add("ate");words.add("eat");words.add("apple");words.add("java");words.add("vaja");words.add("cut");words.add("utc");
		List<String[]> result = obj.findAnagramWithHash(words);
		
		for(int i=0;i<result.size();i++) {
			System.out.println(result.get(i)[0] + " " + result.get(i)[1]);
		}
		
	}

}
