package org.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode500KeyboardRow {
	
	public static String[] findWords(String[] words) {
       List<String> list=new ArrayList<>();
       
       String firstRow="qwertyuiop";
       String secondRow="asdfghjkl";
       String thirdRow="zxcvbnm";
   	
        for (String str:words) {
        	int[] row=new int[3];
        		for (char ch:str.toLowerCase().toCharArray()) {
        			if(firstRow.indexOf(ch)!=-1) {
        				row[0]=1;
        			}
        			else if(secondRow.indexOf(ch)!=-1) {
        				row[1]=1;
        			}
        			else if(thirdRow.indexOf(ch)!=-1) {
        				row[2]=1;
        			}
        		}
        		int sum=row[0]+row[1]+row[2];
        		if(sum==1) {
        			list.add(str);
        		}
        }
        
        String[] str=new String[list.size()];
        int index2=0;
        for (String s:list) {
        		str[index2++]=s;
        }
        return str;
       
    }
	public static void main(String[] args) {
		
		String [] words= {"Hello","Alaska","Dad","Peace"};
		System.out.println(Arrays.toString(findWords(words)));
	}
}
