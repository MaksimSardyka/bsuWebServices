/**
 * GetOpenHoursResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package by.bsu.web.sardyko.models.hour;

public class GetOpenHoursResponse  implements java.io.Serializable {
    private by.bsu.web.sardyko.models.hour.HourList hourList;

    public GetOpenHoursResponse() {
    }

    public GetOpenHoursResponse(
           by.bsu.web.sardyko.models.hour.HourList hourList) {
           this.hourList = hourList;
    }


    /**
     * Gets the hourList value for this GetOpenHoursResponse.
     * 
     * @return hourList
     */
    public by.bsu.web.sardyko.models.hour.HourList getHourList() {
        return hourList;
    }


    /**
     * Sets the hourList value for this GetOpenHoursResponse.
     * 
     * @param hourList
     */
    public void setHourList(by.bsu.web.sardyko.models.hour.HourList hourList) {
        this.hourList = hourList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOpenHoursResponse)) return false;
        GetOpenHoursResponse other = (GetOpenHoursResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hourList==null && other.getHourList()==null) || 
             (this.hourList!=null &&
              this.hourList.equals(other.getHourList())));
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
        if (getHourList() != null) {
            _hashCode += getHourList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOpenHoursResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", ">getOpenHoursResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", "hourList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://sardyko.web.bsu.by/models/hour", "hourList"));
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
