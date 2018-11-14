package Arrays;
import java.util.*;
//#11
public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int area = 0;
		int maxArea = 0;
		for(int i=0;i<height.length;i++) {
			for(int j=i+1;j<height.length;j++) {
				area = (j-i) * (height[j] > height[i] ? height[i] : height[j]);
				if(area > maxArea) {
					maxArea = area;
				}				
			}			
		}		
		return maxArea;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater obj = new ContainerWithMostWater();
		int[] height = {1,2};
		System.out.println(obj.maxArea(height));
		

	}

}
