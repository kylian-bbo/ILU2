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
		
		for (int i=0; i<noms.length; i++) {
			if (i>0)
				output.append(", ");
			output.append(formatNom(noms[i]));
		}

		if (noms[0].equals(noms[0].toUpperCase())) {
			output.insert(0,"HELLO, ");
			output.append(" !");
		}
		else
			output.insert(0,"Hello, ");
		
		return output.toString();
	}
		
	private static String formatNom(String nomTemp) {
		String nom = nomTemp.trim();
		if (nom.equals(nom.toUpperCase()))
			return nom;
		return nom.substring(0,1).toUpperCase() + nom.substring(1);
	}
}