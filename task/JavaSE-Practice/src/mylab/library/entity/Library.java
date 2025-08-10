package mylab.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private String name;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("도서가 추가되었습니다. " + book.getTitle());
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> findBookByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book findByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public boolean checkOutBook(String isbn) {
        System.out.println("==== 도서 대출 테스트 =====");
        Book book = findByISBN(isbn);
        if (book != null && book.checkOut()) {
            System.out.println("도서 대출 성공!");
            System.out.println("대출된 도서 정보:");
            System.out.println(book.toString());
            return true;
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        System.out.println("==== 도서 반납 테스트 =====");
        Book book = findByISBN(isbn);
        if (book != null && !book.isAvailable()) {
            book.returnBook();
            System.out.println("도서 반납 성공!");
            System.out.println("반납된 도서 정보:");
            System.out.println(book.toString());
            return true;
        }
        return false;
    }

    public List<Book> getAvailableBooks() {
        List<Book> available = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                available.add(book);
            }
        }
        return available;
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public int getTotalBooks() {
        return books.size();
    }

    public int getAvailableBooksCount() {
        return getAvailableBooks().size();
    }

    public int getBorrowedBooksCount() {
        return getTotalBooks() - getAvailableBooksCount();
    }
}