package leetcodeProblems;

public class First_Unique_Character_in_a_String_387 {
	public int firstUniqChar(String s) {
        int[] arr = new int[255];
        
        for(int i=0;i<s.length();i++) {
        	int index = (int)s.charAt(i);
        	arr[index] = arr[index] + 1;
        }
        
        for(int i=0;i<s.length();i++) {
        	int index = (int)s.charAt(i);
        	if(arr[index] == 1) {
        		return i;
        	}
        }
		
		return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("387");
		First_Unique_Character_in_a_String_387 obj = new First_Unique_Character_in_a_String_387();
		System.out.println(obj.firstUniqChar("loveleetcode"));
	}

}
