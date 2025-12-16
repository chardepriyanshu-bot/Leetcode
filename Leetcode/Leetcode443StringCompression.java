package org.com;

import java.util.Arrays;

public class Leetcode443StringCompression {
	
	    public static int compress(char[] arr) {
	         StringBuilder s=new StringBuilder();
	         int count=1;
	         s.append(arr[0]);
	         for (int i=1;i<arr.length;i++) {
	        	 	if(arr[i]==arr[i-1]) {
	        	 		count++;
	        	 	}
	        	 	else {
	        	 		if(count!=1) {
	        	 			s.append(count);
	        	 		}
	        	 		count=1;
	        	 		s.append(arr[i]);
	        	 	}
	         }if(count!=1) {
 	 			s.append(count);
 	 		}
	         
	         System.out.println(s);
	         for(int i=0;i<s.length();i++) {
	    
	        	 		arr[i]=s.charAt(i);
	        	 	
	         }
	         System.out.println(Arrays.toString(arr));
	         return 0;
	    }
	    public static void main(String[] args) {
	    	char[] arr={'a','b','b','c','c','c'};
	    System.out.println(compress(arr));;
		}
}
