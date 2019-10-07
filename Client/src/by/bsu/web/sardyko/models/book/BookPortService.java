/**
 * BookPortService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.book;

public interface BookPortService extends javax.xml.rpc.Service {
    public java.lang.String getBookPortSoap11Address();

    public by.bsu.web.sardyko.models.book.BookPort getBookPortSoap11() throws javax.xml.rpc.ServiceException;

    public by.bsu.web.sardyko.models.book.BookPort getBookPortSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
