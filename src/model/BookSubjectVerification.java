/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package model;

public class BookSubjectVerification {
	
	public String bookSubject (BookDecimalNumber book) {
		
		String subject = "Not a valid number. Try again.";
		
		if (book.getDeweyDecimalNumber() >= 0 && book.getDeweyDecimalNumber() < 100) {
			subject = "General Works";
		}
		if(book.getDeweyDecimalNumber() >= 100 && book.getDeweyDecimalNumber() < 200) {
			subject = "Philosophy";
		}
		if(book.getDeweyDecimalNumber() >= 200 && book.getDeweyDecimalNumber() < 300) {
			subject = "Religion";
		}
		if(book.getDeweyDecimalNumber() >= 300 && book.getDeweyDecimalNumber() < 400) {
			subject = "Social Sciences";
		}
		if(book.getDeweyDecimalNumber() >= 400 && book.getDeweyDecimalNumber() < 500) {
			subject = "Language";
		}
		if(book.getDeweyDecimalNumber() >= 500 && book.getDeweyDecimalNumber() < 600) {
			subject = "Pure Science";
		}
		if(book.getDeweyDecimalNumber() >= 600 && book.getDeweyDecimalNumber() < 700) {
			subject = "Applied Science";
		}
		if(book.getDeweyDecimalNumber() >= 700 && book.getDeweyDecimalNumber() < 800) {
			subject = "The Arts";
		}
		if(book.getDeweyDecimalNumber() >= 800 && book.getDeweyDecimalNumber() < 900) {
			subject = "Literature";
		}
		if(book.getDeweyDecimalNumber() >= 900 && book.getDeweyDecimalNumber() < 1000) {
			subject = "History";
		}

		return subject;
	}
	
	
	public int bookDecimalRange (BookDecimalNumber book) {
		
		int decimalRange = -1;
		
		if (book.getBookTopic().equals("general works")) {
			decimalRange = 99;
		}
		if (book.getBookTopic().equals("philosophy")) {
			decimalRange = 100;
		}
		if (book.getBookTopic().equals("religion")) {
			decimalRange = 200;
		}
		if (book.getBookTopic().equals("social sciences")) {
			decimalRange = 300;
		}
		if (book.getBookTopic().equals("language")) {
			decimalRange = 400;
		}
		if (book.getBookTopic().equals("pure science")) {
			decimalRange = 500;
		}
		if (book.getBookTopic().equals("applied science")) {
			decimalRange = 600;
		}
		if (book.getBookTopic().equals("the arts")) {
			decimalRange = 700;
		}
		if (book.getBookTopic().equals("literature")) {
			decimalRange = 800;
		}
		if (book.getBookTopic().equals("history")) {
			decimalRange = 900;
		}
		
		return decimalRange;
	}
	
	
	public boolean isFiction(BookDecimalNumber book) {
		boolean isFiction = false;
		
		if (book.getDeweyDecimalNumber() == -1) {
			isFiction = true;
		}
		
		return isFiction;
	}
	
}
