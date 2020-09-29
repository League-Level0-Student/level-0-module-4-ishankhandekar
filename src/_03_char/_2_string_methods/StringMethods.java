package _03_char._2_string_methods;

public class StringMethods {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it to contain a minimum of 3
		// characters
		String st = "ewa";
		// 2. Print the 3rd char of your String to the console.
		System.out.println(st.charAt(2));

		// HINT: .charAt

		// 3. Print the length of your String to the console.
		// HINT: .length()
		System.out.println(st.length());

		// 4. Using a for loop, print one char at time to the console.
		for (int i = 0; i < st.length(); i++) {
			st.charAt(i);
		}
		// HINT: use .length() to determine how many loops

		System.out.println("your letter is E");
		for (int i = 0; i < st.length(); i++) {
			char index = st.charAt(i);
			if (index == 'e') {
				System.out.println("e is at index " + i);
				break;
			}
		}
		// 5. Pick a char inside your String, and use a loop to determine
		// what position/index in the String the char is located.
		// Print the char's position to the console.
		// EXAMPLE: if your string is "abc" and you are searching
		// for char 'b', then print "b is at index 1"

	}
}
