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
		
		gestionOutputMin(noms, output);
		gestionOutputMaj(noms, output);
		
		return output.toString();
	}
	
	private static void gestionOutputMin(String[] noms, StringBuilder output) {
		for (int i=0; i<noms.length; i++) {
			if (!(noms[i].equals(noms[i].toUpperCase()))) {
				if (i>0)
					output.append(", ");
				if (i==0)
					output.append("Hello, ");
				
				output.append(formatNom(noms[i]));
			}
		}
	}
	
	private static void gestionOutputMaj(String[] noms, StringBuilder output) {
		boolean nomMajPresent = false;
		int numNomMaj = 0;
		
		for (int i=0; i<noms.length; i++) {
			if (noms[i].equals(noms[i].toUpperCase())) {
				numNomMaj++;
				if (numNomMaj==1) {
					if (!output.isEmpty())
						output.append(". AND ");
					output.append("HELLO, ");
				}
				if (numNomMaj>1)
					output.append(", ");
			
				output.append(formatNom(noms[i]));
				
				if (!nomMajPresent)
					nomMajPresent = true;
			}
		}
		if (nomMajPresent)
			output.append(" !");
	}
		
	private static String formatNom(String nomTemp) {
		String nom = nomTemp.trim();
		if (nom.equals(nom.toUpperCase()))
			return nom;
		return nom.substring(0,1).toUpperCase() + nom.substring(1);
	}
}