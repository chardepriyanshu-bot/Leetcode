package org.com;

import java.util.Arrays;

public class Leetcode561ArrayPartition {

    public static int arrayPairSum(int[] nums) {
        
    		Arrays.sort(nums);
    		int first=0,second=1,min=0,temp=0;
    		 while(second<=nums.length) {
    			 temp=(nums[first]>nums[second])?nums[second]:nums[first];
    			 min=temp+min;
    			 second+=2;
    			 first+=2;
    		 }
    		 return min;
    		 
    } 
	public static void main(String[] args) {
		 int [] arr= {6, 2, 6, 5, 1, 2};
		 // 1,2,3,4
		 System.out.println(arrayPairSum(arr));
	}

}
