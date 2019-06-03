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

// Convert the string into a char array to enable you to loop through it and
// print out unicode
/*
 * for (char ch : firstWord.toCharArray()) { System.out.println(ch + ": " +
 * (int) (ch)); }
 * 
 * for (char ch : secondWord.toCharArray()) { System.out.println(ch + ": " +
 * (int) (ch)); }
 */

/*
 * String mealSuggestion = null; String prepSuggestion = null;
 * 
 * String eventType1 = "casual;"; String eventType2 = "semi-formal"; String
 * eventType3 = "formal";
 */

/*
 * String eventType1 = new String("chicken"); String eventType2 =
 * ("sandwiches"); String eventType3 = ("semi-formal"); String mealSuggestion1 =
 * ("chicken"); String mealSuggestion2 = ("formal"); String mealSuggestion3 =
 * ("chicken parmesan"); /* String eventType1 = new String("casual"); String
 * eventType2 = new String("sandwiches"); String eventType3 = new
 * String("semi-formal"); String eventType4 = new String("chicken"); String
 * eventType5 = new String("formal"); String eventType6 = new String("chicken
 * parmesan");
 */

/*
 * String eventType1 = new String("semi-formal"); String eventType2 = new
 * String("chicken");
 */

// eventType("casual").equals("sandwiches");

// Objects.equals(eventType = "casual", mealSuggestion("sandwiches"));

/*
 * if (eventType == "casual") { mealSuggestion = "sandwiches"; } else if
 * (eventType == "semi-formal") { mealSuggestion = "chicken"; } else if
 * (eventType == "formal") { mealSuggestion = "chicken parmesan"; }
 * 
 * if (partySize == 1) { prepSuggestion = "in the microwave"; } else if
 * (partySize >= 2 && partySize <= 12) { prepSuggestion = "in your kitchen"; }
 * else if (partySize >= 13) { prepSuggestion = "by a caterer"; }
 */
/*
 * System.out.println(eventType1 + ".equals" + mealSuggestion1 + ":" +
 * eventType1.equals(mealSuggestion1)); // String result;
 * System.out.print("Since you are hosting a " + eventType);
 * System.out.print(" event for " + partySize);
 * System.out.print(" participants, you should serve " + mealSuggestion);
 * 
 * System.out.print(" prepared " + prepSuggestion + ".");
 * 
 * }
 * 
 * private static Object eventType(String string) { // TODO Auto-generated
 * method stub return null; }
 */
