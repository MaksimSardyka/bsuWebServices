/**
 * GetOpenHoursForSpecificDayResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.hour;

public class GetOpenHoursForSpecificDayResponse  implements java.io.Serializable {
    private by.bsu.web.sardyko.models.hour.Hour hour;

    public GetOpenHoursForSpecificDayResponse() {
    }

    public GetOpenHoursForSpecificDayResponse(
           by.bsu.web.sardyko.models.hour.Hour hour) {
           this.hour = hour;
    }


    /**
     * Gets the hour value for this GetOpenHoursForSpecificDayResponse.
     * 
     * @return hour
     */
    public by.bsu.web.sardyko.models.hour.Hour getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this GetOpenHoursForSpecificDayResponse.
     * 
     * @param hour
     */
    public void setHour(by.bsu.web.sardyko.models.hour.Hour hour) {
        this.hour = hour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOpenHoursForSpecificDayResponse)) return false;
        GetOpenHoursForSpecificDayResponse other = (GetOpenHoursForSpecificDayResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour())));
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
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOpenHoursForSpecificDayResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", ">getOpenHoursForSpecificDayResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", "hour"));
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
