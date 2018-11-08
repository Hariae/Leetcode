
public class ReverseInteger {
	
	public static int reverseInteger(int x) {
		
	
		int n = Math.abs(x);
		int count = 0;
		
		while(n>0) {
			n = n/10;
			count++;			
		}
		int num = Math.abs(x);
		int res = 0;
		while(num > 0) {
			int digit = num % 10;
			num = num/10;
			res = (int) (res + digit * (Math.pow(10, count-1)));
			count--;
			if(res == 2147483647) {
				return 0;
			}
		}
		
		
		if(x < 0 ) {
			res *= -1;
		}
		//System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseInteger(1534236469));

	}

}
