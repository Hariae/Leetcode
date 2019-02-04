package leetcodeProblems;

public class Excel_Sheet_Column_Number_171 {
	
	 public int titleToNumber(String s) {
		 int num = 0;
		 for(int i=0;i<s.length();i++) {
			 System.out.println((int)s.charAt(i)- 64);
			 num = num + (i+1)*(int)s.charAt(i)- 64;
		 }
	   return num;     
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excel_Sheet_Column_Number_171 obj = new Excel_Sheet_Column_Number_171();
		System.out.println(obj.titleToNumber("B"));
	}

}
