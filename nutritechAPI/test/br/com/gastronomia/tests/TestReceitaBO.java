package br.com.gastronomia.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gastronomia.bo.ReceitaBO;
import br.com.gastronomia.exception.ValidationException;



public class TestReceitaBO {
	
	@Test
	public void testInactiveReceita() throws ValidationException {
		assertEquals(false, ReceitaBO.inactiveReceita(1));
	}
	
	@Test
	public void testActivateReceita() throws ValidationException {
		assertEquals(true, ReceitaBO.activateReceita(1));
	}
}
