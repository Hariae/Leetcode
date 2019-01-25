package leetcodeProblems;

public class Reverse_String_344 {
	
	public void reverseString(char[] s) {
		int mid = s.length/2;
		int j = s.length-1;
		for(int i=0;i<mid;i++) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			j--;
		}
		
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(344);
		char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
		Reverse_String_344 obj = new Reverse_String_344();
		obj.reverseString(s);
	}

}
