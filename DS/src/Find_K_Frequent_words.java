import java.util.*;

public class Find_K_Frequent_words {
	
	public String[] getKFrequentWords(String[] words, int k) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0;i<words.length;i++) {
			if(hm.containsKey(words[i])) {
				hm.put(words[i], (hm.get(words[i]) + 1));
			}
			else {
				hm.put(words[i], 1);
			}
		}
		int max = Integer.MIN_VALUE;
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			//System.out.println(entry.getKey() + " " + entry.getValue());
			if(entry.getValue() > max) {
				max = entry.getValue();
			}
		}
		
		String[] frequentWords = new String[max+1];
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			//System.out.println(entry.getKey() + " " + entry.getValue());
			frequentWords[entry.getValue()] = entry.getKey();
		}
		String[] res = new String[k];int z =0;
		
		for(int i=frequentWords.length-1;i>=0 && k>0;i--) {
			if(frequentWords.length > 0) {
				k--;
				res[z] = frequentWords[i];z++;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Find_K_Frequent_words obj = new Find_K_Frequent_words();
		
		String[] words = {"is", "was", "is", "dolly", "hello", "hello", "plus", "was", "was", "was", "hello"};
		//System.out.println(obj.getKFrequentWords(words, 2));
		String[] res = obj.getKFrequentWords(words, 2);
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		

	}

}
