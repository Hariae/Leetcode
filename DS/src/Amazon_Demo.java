
public class Amazon_Demo {
	public  int[] cellCompete(int[] cells, int days)
	  {
	    // INSERT YOUR CODE HERE
		int [] res = new int[cells.length];
		for(int i=0;i<days;i++) {
			
			if(i == 0 || i == cells.length-1) {
				cells[i] = 0;
			}
			else if((cells[i-1] == 0 && cells[i+1] == 0) || (cells[i-1] == 1 && cells[i+1] == 1)) {
					cells[i] = 0;
				}
				else {
					cells[i] = 1;
				}
			
			
		}
	    return cells;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_Demo obj = new Amazon_Demo();
		int[] cells = {1,0,0,0,0,1,0,0};
		int [] res = obj.cellCompete(cells, 1);
		
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}

}
