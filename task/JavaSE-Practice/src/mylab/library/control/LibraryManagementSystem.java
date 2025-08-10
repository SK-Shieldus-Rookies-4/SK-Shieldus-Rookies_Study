package mylab.library.control;

import mylab.library.entity.Book;
import mylab.library.entity.Library;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Library lib = new Library("중앙도서관");
		
		lib.addBook(new Book("자바 프로그래밍", "김자바", "978-89-01-12345-6", 2022));
		lib.addBook(new Book("객체지향의 사실과 오해", "조영호", "978-89-01-67890-1", 2015));
		lib.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
		lib.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
		lib.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
		lib.addBook(new Book("자바의 정석", "남궁성", "978-89-01-14077-4", 2019));
		

	}

}
