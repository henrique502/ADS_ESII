package casarimrieger.binominal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularBinomioControleTest {

	private void testar(int n, int k ,int c) {
		IBinomioEntidade e = new BinomioEntidadeFake(n, k, c);
		
		CalcularBinomioControle controler = new CalcularBinomioControle(e);
		
		int actual = controler.calcular(n, k);
		int resposta = c;
		
		assertEquals(resposta, actual);
	}
	
	@Test
	public void testSeisDois() {
		testar(6, 2, 15);
	}
	
	@Test
	public void testUmDois() {
		testar(1, 2, 1);
	}
	
	@Test
	public void testUmUm() {
		testar(1, 1, 1);
	}
	
	@Test
	public void testDoisDois() {
		testar(2, 2, 1);
	}

}
