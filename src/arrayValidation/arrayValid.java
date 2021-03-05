package arrayValidation;
import java.util.Scanner;
import java.util.regex.Pattern;

public class arrayValid {
	
	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
		if (email == null) 
			return false; 
		return pat.matcher(email).matches(); 
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the emails");
		String emails = scan.nextLine();
		String[] employeeIDs = emails.split("\\s");
		for (int i = 0; i < employeeIDs.length; i++) {
			if (isValid(employeeIDs[i]))
				System.out.println(employeeIDs[i] + " is valid");
			else
				System.out.println(employeeIDs[i] + " is not valid");
		}
		String a;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID you wish to search for: ");
		a = input.next();
		int flag = 0;
		int i = 0;
		while (flag == 0 && i < employeeIDs.length) { //traverses through the array
			if (employeeIDs[i].equals(a)) {
				flag = 1;
			}
			i = i + 1;
		}
		if (flag == 1) {
			System.out.println("ID is in the list!");
		}
		else {
			System.out.println("ID is not in the list");
		}
	}
}
