package Stacks;

public class ValidParanthesis {
	
	public boolean isValid(String s) {
		char top='0';
		char[] stack = new char[s.length()];
		int stackCounter=-1;
		if(s.length() == 0) {
			return true;
		}
		if(s.length() % 2 != 0) {
			return false;
		}
		for(int i=0;i<s.length();i++) {			
			if(top == s.charAt(i)) {
				//pop();
				
				if(stackCounter == 0) {
					top = '0';
				}
				else {
					stackCounter--;							
					top = stack[stackCounter];
									
				}								
			}
			else {
				//push();
				char temp='0';
				if(s.charAt(i) == '(') {
					temp = ')';
				}
				else if(s.charAt(i) == '{') {
					temp = '}';
				}
				else if(s.charAt(i) == '[') {
					temp = ']';
				}
				else {
					return false;
				}
				stackCounter++;
				stack[stackCounter] = temp;
				top = temp;				
								
			}
		}
		
		if(stackCounter != 0) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		ValidParanthesis obj = new ValidParanthesis();
		System.out.println(obj.isValid("["));
		
	}

}
