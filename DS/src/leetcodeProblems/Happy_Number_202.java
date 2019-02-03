package leetcodeProblems;

public class Happy_Number_202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int sum = 19;
		  int digitSum = 0;
		  while(sum < 100) 
		  {	
			  System.out.println(sum);
			  int x = sum;
			  while(x > 0) {
				  digitSum = digitSum + ((x % 10) * (x % 10));
				  x = x / 10;
			  }
			  
			  if(digitSum == 1) {
				 System.out.println("True");
				 break;
			  }
			  else {
				  sum = digitSum;
			  }
		  }
		 
	}

}
