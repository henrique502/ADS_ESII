package casarimrieger.binominal;

public interface IBinomioEntidade {
	
	/**
	 * Alterar valor de n;
	 * @param n valor do primeiro coeficiente (populacao)
	 */
	public void setN(int n);
	
	/**
	 * Alterar valor de k;
	 * @param k valor do segundo coeficiente (amostra)
	 */
	public void setK(int k);
	
	/**
	 * @return valor do terceiro coeficiente (combinacao de k, em amostras de tamanho de n)
	 */
	public int getCoeficiente();
}
