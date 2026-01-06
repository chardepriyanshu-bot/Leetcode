package xyz.com;

public class BinarySearchMain {
	
	public static String binarySearch(int [] arr, int k) {
		int end=arr.length-1;
		int start=0;
		int point=0;

		while(start<=end) {
			point=(start+end)/2;
			
			if(arr[point]==k) {
				return "Found";
			}
			else if(arr[point]>k){
				end=point-1;
			}
			else if(arr[point]<k) {
				start=point+1;
			}
		}
		return "Not found";
	}
	
	public static void main(String[] args) {
		int arr[] = {1,5,6,9,11,14,20};
		int k=15;
		System.out.println(binarySearch(arr,k));
	}
}
