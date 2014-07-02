package casarimrieger.binominal;

public class BinomioEntidade implements IBinomioEntidade {
	
	private int n, k;
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setK(int k) {
		this.k = k;
	}

	public int getCoeficiente() {
		int p1 = Fatorial.calcular(n);
		int p2 = Fatorial.calcular(k);
		int p3 = Fatorial.calcular(n - k);
		return p1 / (p2 * p3);
	}
}
