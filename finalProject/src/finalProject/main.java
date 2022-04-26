package finalProject;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
	

	

	public static void main(String[] args) {
		ArrayList<String> userlist = new ArrayList<String>();
		userlist.add("John");
		userlist.add("Barry");
		userlist.add("Tom");
		
		Scanner input = new Scanner(System.in);
		System.out.print("What would you like to do? Add, View, Update or Delete: ");
		String option = input.next();
		
		if(option.equalsIgnoreCase("Add")) {
			System.out.println("Adding new user...");
			System.out.println("Enter new user name here:");
			String name = input.next();
			userlist.add(name);
			System.out.println(name+" has been added.");
			
		}else if(option.equalsIgnoreCase("View")) {
			System.out.println("View");
		}else if(option.equalsIgnoreCase("Update")) {
			System.out.println("Update");
		}else if(option.equalsIgnoreCase("Delete")) {
			System.out.println("Delete");
		}else {
			System.out.println("You must enter a valid option");
		}
		main(null);
		
	}

}
