package org.com;

public class Leetcode11ContainerWithMostWater {
	
	public  static int maxArea(int[] height) {
        int max=0;
        int temp=0;
        int i=0,j=height.length-1;
        while (i<j){
                 int first=j-i;
                 
                if(height[i]<height[j]){    
                    temp=first*height[i];
                    i++;
                }
                else {
                	 temp=first*height[j];
                	 j--;
                }
                
                if(max<temp){
                    max=temp;
                }
           
            }
        return max;
        }
	public static void main(String[] args) {
		 int[] height= {1,8,6,2,5,4,8,3,7};
		 System.out.println(maxArea(height));
	}

}
