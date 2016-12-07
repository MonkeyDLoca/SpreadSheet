package es.upm.grise.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.grise.ComputationErrorException;
import es.upm.grise.Sheet;

public class SheetTest {
	
	Sheet spreadSheet = new Sheet();

	@Test
	public void test() throws ComputationErrorException {
		spreadSheet.set("A1", "1");
		assertEquals("1",spreadSheet.evaluate("A1"));
	}

}
