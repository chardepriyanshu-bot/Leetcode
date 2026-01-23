package lab.Arraylist;

import java.util.*;

class Playlist{
	List<String> songs;
	
	public Playlist() {
		songs=new ArrayList<>();
	}
	public void addSong(String name) {
		songs.add(name);
	}
	public void updateSong(int index,String name) {
		songs.set(index-1, name);
		System.out.println("update index "+index);
		System.out.println("New song"+name);
	}
	public void removeSong(int index) {
		songs.remove(index-1);
		System.out.println("Remove index "+index);
	}
	public void displaySongs() {
		System.out.println("Songs are: ");
		for (String name:songs)
			System.out.println(name);
	}
}

public class MusicPlaylistManager {

	public static void main(String[] args) {
		Playlist playlist=new Playlist();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size: ");
		 Integer size=Integer.parseInt(sc.nextLine());
		 for (int i=0;i<size;i++) {
			 System.out.println("Enter name:");
			 String name=sc.nextLine();
			 playlist.addSong(name);
		 }
		 System.out.println("select operation"
			 		+ "\n1. Update"
			 		+ "\n2. Remove"
			 		+ "\n3. Display contact list");
			 int choice=Integer.parseInt(sc.nextLine());
			 switch(choice) {
			 case 1:
				 System.out.println("Enter update song index:");
				 int index=Integer.parseInt(sc.nextLine());
				 System.out.println("Enter update song name:");
				 String find=sc.nextLine();
				 playlist.updateSong(index, find);
				 break;
			 case 2:
				 System.out.println("Enter remove song index:");
				 int del=Integer.parseInt(sc.nextLine());
				 playlist.removeSong(del);
				 break;
			 case 3:
				 playlist.displaySongs();
				 break;
			default:
				System.err.println("Please entered correct choice");
				break;	 
			 }
			 sc.close();
	}

}
