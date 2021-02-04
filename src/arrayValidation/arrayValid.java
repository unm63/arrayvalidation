package arrayValidation;
import java.util.Scanner;

public class arrayValid {
	
	public static void main(String[] args) {
		String[] employeeIDs = {"uxm110630", "fhm586938", "eht372839", "hti123940", "aft492837"}; //array of IDs. Can add or remove some if you want
		String a;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ID: ");
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
