package practice.com;

import java.util.Scanner;

public class FirstLetterOfFirstNameLastName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the full name");
		String fullName=sc.nextLine();
		fullName.toUpperCase();
		int lchar=fullName.indexOf(" ");
		System.out.println(fullName.charAt(0)+"."+fullName.charAt(lchar+1));
		sc.close();
	}
}