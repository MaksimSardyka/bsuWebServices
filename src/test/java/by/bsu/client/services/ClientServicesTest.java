package by.bsu.client.services;

import org.junit.BeforeClass;
import org.junit.Test;

public class ClientServicesTest {
    // TODO: Write tests and mock dep.
    static ClientServices clientServices;

    @BeforeClass
    public static void init() {
        clientServices = new ClientServices();
    }

    @Test
    public void isAbleToReturnTakenBook() {
        // TODO: fill DB with dummy data and assert on result
//        Book book = new Book();
//        book.setId(123L);
//        clientServices.returnBook(book);
    }
}
