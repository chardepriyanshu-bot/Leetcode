package org.com;

import java.util.Scanner;

public class Leetcode43 {

	public static int tenth(int num) {
		int i=1,temp=1;
		while(i<num) {
			temp=temp*10;
		}
		return temp;
	}
	
	public String multiply(String num1, String num2) {
        /*long temp=Integer.parseInt(num1);
        long temp2=Integer.parseInt(num2);
        long temp3=0;
        temp3=(temp*temp2);
        String str=Long.toString(temp3);
    
        return str;
        */
		int temp=0,carry=0,mul=0,temp2=0,add=0,count=0;
		for (int i=num1.length()-1;i>=0;i--) {
			
			for (int j=0;j<num2.length();j++) {
				
				temp=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
				if (temp<100) {
					
					carry=temp/10;
				
					temp=temp%10;
					temp2=(10*temp2)+carry+temp;
				}	
			}
			if (count ==0) {
				mul=(10*mul)+temp2;
			}
			else {
				mul=(tenth(count)*mul)*temp2;
			}
			add=add+mul;
			System.out.println(add);
			count++;
			mul=1;
			carry=0;
			temp2=0;
			
		}
	
		return String.valueOf(add);
        
    }
	public static void main(String[] args) {
		Leetcode43 obj=new Leetcode43();
		System.out.println("Enter the two Numbers  :");
		Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    System.out.println(obj.multiply(s1,s2));
	    sc.close();
	}

}
