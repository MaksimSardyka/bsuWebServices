
package by.bsu.client.remote;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.bsu.client.remote package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegisterNewReader_QNAME = new QName("http://services.server.bsu.by/", "registerNewReader");
    private final static QName _RegisterNewReaderResponse_QNAME = new QName("http://services.server.bsu.by/", "registerNewReaderResponse");
    private final static QName _TakeBook_QNAME = new QName("http://services.server.bsu.by/", "takeBook");
    private final static QName _ReportLostBook_QNAME = new QName("http://services.server.bsu.by/", "reportLostBook");
    private final static QName _TakeBookResponse_QNAME = new QName("http://services.server.bsu.by/", "takeBookResponse");
    private final static QName _ReportLostBookResponse_QNAME = new QName("http://services.server.bsu.by/", "reportLostBookResponse");
    private final static QName _ReturnBookResponse_QNAME = new QName("http://services.server.bsu.by/", "returnBookResponse");
    private final static QName _ReturnBook_QNAME = new QName("http://services.server.bsu.by/", "returnBook");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.bsu.client.remote
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TakeBook }
     * 
     */
    public TakeBook createTakeBook() {
        return new TakeBook();
    }

    /**
     * Create an instance of {@link TakeBookResponse }
     * 
     */
    public TakeBookResponse createTakeBookResponse() {
        return new TakeBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link ReturnBookResponse }
     * 
     */
    public ReturnBookResponse createReturnBookResponse() {
        return new ReturnBookResponse();
    }

    /**
     * Create an instance of {@link RegisterNewReaderResponse }
     * 
     */
    public RegisterNewReaderResponse createRegisterNewReaderResponse() {
        return new RegisterNewReaderResponse();
    }

    /**
     * Create an instance of {@link ReportLostBook }
     * 
     */
    public ReportLostBook createReportLostBook() {
        return new ReportLostBook();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link ReportLostBookResponse }
     * 
     */
    public ReportLostBookResponse createReportLostBookResponse() {
        return new ReportLostBookResponse();
    }

    /**
     * Create an instance of {@link RegisterNewReader }
     * 
     */
    public RegisterNewReader createRegisterNewReader() {
        return new RegisterNewReader();
    }

    /**
     * Create an instance of {@link ReturnBook }
     * 
     */
    public ReturnBook createReturnBook() {
        return new ReturnBook();
    }

    /**
     * Create an instance of {@link Reader }
     * 
     */
    public Reader createReader() {
        return new Reader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterNewReader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "registerNewReader")
    public JAXBElement<RegisterNewReader> createRegisterNewReader(RegisterNewReader value) {
        return new JAXBElement<RegisterNewReader>(_RegisterNewReader_QNAME, RegisterNewReader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterNewReaderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "registerNewReaderResponse")
    public JAXBElement<RegisterNewReaderResponse> createRegisterNewReaderResponse(RegisterNewReaderResponse value) {
        return new JAXBElement<RegisterNewReaderResponse>(_RegisterNewReaderResponse_QNAME, RegisterNewReaderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "takeBook")
    public JAXBElement<TakeBook> createTakeBook(TakeBook value) {
        return new JAXBElement<TakeBook>(_TakeBook_QNAME, TakeBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportLostBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "reportLostBook")
    public JAXBElement<ReportLostBook> createReportLostBook(ReportLostBook value) {
        return new JAXBElement<ReportLostBook>(_ReportLostBook_QNAME, ReportLostBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TakeBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "takeBookResponse")
    public JAXBElement<TakeBookResponse> createTakeBookResponse(TakeBookResponse value) {
        return new JAXBElement<TakeBookResponse>(_TakeBookResponse_QNAME, TakeBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportLostBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "reportLostBookResponse")
    public JAXBElement<ReportLostBookResponse> createReportLostBookResponse(ReportLostBookResponse value) {
        return new JAXBElement<ReportLostBookResponse>(_ReportLostBookResponse_QNAME, ReportLostBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "returnBookResponse")
    public JAXBElement<ReturnBookResponse> createReturnBookResponse(ReturnBookResponse value) {
        return new JAXBElement<ReturnBookResponse>(_ReturnBookResponse_QNAME, ReturnBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.server.bsu.by/", name = "returnBook")
    public JAXBElement<ReturnBook> createReturnBook(ReturnBook value) {
        return new JAXBElement<ReturnBook>(_ReturnBook_QNAME, ReturnBook.class, null, value);
    }

}
