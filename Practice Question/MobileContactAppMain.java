package lab.Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ContactManager{
	List<String>contactNames;
	
	public ContactManager() {
		contactNames=new ArrayList<String>();
	}
	public void addContact(String name) {
		contactNames.add(name);
	}
	public int findContactPosition(String name) {
		System.out.print("Contact Position is ");
		return contactNames.indexOf(name)+1;
	}
	public void displayContacts() {
		System.out.println("Contact List are: ");
		for (String name:contactNames)
			System.out.println(name);
	}
}

public class MobileContactAppMain {

	public static void main(String[] args) {
		 ContactManager manager=new ContactManager();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size: ");
		 Integer size=Integer.parseInt(sc.nextLine());
		 for (int i=0;i<size;i++) {
			 System.out.println("Enter name:");
			 String name=sc.nextLine();
			 manager.addContact(name);
		 }
		 System.out.println("select operation"
		 		+ "\n1. Find contact position"
		 		+ "\n2. Display contact list");
		 int choice=Integer.parseInt(sc.nextLine());
		 switch(choice) {
		 case 1:
			 System.out.println("Enter contact name:");
			 String find=sc.nextLine();
			 System.out.print(manager.findContactPosition(find));
			 break;
		 case 2:
			 manager.displayContacts();
			 break;
		default:
			System.err.println("Please entered correct choice");
			break;	 
		 }
		 sc.close();
		 
	}

}
