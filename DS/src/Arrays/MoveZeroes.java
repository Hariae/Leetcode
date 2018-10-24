package Arrays;

public class MoveZeroes {
	
	//Leetcode :283
	
	public int[] shiftArray(int[] arr, int position) {
		
		//System.out.println(x);
		for(int i=position; i<arr.length;i++) {
			if(i<arr.length-1) {
				arr[i] = arr[i+1];
			}
						
		}
		arr[arr.length-1] = 0;
		return arr;
	}
	
	public int[] moveZeroes(int[] arr) {
		
		int counter = 0;
		//System.out.println("Inside");
		boolean flag = false;
		/*for(int i=0;i<arr.length;) {
			System.out.println("i" + i);
			if(i < arr.length-counter) {
				if(arr[i] == 0) {
					counter++;			
					System.out.println("Counter" + counter);
					arr = shiftArray(arr, i);
					flag = true;
				}
				
			}
			if(flag)
				i=0;
			else
				i++;
			
		}	*/
		
		int i = 0;
		while(i< arr.length) {
			if(i < arr.length-counter && counter <= arr.length) {
				if(arr[i] == 0) {
					counter++;			
					System.out.println("Counter" + counter);
					//arr = shiftArray(arr, i);
					
					for(; i<arr.length;i++) {
						if(i<arr.length-1) {
							arr[i] = arr[i+1];
						}								
					}
					
					arr[arr.length-1] = 0;
					flag = true;
				}
				else {
					flag = false;
				}
			}
			
			if(flag) {
				i = 0;
				flag = false;
			}
			else {
				i++;
			}
		}
		
		/*while(counter > 0) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] == 0) {
					//counter++;
					arr = shiftArray(arr, i);
				}
			}
			
			counter--;
			
		}*/
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroes obj = new MoveZeroes();
		int[] arr = {0,1, 0, 3, 12};
		arr = obj.moveZeroes(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
