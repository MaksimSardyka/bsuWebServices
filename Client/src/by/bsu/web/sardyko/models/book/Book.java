/**
 * Book.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.book;

public class Book  implements java.io.Serializable {
    private long id;

    private java.lang.String author_firstname;

    private java.lang.String author_lastname;

    private java.util.Date publish_date;

    private java.lang.String publisher;

    public Book() {
    }

    public Book(
           long id,
           java.lang.String author_firstname,
           java.lang.String author_lastname,
           java.util.Date publish_date,
           java.lang.String publisher) {
           this.id = id;
           this.author_firstname = author_firstname;
           this.author_lastname = author_lastname;
           this.publish_date = publish_date;
           this.publisher = publisher;
    }


    /**
     * Gets the id value for this Book.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Book.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the author_firstname value for this Book.
     * 
     * @return author_firstname
     */
    public java.lang.String getAuthor_firstname() {
        return author_firstname;
    }


    /**
     * Sets the author_firstname value for this Book.
     * 
     * @param author_firstname
     */
    public void setAuthor_firstname(java.lang.String author_firstname) {
        this.author_firstname = author_firstname;
    }


    /**
     * Gets the author_lastname value for this Book.
     * 
     * @return author_lastname
     */
    public java.lang.String getAuthor_lastname() {
        return author_lastname;
    }


    /**
     * Sets the author_lastname value for this Book.
     * 
     * @param author_lastname
     */
    public void setAuthor_lastname(java.lang.String author_lastname) {
        this.author_lastname = author_lastname;
    }


    /**
     * Gets the publish_date value for this Book.
     * 
     * @return publish_date
     */
    public java.util.Date getPublish_date() {
        return publish_date;
    }


    /**
     * Sets the publish_date value for this Book.
     * 
     * @param publish_date
     */
    public void setPublish_date(java.util.Date publish_date) {
        this.publish_date = publish_date;
    }


    /**
     * Gets the publisher value for this Book.
     * 
     * @return publisher
     */
    public java.lang.String getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this Book.
     * 
     * @param publisher
     */
    public void setPublisher(java.lang.String publisher) {
        this.publisher = publisher;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Book)) return false;
        Book other = (Book) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.author_firstname==null && other.getAuthor_firstname()==null) || 
             (this.author_firstname!=null &&
              this.author_firstname.equals(other.getAuthor_firstname()))) &&
            ((this.author_lastname==null && other.getAuthor_lastname()==null) || 
             (this.author_lastname!=null &&
              this.author_lastname.equals(other.getAuthor_lastname()))) &&
            ((this.publish_date==null && other.getPublish_date()==null) || 
             (this.publish_date!=null &&
              this.publish_date.equals(other.getPublish_date()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getId()).hashCode();
        if (getAuthor_firstname() != null) {
            _hashCode += getAuthor_firstname().hashCode();
        }
        if (getAuthor_lastname() != null) {
            _hashCode += getAuthor_lastname().hashCode();
        }
        if (getPublish_date() != null) {
            _hashCode += getPublish_date().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Book.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "book"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author_firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "author_firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author_lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "author_lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publish_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "publish_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
