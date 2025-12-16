package org.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		for (int e:nums) {
			set.add(e);
		}
		 
		for (int i=1;i<=nums.length;i++) {
			if(!(set.contains(i))) {
				list.add(i);
			}
		}
			return list;
    }
	public static void main(String[] args) {
		 int [] arr = {1,1,2,2};
		 System.out.println(findDisappearedNumbers(arr));
	}

}
