package fizzbuzz;

public class FizzBuzz {
	
	private static final int[] numSpeciaux =  {3, 5};
	private static final String[] traduction = {"fizz", "buzz"};
	
	public String fizzBuzz(int numero) {
		for (int i=0; i<numSpeciaux.length; i++) {
			if (numero == numSpeciaux[i]) {
				return traduction[i];
			}
		}
		return Integer.toString(numero);
	}
}