package br.com.gastronomia.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.gastronomia.bo.GrupoReceitasBO;
import br.com.gastronomia.exception.ValidationException;

public class TestGrupoReceitasBO {
	
	@Test
	public void testdeactivateGroup() throws ValidationException {
		assertEquals(false, GrupoReceitasBO.deactivateGroup(1));
	}
	
	@Test
	public void testactivateGroup() throws ValidationException {
		assertEquals(true, GrupoReceitasBO.activateGroup(1));
	}

}
