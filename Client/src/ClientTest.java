import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import by.bsu.web.sardyko.Client;
import by.bsu.web.sardyko.models.book.Book;

public class ClientTest {
	@Test
	public void isReturnCorrectBook() {
		Book book = new Client().getBookById(1);
		Assertions.assertEquals(book.getAuthor_firstname(), "Maksim");
		Assertions.assertEquals(book.getAuthor_lastname(), "Sardyko");
	}
}
