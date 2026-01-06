package xyz.com;

 public class SearchElement {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};
		int tar=9;
		
		for (int element : arr) {
			if(element==tar) {
				System.out.println("Element is a found");
				return;
			}
		}
		System.out.println("Element is a not found");
	}
}
