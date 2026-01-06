package org.com;

import java.util.Stack;

public class Leetcode392IsSubsequence {
	 public boolean isSubsequence(String s, String t) {
	        int index=s.length()-1;
	        int count=0;

	        if(s.isEmpty())   return true;
	        
	        Stack<Character> stack =new Stack<>();
	        for (int i=0;i<t.length();i++) stack.push(t.charAt(i));

	        while(!stack.isEmpty() && index>=0){
	            if(s.charAt(index)==stack.pop()){
	                count++;
	                index--;
	            }
	        }
	        if(count==s.length()) return true;
	    
	    return false;}
	public static void main(String[] args) {
		String s="abc";
		String t="ahbgdc";
		System.out.println(new Leetcode392IsSubsequence().isSubsequence(s, t));
	}

}
