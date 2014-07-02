package casarimrieger.binominal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({
	BinomioEntidadeTest.class,
	CalcularBinomioControleTest.class,
	FatorialTest.class
})

public class AllTests {}