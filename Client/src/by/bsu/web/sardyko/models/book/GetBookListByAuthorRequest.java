/**
 * GetBookListByAuthorRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.book;

public class GetBookListByAuthorRequest  implements java.io.Serializable {
    private java.lang.String first_name;

    private java.lang.String second_name;

    public GetBookListByAuthorRequest() {
    }

    public GetBookListByAuthorRequest(
           java.lang.String first_name,
           java.lang.String second_name) {
           this.first_name = first_name;
           this.second_name = second_name;
    }


    /**
     * Gets the first_name value for this GetBookListByAuthorRequest.
     * 
     * @return first_name
     */
    public java.lang.String getFirst_name() {
        return first_name;
    }


    /**
     * Sets the first_name value for this GetBookListByAuthorRequest.
     * 
     * @param first_name
     */
    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }


    /**
     * Gets the second_name value for this GetBookListByAuthorRequest.
     * 
     * @return second_name
     */
    public java.lang.String getSecond_name() {
        return second_name;
    }


    /**
     * Sets the second_name value for this GetBookListByAuthorRequest.
     * 
     * @param second_name
     */
    public void setSecond_name(java.lang.String second_name) {
        this.second_name = second_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBookListByAuthorRequest)) return false;
        GetBookListByAuthorRequest other = (GetBookListByAuthorRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.first_name==null && other.getFirst_name()==null) || 
             (this.first_name!=null &&
              this.first_name.equals(other.getFirst_name()))) &&
            ((this.second_name==null && other.getSecond_name()==null) || 
             (this.second_name!=null &&
              this.second_name.equals(other.getSecond_name())));
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
        if (getFirst_name() != null) {
            _hashCode += getFirst_name().hashCode();
        }
        if (getSecond_name() != null) {
            _hashCode += getSecond_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBookListByAuthorRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", ">getBookListByAuthorRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "first_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/book", "second_name"));
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
