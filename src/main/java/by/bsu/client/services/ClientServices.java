package by.bsu.client.services;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import by.bsu.client.remote.Book;
import by.bsu.client.remote.ReaderServiceDefault;
import by.bsu.client.remote.ReaderServiceDefaultService;

public class ClientServices {
    public void returnBook(Book book) {
        // TODO: Autowire it
        URL url;
        try {
            url = new URL("http://localhost:8081/readerservice?wsdl");
            ReaderServiceDefaultService readerService = new ReaderServiceDefaultService(url,
                    new QName("http://services.server.bsu.by/", "ReaderServiceDefaultService"));
            ReaderServiceDefault readerServiceProxy = readerService.getReaderServiceDefaultPort();

            readerServiceProxy.returnBook(book);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
