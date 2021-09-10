/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.BookDecimalNumber;
import model.BookSubjectVerification;

public class TestBook1 {
	
	BookSubjectVerification bookSubjVerif = new BookSubjectVerification();
	BookDecimalNumber book = new BookDecimalNumber();
	
	
	/**
	 * @throws java.lang.Exception
	 */	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBookSubject1() {
		book.setDeweyDecimalNumber(55);
		String testSubject = bookSubjVerif.bookSubject(book);
		assertEquals(testSubject, "General Works");
	}
	
	@Test
	public void testBookSubject2() {
		book.setDeweyDecimalNumber(499);
		String testSubject = bookSubjVerif.bookSubject(book);
		assertEquals(testSubject, "Language");
	}
	
	@Test
	public void testBookSubject3() {
		book.setDeweyDecimalNumber(1000);
		String testSubject = bookSubjVerif.bookSubject(book);
		assertEquals(testSubject, "Not a valid number. Try again.");
	}
	
	@Test
	public void testBookSubject4() {
		book.setDeweyDecimalNumber(1000);
		String testSubject = bookSubjVerif.bookSubject(book);
		assertEquals(testSubject, "Not a valid number. Try again.");
	}
	
	
}
