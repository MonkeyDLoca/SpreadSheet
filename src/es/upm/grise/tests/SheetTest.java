package es.upm.grise.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.Sheet;

public class SheetTest {
	
	Sheet spreadSheet = new Sheet();

	@Test
	public void basicTest() throws Exception {
		spreadSheet.set("A1", "6");
		assertEquals("6",spreadSheet.evaluate("A1"));
	}
	
	@Test
	public void testABasicFormula() throws Exception {
		spreadSheet.set("A1", "=1-2");
		assertEquals("-1",spreadSheet.evaluate("A1"));
	}
	
	@Test
	public void testADoubleFormula() throws Exception {
		spreadSheet.set("A2", "=1-2");
		spreadSheet.set("A1", "=2+A2");
		assertEquals("1",spreadSheet.evaluate("A1"));
	}

	@Test
	public void testADoubleFormulaBis() throws Exception {
		spreadSheet.set("A2", "=1-2");
		spreadSheet.set("A1", "=A2+2");
		assertEquals("1",spreadSheet.evaluate("A1"));
	}
}
