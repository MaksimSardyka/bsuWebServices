package by.bsu.server.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import by.bsu.server.domain.Book;
import lombok.extern.slf4j.Slf4j;

/**
 * Service to work with suppliers for managing library' collection.
 */
@Slf4j
@WebService
public class SupplyServiceDefault implements SupplyService {
    // TODO: Autowire repository here.

    @WebMethod
    @Override
    public void addNewBook(Book book) {
        log.info("Added to the library: {}", book);
    }
}
