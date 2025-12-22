package xyz.com;

import java.util.Arrays;

public class RotateArrayByTwo {

	public static void main(String[] args) {
		int k=2;
		int temp=0;
		int [] arr= {1,2,3,4,5};
		
		for(int i=0;i<k;i++) {
			temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
