package br.com.gastronomia.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gastronomia.bo.IngredienteBO;
import br.com.gastronomia.exception.ValidationException;



public class TestIngredienteBO {
	
	@Test
	public void testInactiveIngrediente() throws ValidationException {
		assertEquals(false, IngredienteBO.inactiveIngrediente(1));
	}
	
	@Test
	public void testActivateIngrediente() throws ValidationException {
		assertEquals(true, IngredienteBO.activateIngrediente(1));
	}

}
