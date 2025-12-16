package org.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode349{
			public static void main(String[] args) {
				int [] arr= {1,2,2,1};
				int [] arr2= {1,2};
				List<Integer> list=new ArrayList<>();
				Arrays.sort(arr);
				Arrays.sort(arr2);
				int temp2=-1;
				int k=0;
				int current=-1;
				for (int i=0;i<arr.length;i++) {
					for (int j=0;j<arr2.length;j++) {
						if(current==arr[i]) {
							k++;continue;
						}
						if(temp2==arr[i]) {
							continue;
						}
						if (arr[i]==arr2[j] ) {
							list.add(arr[i]);
							temp2=arr[i];
							break;
						}
					}
					current=arr[i];
				}
				int[] arr3=new int[list.size()];
				for (int i=0;i<arr3.length;i++) {
					arr3[i]=list.get(i);
				}
				System.out.println(Arrays.toString(arr3));
				
			}
		
}