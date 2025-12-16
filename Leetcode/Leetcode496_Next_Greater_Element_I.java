package org.com;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Leetcode496_Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    boolean isFound=false; 
    List<Integer> list=new ArrayList<>();
    	for (int i=0;i<nums1.length;i++) {
    		
    		for (int j=0;j<nums2.length;j++) {
    			
    			if((nums1[i]==nums2[j]) && j==nums2.length-1){
    				    list.add(-1);
					isFound=true;
					break;
    			} 
    			
    			else if(nums1[i]==nums2[j] && j<nums2.length) {
    				
    				for(int k=j;k<nums2.length;k++) {
    					
    					if(nums2[j]<nums2[k]) {
    						list.add(nums2[k]);
    						isFound=true;
    						break;
    					}
    					else if(nums2[j]>nums2[k] && k==nums2.length-1) {
    						list.add(-1);
    						isFound=true;
    						break;
    					}
    				}
    			}
    		}
    		if(!(isFound)) {
    			list.add(-1);
    		}
    	}
    	int [] arr=new int[list.size()];
    	for(int i=0;i<arr.length;i++) {
    		arr[i]=list.get(i);
    	}
    	return arr;
    }
    public static void main(String[] args) {
    	
    	Leetcode496_Next_Greater_Element_I l=new Leetcode496_Next_Greater_Element_I();
    		int [] num1= {2,1,3};
    		int [] num2= {2,3,1};
    		System.out.println(Arrays.toString(l.nextGreaterElement(num1, num2)));
    }
}
