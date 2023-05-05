package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if (input.isBlank())
			return "Hello, my friend";
		
		String[] noms = input.split(",");
	
		return gestionOutput(noms);
	}

	private static String gestionOutput(String[] noms) {
		StringBuilder output = new StringBuilder();
		
		if (noms.length == 2) {
			output.append("Hello, ");
			output.append(formatNom(noms[0]));
			output.append(", ");
			output.append(formatNom(noms[1]));
		}
		
		else {
			if (noms[0].equals(noms[0].toUpperCase())) {
				output.append("HELLO, ");
				output.append(noms[0]);
				output.append(" !");
				
			}
			else {
				output.append("Hello, ");
				output.append(formatNom(noms[0]));
			}
		}

		return output.toString();
	}
		
	
	private static String formatNom(String nom) {
		return nom.substring(0,1).toUpperCase() + nom.substring(1);
	}
}