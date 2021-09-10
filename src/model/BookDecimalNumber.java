/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package model;

public class BookDecimalNumber {
	
	private String title;
	private String authorLastName;
	private String bookTopic;
	private int deweyDecimalNumber;
	
	public BookDecimalNumber() {
		
	}
	
	public BookDecimalNumber(String title, String authorLastName, String bookTopic) {
		this.title = title;
		this.authorLastName = authorLastName;
		this.bookTopic = bookTopic;
	}

	public BookDecimalNumber(String title, String authorLastName, int deweyDecimalNumber) {
		this.title = title;
		this.authorLastName = authorLastName;
		this.deweyDecimalNumber = deweyDecimalNumber;
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	public String getBookTopic() {
		return bookTopic.toLowerCase();
	}
	public void setBookTopic(String bookTopic) {
		this.bookTopic = bookTopic;
	}
	public double getDeweyDecimalNumber() {
		return deweyDecimalNumber;
	}
	public void setDeweyDecimalNumber(int deweyDecimalNumber) {
		this.deweyDecimalNumber = deweyDecimalNumber;
	}

	@Override
	public String toString() {
		return "BookDecimalNumber [title=" + title + ", authorLastName=" + authorLastName + ", bookTopic=" + bookTopic
				+ ", deweyDecimalNumber=" + deweyDecimalNumber + "]";
	}
	
}
