package casarimrieger.binominal;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialTest {

	@Test
	public void testZero() {
		
		int actual = Fatorial.calcular(0);
		int resposta = 0;
		
		assertEquals(resposta, actual);
	}

}
