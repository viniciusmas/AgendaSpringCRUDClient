/**
 * AgendaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.agenda_crud.webservice;

public class AgendaWSServiceLocator extends org.apache.axis.client.Service implements com.agenda_crud.webservice.AgendaWSService {

    public AgendaWSServiceLocator() {
    }


    public AgendaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AgendaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AgendaWS
    private java.lang.String AgendaWS_address = "http://localhost:8083/AgendaSpringCRUD/services/AgendaWS";

    public java.lang.String getAgendaWSAddress() {
        return AgendaWS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AgendaWSWSDDServiceName = "AgendaWS";

    public java.lang.String getAgendaWSWSDDServiceName() {
        return AgendaWSWSDDServiceName;
    }

    public void setAgendaWSWSDDServiceName(java.lang.String name) {
        AgendaWSWSDDServiceName = name;
    }

    public com.agenda_crud.webservice.AgendaWS getAgendaWS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AgendaWS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAgendaWS(endpoint);
    }

    public com.agenda_crud.webservice.AgendaWS getAgendaWS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.agenda_crud.webservice.AgendaWSSoapBindingStub _stub = new com.agenda_crud.webservice.AgendaWSSoapBindingStub(portAddress, this);
            _stub.setPortName(getAgendaWSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAgendaWSEndpointAddress(java.lang.String address) {
        AgendaWS_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.agenda_crud.webservice.AgendaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.agenda_crud.webservice.AgendaWSSoapBindingStub _stub = new com.agenda_crud.webservice.AgendaWSSoapBindingStub(new java.net.URL(AgendaWS_address), this);
                _stub.setPortName(getAgendaWSWSDDServiceName());
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
        if ("AgendaWS".equals(inputPortName)) {
            return getAgendaWS();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.agenda_crud.com", "AgendaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.agenda_crud.com", "AgendaWS"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AgendaWS".equals(portName)) {
            setAgendaWSEndpointAddress(address);
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
