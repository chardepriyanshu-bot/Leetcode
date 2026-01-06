/*
2. Move All Zeroes to the End (Stable Order)

Question:
Input: {0, 1, 0, 3, 12}
Output: {1, 3, 12, 0, 0}
 */
package xyz.com;

import java.util.Arrays;

public class MoveZeroToEndOfArray {
	public static void main(String[] args) {
		int arr[] ={0, 1, 0, 3, 12};
		
		for (int i=0;i<arr.length-1 ;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int index=0;
		int arr2[]=new int[arr.length];
		for (int i=arr.length-1;i>=0;i--) {
			arr2[index++]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		
	}
}
