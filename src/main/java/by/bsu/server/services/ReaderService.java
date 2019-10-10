package by.bsu.server.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import by.bsu.server.domain.Book;
import by.bsu.server.domain.Reader;

@WebService
public interface ReaderService {
    /**
     * Register new user.
     */
    @WebMethod
    public void registerNewReader(Reader reader);

    /**
     * Take book.
     */
    @WebMethod
    public Book takeBook(Reader reader, Book book);

    /**
     * Return taken book.
     */
    @WebMethod
    public void returnBook(Book book);

    /**
     * Report book to be lost.
     * (We need only the book - we can grab info about reader from DB)
     */
    @WebMethod
    public void reportLostBook(Book book);
}
