/**
 * File Name: AppBasics.java<br>
 * Hesemann, Anne<br>
 * Created: Aug 19, 2017
 */
package com.sqa.ah;

import java.util.*;

import com.sqa.ah.helpers.exceptions.*;

/**
 * This application contains basic helper methods for working with numbers
 *
 * @author Hesemann, Anne
 * @version 1.0.0
 * @since 1.0
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	static String usernameIn;

	/**
	 * Says goodbye to the user.
	 *
	 * @param userName
	 *            The user's name.
	 */
	public static void farewelUser(String userName) {
		System.out.println("Thank you for using our application " + usernameIn + "!");
		System.out.println("Have a nice day!");
	}

	/**
	 * Greets the user and takes in the user's name.
	 *
	 * @param appName
	 *            The name of the app.
	 * @return usernameln The name of the user.
	 */
	public static String greetUserAndGetName(String appName) {
		System.out.println("Welcome to the " + appName + "!");
		System.out.print("Can I get your name? ");
		usernameIn = scanner.nextLine();
		return usernameIn;
	}

	/**
	 * Inputs an integer from the user. Prints a statement that compares the
	 * number inputed with 10.
	 *
	 * @param question
	 * @return num
	 */
	public static int intCompareTo10(String question) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				isValid = true;
				if (num >= 10) {
					System.out.println("number is greater than 10");
				} else {
					System.out.println("number is smaller than 10");
				}
			} catch (NumberFormatException e) {
				System.out.println("You did not provide a valid number [" + input + "].  please provide only digits");
			}
		}
		return num;
	}

	/**
	 * Asks the user a question
	 *
	 * @param question
	 * @return true if the user answers 'yes'; false if the user answers 'no'
	 */
	// Asks the user a question and returns true if the answer is yes.
	public static boolean requestBoolean(String question) {
		String input;
		boolean isValid = false;
		boolean response = true;
		while (!isValid) {
			System.out.print(question + " (Yes/No)");
			input = scanner.nextLine();
			if (input.trim().equalsIgnoreCase("yes")) {
				isValid = true;
				response = true;
			} else if (input.trim().equalsIgnoreCase("no")) {
				isValid = true;
				response = false;
			} else {
				System.out.println("You did not respond to the question in the correct form: (Yes/No)");
			}
		}
		return response;
	}

	/**
	 * Asks the user a question and returns a character.
	 *
	 * @param question
	 * @return character
	 */
	public static char requestChar(String question) {
		System.out.print(question + " ");
		return scanner.nextLine().charAt(0);
	}

	/**
	 * Asks the user a question and returns a double.
	 *
	 * @param question
	 * @return num
	 */
	public static double requestDouble(String question) {
		double num = 0.0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Double.parseDouble(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not provide a valid number [" + input + "].  please provide only digits");
			}
		}
		return num;
	}

	/**
	 * Asks the user a question and returns a float.
	 *
	 * @param question
	 * @return num
	 */
	public static float requestFloat(String question) {
		float num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Float.parseFloat(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not provide a valid number [" + input + "].  please provide only digits");
			}
		}
		return num;
	}

	/**
	 * Asks the user a question and returns an integer.
	 *
	 * @param question
	 * @return num
	 */
	public static int requestInt(String question) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not provide a valid number [" + input + "].  please provide only digits");
			}
		}
		return num;
	}

	/**
	 * @param question
	 * @param min
	 * @param max
	 * @return num
	 */
	public static int requestInt(String question, int min, int max) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				if (num > max) {
					throw new RequestIntOverMaxException();
				} else if (num < min) {
					throw new RequestIntUnderMinException();
				}
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not provide a valid number [" + input + "].  please provide only digits");
			} catch (RequestIntOverMaxException e) {
				System.out.println("You have exceeded the max value of " + max + " [" + input
						+ "]. Please provide a number within range.");
				e.printStackTrace();
			} catch (RequestIntUnderMinException e) {
				System.out.println("You have not reached the min value of " + min + " [" + input
						+ "]. Please provide a number within range.");
				e.printStackTrace();
			}
		}
		return num;
	}

	/**
	 * Asks the user a question and returns a long.
	 *
	 * @param question
	 * @return long
	 */
	public static long requestLong(String question) {
		long num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Long.parseLong(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not provide a valid number [" + input + "].  please provide only digits");
			}
		}
		return num;
	}

	/**
	 * Asks the user a question and returns a short.
	 *
	 * @param question
	 * @return num
	 */
	public static short requestShort(String question) {
		short num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Short.parseShort(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not provide a valid number [" + input + "].  please provide only digits");
			}
		}
		return num;
	}

	/**
	 * Asks the user a question and returns a string.
	 *
	 * @param question
	 * @return string
	 */
	public static String requestString(String question) {
		System.out.print(question + " ");
		return scanner.nextLine();
	}
}
