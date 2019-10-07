/**
 * BookPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.book;

public interface BookPort extends java.rmi.Remote {
    public void isOpenAtTheMoment(java.lang.Object isOpenAtTheMomentRequest) throws java.rmi.RemoteException;
    public by.bsu.web.sardyko.models.hour.GetOpenHoursResponse getOpenHours(java.lang.Object getOpenHoursRequest) throws java.rmi.RemoteException;
    // getBook is a notification style operation and is unsupported.;
    public by.bsu.web.sardyko.models.hour.GetMinutesUntilCloseResponse getMinutesUntilClose(java.lang.Object getMinutesUntilCloseRequest) throws java.rmi.RemoteException;
    // getBookList is a notification style operation and is unsupported.;
    public void getBookListByAuthor(by.bsu.web.sardyko.models.book.GetBookListByAuthorRequest getBookListByAuthorRequest) throws java.rmi.RemoteException;
    public void getOpenHourForSpecificDay(by.bsu.web.sardyko.models.hour.GetOpenHourForSpecificDayRequest getOpenHourForSpecificDayRequest) throws java.rmi.RemoteException;
    public void getBookListByPublisher(by.bsu.web.sardyko.models.book.GetBookListByPublisherRequest getBookListByPublisherRequest) throws java.rmi.RemoteException;
    public void getBookListByYear(by.bsu.web.sardyko.models.book.GetBookListByYearRequest getBookListByYearRequest) throws java.rmi.RemoteException;
    // getOpenHoursForSpecificDay is a notification style operation and is unsupported.;
    public Book getBookById(by.bsu.web.sardyko.models.book.GetBookByIdRequest getBookByIdRequest) throws java.rmi.RemoteException;
    // isOpen is a notification style operation and is unsupported.;
}
