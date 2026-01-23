package lab.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RetrivedName {
	  public static void main(String[] args) {
	       EmployeeManager em=new EmployeeManager();
	       System.out.println("Enter size: ");
	       Scanner sc=new Scanner(System.in);
	       int size=Integer.parseInt(sc.nextLine());
	       for (int i=0;i<size;i++){
	    	   System.out.println("Enter a name: ");
	            String name=sc.nextLine();
	            em.addEmployee(name);
	       }
	       em.sortEmployee();
	       em.displayEmployees();
	       sc.close();
	    }
	}
	class EmployeeManager{
	    List<String> employeeNames;
	    
	    public EmployeeManager() {
	    		employeeNames=new ArrayList<>();
	    }
	    public void addEmployee(String name){
	        employeeNames.add(name);
	    }
	    public void sortEmployee(){
	        Collections.sort(employeeNames);
	    }
	    public void displayEmployees(){
	        for (String name:employeeNames ){
	            System.out.println(name);
	        }
	    }
	}

