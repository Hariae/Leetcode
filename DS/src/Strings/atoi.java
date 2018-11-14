package Strings;

//#8
public class atoi {
	
	public int myAtoi(String str) {
		
		for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                str = str.substring(i+1);
            }
            else{
                break;
            }
        }
		//0-9 : 48 to 57 ; + 43 ; - 45
		System.out.println("str:"+ str);
		String res = "";
		
		for(int i=0;i<str.length();i++) {
			int currentAscii = str.charAt(i);
			
			
			
			if((i==0 && (currentAscii == 43 || currentAscii == 45)) || (currentAscii >= 48 && currentAscii <= 57)) {
				res = res + str.charAt(i);				
			}
			else {
				break;
			}
		}
		
		int count=0;
		for(int i=1;i<res.length();i++) {
			
			if(res.charAt(i) == '0') {				
				count++;
			}
			else {
				System.out.println("break");
				break;
			}
		}
		System.out.println("count"+count);
		res = res.substring(count);
		System.out.println(res);
		
		
		if(res.charAt(0) == '-' && res.length() > 11) {
			return Integer.MIN_VALUE;			
		}
		
		if(res.length() > 11) {			
			return Integer.MAX_VALUE;
		}
		
		//System.out.println(Long.parseLong(res));
		if(res.length() > 0 && !res.equals("+") && !res.equals("-")) {
			if(Long.parseLong(res) < Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			if(Long.parseLong(res) > Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
		}
		else {
			return 0;
		}
			
		
		return Integer.parseInt(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		atoi obj = new atoi();
		System.out.println(obj.myAtoi(" +0 123"));

	}

}
