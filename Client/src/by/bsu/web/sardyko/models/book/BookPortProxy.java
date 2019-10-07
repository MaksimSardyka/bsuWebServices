package by.bsu.web.sardyko.models.book;

public class BookPortProxy implements by.bsu.web.sardyko.models.book.BookPort {
  private String _endpoint = null;
  private by.bsu.web.sardyko.models.book.BookPort bookPort = null;
  
  public BookPortProxy() {
    _initBookPortProxy();
  }
  
  public BookPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookPortProxy();
  }
  
  private void _initBookPortProxy() {
    try {
      bookPort = (new by.bsu.web.sardyko.models.book.BookPortServiceLocator()).getBookPortSoap11();
      if (bookPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookPort != null)
      ((javax.xml.rpc.Stub)bookPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public by.bsu.web.sardyko.models.book.BookPort getBookPort() {
    if (bookPort == null)
      _initBookPortProxy();
    return bookPort;
  }
  
  public void isOpenAtTheMoment(java.lang.Object isOpenAtTheMomentRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    bookPort.isOpenAtTheMoment(isOpenAtTheMomentRequest);
  }
  
  public by.bsu.web.sardyko.models.hour.GetOpenHoursResponse getOpenHours(java.lang.Object getOpenHoursRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    return bookPort.getOpenHours(getOpenHoursRequest);
  }
  
  public by.bsu.web.sardyko.models.hour.GetMinutesUntilCloseResponse getMinutesUntilClose(java.lang.Object getMinutesUntilCloseRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    return bookPort.getMinutesUntilClose(getMinutesUntilCloseRequest);
  }
  
  public void getBookListByAuthor(by.bsu.web.sardyko.models.book.GetBookListByAuthorRequest getBookListByAuthorRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    bookPort.getBookListByAuthor(getBookListByAuthorRequest);
  }
  
  public void getOpenHourForSpecificDay(by.bsu.web.sardyko.models.hour.GetOpenHourForSpecificDayRequest getOpenHourForSpecificDayRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    bookPort.getOpenHourForSpecificDay(getOpenHourForSpecificDayRequest);
  }
  
  public void getBookListByPublisher(by.bsu.web.sardyko.models.book.GetBookListByPublisherRequest getBookListByPublisherRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    bookPort.getBookListByPublisher(getBookListByPublisherRequest);
  }
  
  public void getBookListByYear(by.bsu.web.sardyko.models.book.GetBookListByYearRequest getBookListByYearRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    bookPort.getBookListByYear(getBookListByYearRequest);
  }
  
  public void getBookById(by.bsu.web.sardyko.models.book.GetBookByIdRequest getBookByIdRequest) throws java.rmi.RemoteException{
    if (bookPort == null)
      _initBookPortProxy();
    bookPort.getBookById(getBookByIdRequest);
  }
  
  
}