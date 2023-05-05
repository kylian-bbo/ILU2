package ilu2;

public class Welcome {
	public static String welcome(String input) {
		if (input.isBlank())
			return "Hello, my friend";
		
		StringBuilder output = new StringBuilder();
		String nom = input;
		
		if (nom.equals(nom.toUpperCase())) {
			output.append("HELLO, ");
			output.append(nom);
			output.append(" !");
			
		}
		else {
			output.append("Hello, ");
			output.append(nom);
		}
		
		return output.toString();
	}
}