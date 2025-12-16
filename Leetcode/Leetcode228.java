package org.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode228 {
	
	public List<String> summaryRanges(int[] nums) {
		ArrayList<String> list=new ArrayList<>();
		for (int i=0;i<nums.length-1;i++) {
			int start=nums[i];
			
			while (i+1<nums.length && nums[i+1]-nums[i]==1) {
				i++;
			}
				if (start!=nums[i]) {
					list.add(start+"->"+nums[i]);
				}
				else {
					list.add(""+start);
				}
			
		
		}
		return list;
	}
	public static void main(String[] args) {
		 Leetcode228 obj=new Leetcode228();
		 
		 int [] arr= {0,1,2,4,5,7};
		 
		 System.out.println(obj.summaryRanges(arr));

	}

}
