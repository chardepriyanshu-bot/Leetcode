package org.com;

import java.util.Scanner;

public class Leetcode13 {
	
		public int RomantoInt(String str) {
			int sum=0,temp=0;
			
			for (int i=0;i<str.length();i++) {
				
					switch(str.charAt(i)) {
							
					case 'I':
						temp=1;break;
					case 'V':
						temp=5;break;
					case 'X':
						temp=10;break;
					case 'L':
						temp=50;break;
					case 'C':
						temp=100;break;
					case 'D':
						temp=500;break;
					case 'M':
						temp=1000;break;
					}
					
					if (i!=0 && (str.charAt(i)=='V' || str.charAt(i)=='X') ) { 
						
						if ((str.charAt(i)=='V' || str.charAt(i)=='X') && str.charAt(i-1)=='I') {
						temp=temp-2;
						}
					}
					else if (i!=0 && (str.charAt(i)=='L' || str.charAt(i)=='C') ) { 
					    		if ((str.charAt(i)=='L' || str.charAt(i)=='C') && str.charAt(i-1)=='X') {
					    			
					    				temp=temp-20;
					    		}
					}
					else if (i!=0 && (str.charAt(i)=='D' || str.charAt(i)=='M') ) {
						
				     if ((str.charAt(i)=='D' || str.charAt(i)=='M') && str.charAt(i-1)=='C') {
						temp=temp-200;
				     }
					}
					sum=sum+temp;
					temp=0;
				}
			return sum;
		}
		public static void main(String[] args) {
			
			Leetcode13 obj=new Leetcode13();
			System.out.println("Enter Roman Number in Alphabet :");
			Scanner sc=new Scanner(System.in);
		    String s=sc.next();
		    System.out.println(obj.RomantoInt(s));
		}
		
	}
