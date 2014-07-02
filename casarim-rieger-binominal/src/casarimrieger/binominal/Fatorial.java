package casarimrieger.binominal;

public class Fatorial {
	
	public static int calcular(int number){
		if(number < 0)
			throw new IllegalArgumentException();
		
		if(number == 0)
			return 1;
		
		return calcular(number, (number - 1));
	}
	
	private static int calcular(int n, int x){
		n *= x--;
		
		if(x == 1)
			return n;
		
		return calcular(n, x);
	}
}
