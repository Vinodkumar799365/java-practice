package com.business.blc.elc;

public class LibraryBookManagement {

	public static void main(String[] args) {
		LibraryBook lb1=new LibraryBook();
		lb1.setBookId(12);
		lb1.setBookTitle("mahabharatham");
		lb1.setBookAuthor("vedha vyasa");
		lb1.setBookPrice(1150);
		System.out.println(lb1.displayData());
		System.out.println("--------------------");
		
		LibraryBook lb2=new LibraryBook();
		lb2.setBookId(15);
		lb2.setBookTitle("ramayanam");
		lb2.setBookAuthor("valmiki");
		lb2.setBookPrice(1500);
		System.out.println(lb2.displayData());
		

	}

}
