package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestDisco {
	
	@Test
	public void testQueCalculaElPerimetroInterior(){
		
		Disco miDisco = new Disco(2.0,4.0);
		Double valorActual = miDisco.calcularPerimetroInterior();
		Double valorEsperado = 12.56;
		
		assertEquals(valorEsperado, valorActual, 0.01);
		
	}

	@Test
	public void testQueCalculaElPerimetroExterior() {
		
		Disco miDisco = new Disco(2.0,4.0);
		Double valorActual = miDisco.calcularPerimetroExterior();
		Double valorEsperado = 25.13;

		assertEquals(valorEsperado, valorActual, 0.01);
	}

	@Test
	public void testQueCalculaLaSuperficie(){
		
		Disco miDisco = new Disco(2.0,4.0);
		Double valorActual = miDisco.calcularSuperficie();
		Double valorEsperado = 39.47 ;
		
		assertEquals(valorEsperado, valorActual, 0.01);
		
	}
	
}