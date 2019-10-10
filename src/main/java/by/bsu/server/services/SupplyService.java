package by.bsu.server.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import by.bsu.server.domain.Book;

@WebService
public interface SupplyService {
    /**
     * Add new book to library collection.
     */
    @WebMethod
    public void addNewBook(Book book);
}
