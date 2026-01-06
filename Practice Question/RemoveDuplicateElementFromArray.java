package xyz.com;

import java.util.Arrays;

public class RemoveDuplicateElementFromArray {
	
	public static void main(String[] args) {
		
		int[] arr= {3,1,5,1,7,3,5,3,10};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==Integer.MIN_VALUE || arr[j]==Integer.MIN_VALUE) {
					continue;
				}
				else if(arr[i]==arr[j]) {
					arr[j]=Integer.MIN_VALUE;
					count++;
				}
			}
		}
		int [] newArr=new int[arr.length-count];
		int index=0;
		for(int e:arr) {
			if(e!=Integer.MIN_VALUE) {
				newArr[index++]=e;
			}
		}
		
		System.out.println(Arrays.toString(newArr));
	}
}
