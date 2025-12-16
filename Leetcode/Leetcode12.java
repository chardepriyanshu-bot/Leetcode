package org.com;

import java.util.Scanner;

public class Leetcode12 {
	
	 public String intToRoman(int num) {
		 
		 int temp;
		 String str="";
		 char c;
		 
		 
		while(num!=0) {
			
			
			if (num>=1000){
				 
				 temp=num/1000;
				for (int i=1;i<=temp;i++) {
					str=str+"M";
				}
				num= num-(1000*temp);
				temp=0;
			 } 
	 
			 else if (num>99 && num<1000) {
				 
				 if (num>900 && num<1000) {
					 num=num-900;
					 str=str+"CM";
				 }
				 
				 else if (num<=900  && num>=500) {
						num=num-500;
						str=str+"D";
					}
					else if (num>=400 && num<500){
						num=num-400;
						str=str+"CD";
					}
					else {
						     temp=num/100;
							for (int i=1;i<=temp;i++) {
								str=str+"C";
							}
							num= num-(100*temp);
							temp=0;
					}
					 
				 } 
			
			if (num<100) {
				
				if (num>=90 && num<=99) {
					str=str+"XC";
					num=num-90;
				}
				else if (num>=50 && num<90) {
					str=str+"L";
					num=num-50;
			
				}
				else if (num>=40 && num<=49){
					str=str+"XL";
					num=num-40;
				}
				else if (num>=10 && num<40) {
					temp=num/10;
					for (int i=1;i<=temp;i++) {
						str=str+"X";
					}
					num= num-(10*temp);
					temp=0;
				}
				else if (num==9) {
					str=str+"IX";
					num=num-9;
				}
				else if (num>=5 && num<=8) {
					str=str+"V";
					num=num-5;
				}
				else if (num==4) {
					str=str+"IV";
					num=num-4;
				}
				else {
					temp=num%10;
					for (int i=1;i<=temp;i++) {
						str=str+"I";
					}
					num= num-(1*temp);
					temp=0;
				}
			
			}
			
		}	 
		return str;
		 
	    }
	 
	 public static void main(String[] args) {
			
			Leetcode12 obj=new Leetcode12();
			System.out.println("Enter the Number:");
			Scanner sc=new Scanner(System.in);
		    int s=sc.nextInt();
		    System.out.println(obj.intToRoman(s));
		}
		
}
