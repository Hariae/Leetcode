
public class PalindromNumber {
	public boolean isPalindrome(int x) {

		// count digits
		int num = x;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		num = x;
		int elementsToPush = count / 2;
		int[] stack = new int[elementsToPush];
		int tempCount = count;

		for (int i = 0; i < elementsToPush; i++) {
			stack[i] = (int) (num / Math.pow(10, tempCount - 1));
			num = (int) (num % Math.pow(10, tempCount - 1));
			tempCount--;
		}

		

		if (count % 2 != 0) {
			num = (int) (num % Math.pow(10, tempCount - 1));
			tempCount--;
		}
		

		for (int i = stack.length - 1; i >= 0; i--) {
			int temp = (int) (num / Math.pow(10, tempCount - 1));
			
			if (stack[i] != temp) {
				return false;
			} 
			else {
				num = (int) (num % Math.pow(10, tempCount - 1));
			}
			tempCount--;
		}


	return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromNumber obj = new PalindromNumber();
		System.out.println(obj.isPalindrome(100));

	}

}
