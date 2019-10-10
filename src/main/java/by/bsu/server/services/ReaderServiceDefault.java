package by.bsu.server.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import by.bsu.server.domain.Book;
import by.bsu.server.domain.Reader;
import by.bsu.server.persistance.BookRepository;
import by.bsu.server.persistance.ReaderRepository;
import lombok.extern.slf4j.Slf4j;

/**
 * Services provided by library for its readers.
 */
@Slf4j
@WebService
public class ReaderServiceDefault implements ReaderService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    ReaderRepository readerRepository;

    @WebMethod
    @Override
    public void registerNewReader(final Reader reader) {
        log.info("Register new user: {}", reader);
        readerRepository.save(reader);
    }

    @WebMethod
    @Override
    public Book takeBook(final Reader reader, final Book book) {
        log.info("Reader {} took the book: {}", reader, book);
        Book b = bookRepository.getOne(book.getId());
        Reader r = readerRepository.getOne(reader.getId());
        List<Book> takenBooks = r.getTakenBooks();
        takenBooks.add(b);
        r.setTakenBooks(takenBooks);
        return b;
    }

    @WebMethod
    @Override
    public void reportLostBook(final Book book) {
        log.info("Lost book: {}", book);
        bookRepository.delete(book);
    }

    @WebMethod
    @Override
    public void returnBook(final Book book) {
        log.info("Returned book: {}", book);
        bookRepository.save(book);
    }
}
