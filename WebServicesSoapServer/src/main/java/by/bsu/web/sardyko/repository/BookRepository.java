package by.bsu.web.sardyko.repository;

import org.springframework.stereotype.Component;

import by.bsu.web.sardyko.models.book.Book;
import by.bsu.web.sardyko.models.book.BookList;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

@Component
public class BookRepository {

	private static final Map<Long, Book> books = new HashMap<>();

	static {
		Book book1 = new Book();
		book1.setId(1);
		book1.setAuthorFirstname("Maksim");
		book1.setAuthorLastname("Sardyko");
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(new Date());
		DatatypeFactory factory;
		try {
			factory = DatatypeFactory.newInstance();
			book1.setPublishDate(factory.newXMLGregorianCalendar(gc));
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		book1.setPublisher("Penguin");
		books.put(book1.getId(), book1);
	}

	public Book findBook(long id) {
		return books.get(id);
	}

	public BookList findBookList(String firstName, String secondName) {
		BookList bookList = new BookList();
		books.values().stream()
				.filter(b -> b.getAuthorFirstname().equals(firstName) && b.getAuthorLastname().equals(secondName))
				.forEach(b -> bookList.getBook().add(b));
		return bookList;
	}

	public BookList findBookList(String publisher) {
		BookList bookList = new BookList();
		books.values().stream().filter(b -> b.getPublisher().equals(publisher)).forEach(b -> bookList.getBook().add(b));
		return bookList;
	}

	public BookList findBookList(int year) {
		BookList bookList = new BookList();
		books.values().stream().filter(b -> b.getPublishDate().getYear() == year).forEach(b -> bookList.getBook().add(b));
		return bookList;
	}
	
	
}
