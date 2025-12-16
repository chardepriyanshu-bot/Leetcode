package org.com;

import java.util.Arrays;

public class Leetcode242IsAnagram {
	
	 public static boolean isAnagram(String s, String t) {
	      
    	 if(s.length()!=t.length()) {    
 			return false;         
 		}      
    	 char[] arr=s.toCharArray();
    	 char[] arr2=t.toCharArray();                                      
    	                                                 
    	 Arrays.sort(arr); 
    	 Arrays.sort(arr2);
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]!=arr2[i]) {
    			 return false;
    		 }
    	 }
 		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isAnagram("cat","rat"));

	}

}
