package leetcodeProblems;

public class RomanToInteger {
	public int romanToInt(String s) {
		int res = 0;
		char pre = 'A';
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'I') {
				res+=1;
				pre = 'I';
				
			}
			else if(s.charAt(i) == 'V') {
				if(pre == 'I') {
					res = res + 3;
				}
				else {
					res += 5;
				}
				
				pre = 'V';
			}
			else if(s.charAt(i) == 'X') {
				if(pre == 'I') {
					res = res + 8;
				}
				else {
					res += 10;	
				}
				
				pre = 'X';
			}
			else if(s.charAt(i) == 'L') {
				if(pre == 'X') {
					res += 30;
				}
				else {
					res += 50;
				}
				pre = 'L';
			}
			else if(s.charAt(i) == 'C') {
				if(pre == 'X') {
					res += 80;
				}
				else {
					res += 100;
				}
				pre = 'C';
			}
			else if(s.charAt(i) == 'D') {
				if(pre == 'C') {
					res += 300;
				}
				else {
					res += 500;
				}
				pre = 'D';
			}
			else if(s.charAt(i) == 'M') {
				if(pre == 'C') {
					res += 800;
				}
				else {
					res += 1000;
				}
				pre = 'M';
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger obj = new RomanToInteger();
		System.out.println(obj.romanToInt("MCMXC"));
	}

}
