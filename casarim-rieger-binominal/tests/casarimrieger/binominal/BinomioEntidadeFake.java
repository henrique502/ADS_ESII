package casarimrieger.binominal;

public class BinomioEntidadeFake implements IBinomioEntidade {
	
	private int n, k, coeficiente;
	
	public BinomioEntidadeFake(int n, int k, int coeficiente) {
		this.n = n;
		this.k = k;
		this.coeficiente = coeficiente;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getCoeficiente() {
		return 15;
	}
}
