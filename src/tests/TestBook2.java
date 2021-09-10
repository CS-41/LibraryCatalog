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

public class TestBook2 {

	BookSubjectVerification bookSubjVerif = new BookSubjectVerification();
	BookDecimalNumber book = new BookDecimalNumber();
		
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testBookRange1() {
		book.setBookTopic("Literature");
		int testRange = bookSubjVerif.bookDecimalRange(book);
		assertEquals(testRange, 800);
	}

	@Test
	public void testBookRange2() {
		book.setBookTopic("reliGioN");
		int testRange = bookSubjVerif.bookDecimalRange(book);
		assertEquals(testRange, 200);
	}
	
	@Test
	public void testBookFiction1() {
		book.setDeweyDecimalNumber(-1);		
		assertTrue(bookSubjVerif.isFiction(book));
	}
	
	@Test
	public void testBookFiction2() {
		book.setDeweyDecimalNumber(100);		
		assertFalse(bookSubjVerif.isFiction(book));
	}
	

}
