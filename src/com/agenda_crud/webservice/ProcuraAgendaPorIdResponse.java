/**
 * ProcuraAgendaPorIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.agenda_crud.webservice;

public class ProcuraAgendaPorIdResponse  implements java.io.Serializable {
    private com.agenda_crud.model.Agenda procuraAgendaPorIdReturn;

    public ProcuraAgendaPorIdResponse() {
    }

    public ProcuraAgendaPorIdResponse(
           com.agenda_crud.model.Agenda procuraAgendaPorIdReturn) {
           this.procuraAgendaPorIdReturn = procuraAgendaPorIdReturn;
    }


    /**
     * Gets the procuraAgendaPorIdReturn value for this ProcuraAgendaPorIdResponse.
     * 
     * @return procuraAgendaPorIdReturn
     */
    public com.agenda_crud.model.Agenda getProcuraAgendaPorIdReturn() {
        return procuraAgendaPorIdReturn;
    }


    /**
     * Sets the procuraAgendaPorIdReturn value for this ProcuraAgendaPorIdResponse.
     * 
     * @param procuraAgendaPorIdReturn
     */
    public void setProcuraAgendaPorIdReturn(com.agenda_crud.model.Agenda procuraAgendaPorIdReturn) {
        this.procuraAgendaPorIdReturn = procuraAgendaPorIdReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcuraAgendaPorIdResponse)) return false;
        ProcuraAgendaPorIdResponse other = (ProcuraAgendaPorIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.procuraAgendaPorIdReturn==null && other.getProcuraAgendaPorIdReturn()==null) || 
             (this.procuraAgendaPorIdReturn!=null &&
              this.procuraAgendaPorIdReturn.equals(other.getProcuraAgendaPorIdReturn())));
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
        if (getProcuraAgendaPorIdReturn() != null) {
            _hashCode += getProcuraAgendaPorIdReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcuraAgendaPorIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", ">procuraAgendaPorIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procuraAgendaPorIdReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", "procuraAgendaPorIdReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.agenda_crud.com", "Agenda"));
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
