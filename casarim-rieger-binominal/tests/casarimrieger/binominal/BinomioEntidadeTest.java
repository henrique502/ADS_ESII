package casarimrieger.binominal;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinomioEntidadeTest {

	@Test
	public void test() {
		IBinomioEntidade e = new BinomioEntidadeFake(6, 2, 15);
		
		e.setN(6);
		e.setK(2);
		int actual = e.getCoeficiente();
		int resposta = 15;
		
		assertEquals(resposta, actual);
	}
	
	@Test
	public void test2() {
		IBinomioEntidade e = new BinomioEntidade();
		
		e.setN(6);
		e.setK(2);
		int actual = e.getCoeficiente();
		int resposta = 15;
		
		assertEquals(resposta, actual);
	}
}
