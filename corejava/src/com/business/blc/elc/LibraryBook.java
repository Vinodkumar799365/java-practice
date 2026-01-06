package com.business.blc.elc;

public class LibraryBook {
	int bookid;
	String booktitle;
	String bookauthor;
	double bookprice;
	
	public int getBookId() {
		return bookid;
	}
	public String getBookTitle() {
		return booktitle;
	}
	public String getBookAuthor() {
		return bookauthor;
	}
	public double getBookPrice() {
		return bookprice;
	}
	
	public void setBookId(int id) {
		bookid=id;
	}
	public void setBookTitle(String title) {
		booktitle=title;
	}
	public void setBookAuthor(String author) {
		bookauthor=author;
	}
	public void setBookPrice(double price) {
		bookprice=price;
	}
	
	public String displayData() {
	     return "bookid :"+bookid+"\nbooktitle :"+booktitle+"\nbookauthor :"+bookauthor+"\nbookprice :"+bookprice;
	}

}
