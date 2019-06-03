import java.util.Scanner;

public class eating {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Is this a casual, semi-formal, or formal event?");// Prompt user
		String eventType = scanner.nextLine();// read user input

		System.out.println("How many people are in your party?");// Prompt user
		int partySize = scanner.nextInt();// read user input

		String result;

		System.out.print("Since you are hosting a " + eventType);
		System.out.print(" event for " + partySize);
		System.out.print(" participant(s), you should serve ");

		if (eventType.equals("casual")) {
			System.out.print("sandwiches");
		} else if (eventType.equals("semi-formal")) {
			System.out.print("fried chicken");
		} else if (eventType.equals("formal")) {
			System.out.print("chicken parmesan");
		}

		System.out.print(" prepared");

		if (partySize == 1) {
			System.out.print(" in the microwave");
		} else if (partySize >= 2 && partySize <= 12) {
			System.out.print(" in your kitchen");
		} else if (partySize >= 13) {
			System.out.print(" by a caterer");

		}

		System.out.print(".");

	}
}
