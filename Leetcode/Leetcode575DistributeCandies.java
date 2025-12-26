package org.com;

import java.util.HashSet;
import java.util.Set;

public class Leetcode575DistributeCandies {
	
	 public static int distributeCandies(int[] candyType) {
	       
		 Set<Integer> set=new HashSet<>();
		 for (int e:candyType) {
			  set.add(e);
		 }
		 if(candyType.length/2>set.size()) {
			 return set.size(); 
		 }
			 return candyType.length/2;
	  }
	 
	public static void main(String[] args) {
		int candyType[] = {1,1,2,2,3,3};
		System.out.println(distributeCandies(candyType));
	}

}
