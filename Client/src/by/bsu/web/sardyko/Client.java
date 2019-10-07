package by.bsu.web.sardyko;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import by.bsu.web.sardyko.models.book.Book;
import by.bsu.web.sardyko.models.book.BookPort;
import by.bsu.web.sardyko.models.book.BookPortServiceLocator;
import by.bsu.web.sardyko.models.book.GetBookByIdRequest;

public class Client {
	public Book getBookById(int id) {
		Book book = null;
		BookPortServiceLocator locator = new BookPortServiceLocator();
		try {
			BookPort port = locator.getBookPortSoap11();
			port.getBookById(new GetBookByIdRequest(1));
			book = port.getBookById(new GetBookByIdRequest(1));
			System.out.println(book.getAuthor_firstname());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}
}
