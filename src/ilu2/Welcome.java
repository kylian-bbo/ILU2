package ilu2;

public class Welcome {
	public static String welcome(String input) {
		StringBuilder output = new StringBuilder();

		output.append("Hello, ");
		output.append(input.substring(0,1).toUpperCase() + input.substring(1));
		
		return output.toString();
	}
}
