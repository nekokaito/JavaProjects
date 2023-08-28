package class_java_assignment;
import java.util.Scanner;
public class Employee {
      String employeeName, designation;
      int joinYear;
	public Employee(String employeeName, String designation, int joinYear) {
		super();
		this.employeeName = employeeName;
		this.designation = designation;
		this.joinYear = joinYear;
	}
      
	int calculateJobLife () {
	    int JobLife = 2023 - joinYear;
		return JobLife;
	}
	int calculateIncrement (int JobLife) {
		return JobLife * 2;
	}
	
	public static void main(String[] args) {
		 Scanner in = new Scanner (System.in);
		 String userName = in.nextLine();
		 String userdesignation = in.nextLine();
		 int userYear = in.nextInt();
		 
		 in.close();
		 Employee data = new Employee(userName, userdesignation ,userYear);
         
		 System.out.println("Name: " +data.employeeName);
		 System.out.println("Designation: " +data.designation);
		 System.out.println("Join Year: " +data.joinYear);
		 int joblifeReturn = data.calculateJobLife();		 
		 System.out.println("Job Life: " +joblifeReturn);
		 System.out.println("Increment: " +data.calculateIncrement(joblifeReturn));
	}
	
}
