package br.com.gastronomia.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gastronomia.bo.AtributoBO;
import br.com.gastronomia.exception.ValidationException;

public class TestAtributoBO {
	
	@Test
	public void testInactiveAtributo() throws ValidationException {
		assertEquals(false, AtributoBO.inactiveAtributo(1));
	}
	
	@Test
	public void testActivateAtributo() throws ValidationException {
		assertEquals(true, AtributoBO.activateAtributo(1));
	}

}
