/*
 3. Find All Pairs That Sum to a Target

Question:
Input: {2, 7, 11, 15}, target = 9
Output: (2,7)
 */
package xyz.com;

import java.util.Arrays;

public class twoSum {

	public static void main(String[] args) {
		int[] arr={2, 7, 11, 15};
		int target=9;
		int start=0;
		int end=arr.length-1;
		int []index=new int [2];
		Arrays.sort(arr);
		while(start<end) {
			if(arr[end]>target) {
				end--;
			}
			else {
				int sum=arr[start]+arr[end];
				if(sum==target) {
					index[0]=arr[start];
					index[1]=arr[end];
					start++;
					end--;
				}
			}
		}
		System.out.println("("+index[0]+","+index[1]+")");
		
	}

}
