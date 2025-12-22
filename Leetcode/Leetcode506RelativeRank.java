package org.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode506RelativeRank {

	public static String[] findRelativeRanks(int[] score) {
		
		String str[] =new String[score.length];
		for(int i=0;i<score.length;i++) {
			str[i]=String.valueOf(score[i]);
		}
		 
		Arrays.sort(score);
		HashMap<Integer,Integer> map=new HashMap<>();
		int key=score.length;
		int index=0;
		
		for (int value:score) {
			map.put(value,key--);
		}
		
		for (int i=0;i<str.length;i++) {
			index=map.get(Integer.parseInt(str[i]));
			
			switch(index) {
			case 1->str[i]="Gold Medal";
			case 2->str[i]="Silver Medal";
			case 3->str[i]="Bronze Medal";
			default->str[i]=String.valueOf(index);
			}
		}
		
		return str;
		
	}
	public static void main(String[] args) {
		int []score= {10,3,8,9,4};
		System.out.println(Arrays.toString(findRelativeRanks(score)));

	}

}
