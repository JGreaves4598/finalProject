package finalProject;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		ArrayList<String> userlist = new ArrayList<String>();
		userlist.add("John");
		userlist.add("Barry");
		userlist.add("Tom");
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.print("What would you like to do? Add, View, Update or Delete: ");
			String option = input.next();
			
			if(option.equalsIgnoreCase("Add")) {
				System.out.println("Adding new user...");
				System.out.print("Enter new user name here:");
				String name = input.next();
				userlist.add(name);
				System.out.println(name+" has been added.");
				
			}else if(option.equalsIgnoreCase("View")) {
				System.out.println("Viewing list of users...");
				for(int i=0;i<userlist.size();i++) {
					String item = userlist.get(i);
					System.out.println(item+" | id: "+i);
				}	
				
			}else if(option.equalsIgnoreCase("Update")) {
				System.out.print("Enter ID of user you would like to update: ");
				int tempID = input.nextInt();
				if(tempID < userlist.size()) {
					System.out.println("User of ID "+tempID+" is "+userlist.get(tempID));
					System.out.print("Is this the user you would like to update? (Y/N)");
					String res = input.next();
					if(res.equalsIgnoreCase("Y")) {
						System.out.print("Enter the updated name for this user: ");
						String newName = input.next();
						userlist.set(tempID, newName);
						System.out.println("New user set to the following:");
						System.out.println("ID: "+tempID+" | Name: "+newName);
					}else if(res.equalsIgnoreCase("N")) {
						System.out.println("Returning to Menu...");
					}else {
						System.out.println("Invalid result, returning to menu");
					}
				}else {
					System.out.println("Please enter a valid ID");
				}
				System.out.println("TEST - ARRAY SIZE = "+userlist.size());
				
			}else if(option.equalsIgnoreCase("Delete")) {
				System.out.println("Delete");
			}else {
				System.out.println("You must enter a valid option");
			}
		}
	}

}
