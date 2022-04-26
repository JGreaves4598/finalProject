package finalProject;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What would you like to do? Add, View, Update or Delete: ");
		String option = input.next();
		
		if(option.equalsIgnoreCase("Add")) {
			System.out.println("Add");
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
