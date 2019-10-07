/**
 * BookPortServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.book;

public class BookPortServiceLocator extends org.apache.axis.client.Service implements by.bsu.web.sardyko.models.book.BookPortService {

    public BookPortServiceLocator() {
    }


    public BookPortServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookPortServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookPortSoap11
    private java.lang.String BookPortSoap11_address = "http://localhost:8080/ws";

    public java.lang.String getBookPortSoap11Address() {
        return BookPortSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookPortSoap11WSDDServiceName = "BookPortSoap11";

    public java.lang.String getBookPortSoap11WSDDServiceName() {
        return BookPortSoap11WSDDServiceName;
    }

    public void setBookPortSoap11WSDDServiceName(java.lang.String name) {
        BookPortSoap11WSDDServiceName = name;
    }

    public by.bsu.web.sardyko.models.book.BookPort getBookPortSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookPortSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookPortSoap11(endpoint);
    }

    public by.bsu.web.sardyko.models.book.BookPort getBookPortSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            by.bsu.web.sardyko.models.book.BookPortSoap11Stub _stub = new by.bsu.web.sardyko.models.book.BookPortSoap11Stub(portAddress, this);
            _stub.setPortName(getBookPortSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookPortSoap11EndpointAddress(java.lang.String address) {
        BookPortSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (by.bsu.web.sardyko.models.book.BookPort.class.isAssignableFrom(serviceEndpointInterface)) {
                by.bsu.web.sardyko.models.book.BookPortSoap11Stub _stub = new by.bsu.web.sardyko.models.book.BookPortSoap11Stub(new java.net.URL(BookPortSoap11_address), this);
                _stub.setPortName(getBookPortSoap11WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BookPortSoap11".equals(inputPortName)) {
            return getBookPortSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "BookPortService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "BookPortSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookPortSoap11".equals(portName)) {
            setBookPortSoap11EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
