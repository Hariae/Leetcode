package leetcodeProblems;

public class Power_of_Three_326 {
	public boolean isPowerOfThree(int n) {
       if(n == 0) return false;
       while(n > 1) {
    	   if(n % 3 == 0) {
    		   n = n/3;
    	   }
    	   else {
    		   return false;
    	   }
       }
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(326);
		Power_of_Three_326 obj = new Power_of_Three_326();
		System.out.println(obj.isPowerOfThree(0));
	}
}
