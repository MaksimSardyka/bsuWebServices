/**
 * Hour.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.hour;

public class Hour  implements java.io.Serializable {
    private org.apache.axis.types.Time opens;

    private org.apache.axis.types.Time closes;

    public Hour() {
    }

    public Hour(
           org.apache.axis.types.Time opens,
           org.apache.axis.types.Time closes) {
           this.opens = opens;
           this.closes = closes;
    }


    /**
     * Gets the opens value for this Hour.
     * 
     * @return opens
     */
    public org.apache.axis.types.Time getOpens() {
        return opens;
    }


    /**
     * Sets the opens value for this Hour.
     * 
     * @param opens
     */
    public void setOpens(org.apache.axis.types.Time opens) {
        this.opens = opens;
    }


    /**
     * Gets the closes value for this Hour.
     * 
     * @return closes
     */
    public org.apache.axis.types.Time getCloses() {
        return closes;
    }


    /**
     * Sets the closes value for this Hour.
     * 
     * @param closes
     */
    public void setCloses(org.apache.axis.types.Time closes) {
        this.closes = closes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hour)) return false;
        Hour other = (Hour) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.opens==null && other.getOpens()==null) || 
             (this.opens!=null &&
              this.opens.equals(other.getOpens()))) &&
            ((this.closes==null && other.getCloses()==null) || 
             (this.closes!=null &&
              this.closes.equals(other.getCloses())));
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
        if (getOpens() != null) {
            _hashCode += getOpens().hashCode();
        }
        if (getCloses() != null) {
            _hashCode += getCloses().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Hour.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", "hour"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", "opens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", "closes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
