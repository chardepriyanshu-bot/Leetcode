package org.com;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Leetcode414 {
	
	public int thirdMax(int[] nums) {
         Set<Integer> s=new HashSet<>();
         
         for (int e:nums) {
        	 	s.add(e);
         }
         s.remove(Collections.max(s));
         s.remove(Collections.max(s));
         
         return Collections.max(s);
    } 
	public static void main(String[] args) {
		Leetcode414 l=new Leetcode414();
		int [] arr= {3,2,1};
		System.out.println(l.thirdMax(arr));
	}

}
