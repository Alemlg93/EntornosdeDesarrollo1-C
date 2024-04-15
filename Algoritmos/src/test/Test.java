package test;

import static org.junit.jupiter.api.Assertions.*;

import model.Algoritmos;

class Test {

	void sumatorio() {
		int sumaEsperada=10;
		int sumaObtenida=Algoritmos.sumatorio(4);
		assertEquals(sumaEsperada,sumaObtenida);
		
	void factorial() {
			int multEsperada=4;
			int multObtenida=Algoritmos.factorial(4);
			assertEquals(multEsperada,multEsperada);
	

		
	}

}
