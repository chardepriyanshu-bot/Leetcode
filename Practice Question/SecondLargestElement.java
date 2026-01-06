/*
1. Find the Second Largest Element Without Sorting

Question:
Given an integer array, find the second largest element without sorting.
 */

package xyz.com;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] arr=  {0, 1, 0, 3, 12};
		
		int firstLargest=arr[0];
		for (int e:arr) {
			if(firstLargest<e) {
				firstLargest=e;
			}
		}
		int secondLargest=arr[0];
		for (int e:arr) {
			if(secondLargest<e && firstLargest!=e) {
				secondLargest=e;
			}
		}
		System.out.println(secondLargest);
	}
}
