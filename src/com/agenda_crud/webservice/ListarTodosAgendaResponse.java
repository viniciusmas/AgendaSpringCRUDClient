/**
 * ListarTodosAgendaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.agenda_crud.webservice;

public class ListarTodosAgendaResponse  implements java.io.Serializable {
    private java.lang.Object[] listarTodosAgendaReturn;

    public ListarTodosAgendaResponse() {
    }

    public ListarTodosAgendaResponse(
           java.lang.Object[] listarTodosAgendaReturn) {
           this.listarTodosAgendaReturn = listarTodosAgendaReturn;
    }


    /**
     * Gets the listarTodosAgendaReturn value for this ListarTodosAgendaResponse.
     * 
     * @return listarTodosAgendaReturn
     */
    public java.lang.Object[] getListarTodosAgendaReturn() {
        return listarTodosAgendaReturn;
    }


    /**
     * Sets the listarTodosAgendaReturn value for this ListarTodosAgendaResponse.
     * 
     * @param listarTodosAgendaReturn
     */
    public void setListarTodosAgendaReturn(java.lang.Object[] listarTodosAgendaReturn) {
        this.listarTodosAgendaReturn = listarTodosAgendaReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarTodosAgendaResponse)) return false;
        ListarTodosAgendaResponse other = (ListarTodosAgendaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listarTodosAgendaReturn==null && other.getListarTodosAgendaReturn()==null) || 
             (this.listarTodosAgendaReturn!=null &&
              java.util.Arrays.equals(this.listarTodosAgendaReturn, other.getListarTodosAgendaReturn())));
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
        if (getListarTodosAgendaReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListarTodosAgendaReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListarTodosAgendaReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarTodosAgendaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", ">listarTodosAgendaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listarTodosAgendaReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", "listarTodosAgendaReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", "item"));
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
