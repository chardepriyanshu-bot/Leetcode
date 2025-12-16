package org.com;

import java.util.ArrayList;

public class Leetcode219 {
	 public boolean containsNearbyDuplicate(int[] nums, int k) {
	       int temp=0;
	       int f=-1;
	       int j=-1;
	       ArrayList l =new ArrayList<>();
	       
		 	for (int i=0;i<nums.length;i++) {
		 		
		 		k=l.indexOf(i);
		 		
		 	}
		 
	        return false;
	    }
	 
	 public static void main(String[] args) {
	
		 Leetcode219 obj=new Leetcode219();
		 
		 int [] arr= {1,2,3,1,2,3};
		 int k=2;
		 System.out.println(obj.containsNearbyDuplicate(arr,k));
	}
}
