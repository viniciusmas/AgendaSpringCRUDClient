/**
 * AgendaWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.agenda_crud.webservice;

public interface AgendaWSService extends javax.xml.rpc.Service {
    public java.lang.String getAgendaWSAddress();

    public com.agenda_crud.webservice.AgendaWS getAgendaWS() throws javax.xml.rpc.ServiceException;

    public com.agenda_crud.webservice.AgendaWS getAgendaWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
