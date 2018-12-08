/**
 * AtualizarAgenda.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.agenda_crud.webservice;

public class AtualizarAgenda  implements java.io.Serializable {
    private com.agenda_crud.model.Agenda agenda;

    public AtualizarAgenda() {
    }

    public AtualizarAgenda(
           com.agenda_crud.model.Agenda agenda) {
           this.agenda = agenda;
    }


    /**
     * Gets the agenda value for this AtualizarAgenda.
     * 
     * @return agenda
     */
    public com.agenda_crud.model.Agenda getAgenda() {
        return agenda;
    }


    /**
     * Sets the agenda value for this AtualizarAgenda.
     * 
     * @param agenda
     */
    public void setAgenda(com.agenda_crud.model.Agenda agenda) {
        this.agenda = agenda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizarAgenda)) return false;
        AtualizarAgenda other = (AtualizarAgenda) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agenda==null && other.getAgenda()==null) || 
             (this.agenda!=null &&
              this.agenda.equals(other.getAgenda())));
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
        if (getAgenda() != null) {
            _hashCode += getAgenda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizarAgenda.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", ">atualizarAgenda"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agenda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", "agenda"));
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
