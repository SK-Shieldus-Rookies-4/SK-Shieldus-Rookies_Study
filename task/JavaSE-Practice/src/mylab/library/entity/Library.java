package mylab.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	private String name;
	
	public Library(String name) {
		this.name = name;
        this.books = new ArrayList<>(); // 빈 도서 목록 생성
	}

	public String getName() {
		return name;
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("도서가 추가되었습니다. " + book.getTitle());
	}
	
	public Book findBookByTitle(String title) {
		
	}
	
	public List<Book> findBookByAuthor(String author) {
		
	}
	
	public Book findByISBN(String isbn) {
		
	}
	
	public boolean checkOutBook(String isbn) {
		System.out.println("==== 도서 대출 테스트 =====");
		
	}

	public boolean returnBook(String isbn) {
		System.out.println("==== 도서 반납 테스트 =====");
		
	}
	
	public List<Book> getAvailableBooks() {
		
	}
	
	public List<Book> getAllBooks() {
		return books;
	}
	
	public  int getTotalBooks() {
		
	}
	
	public  int getAvailableBooksCount() {
		
	}
	
	public  int getBorrowedBooksCount() {
		
	}
	
	


}
