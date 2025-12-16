package org.com;

public class Leetcode68SquareRoot {
	 public static int mySqrt(int x) {
	       int result=0;
			if(x<=0) {
				result=0;
			}
	        else if(x==1 || x==2 || x==3){
	            result=1;
	        }
			else {
				for(int i=0;i<=x/2;i++) {
					if((i*i)==x) {
						result=i;
						break;
					}
					else if(i*i>x){
						result=i-1;
						break;
					}
				}
				
			}
	        return result;
	    }
	public static void main(String[] args) {
		
		System.out.println(mySqrt(83));
	}

}
