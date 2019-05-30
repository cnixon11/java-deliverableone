import java.util.Scanner;

public class eating {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String mealSuggestion = null;
		String prepSuggestion = null;

		System.out.println("Is this a casual, semi-formal, or formal event?");
		String eventType = scanner.next();
		eventType = "casual";

		if (eventType == "casual") {
			mealSuggestion = "sandwiches";
		} else if (eventType == "semi-formal") {
			mealSuggestion = "chicken";
		} else if (eventType == "formal") {
			mealSuggestion = "chicken parmesan";
		}

		System.out.println("How many people are in your party?");
		int partySize = scanner.nextInt();

		if (partySize == 1) {
			prepSuggestion = "in the microwave";
		} else if (partySize >= 2 && partySize <= 12) {
			prepSuggestion = "in your kitchen";
		} else if (partySize >= 13) {
			prepSuggestion = "by a caterer";
		}
		System.out.print("Since you are hosting a " + eventType);
		System.out.print(" event for " + partySize);
		System.out.print(" participants, you should serve " + mealSuggestion);

		System.out.print(" prepared " + prepSuggestion + ".");

		String result;

	}

}
