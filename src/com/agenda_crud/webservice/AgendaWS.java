/**
 * AgendaWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.agenda_crud.webservice;

public interface AgendaWS extends java.rmi.Remote {
    public java.lang.Object[] listarTodosAgenda() throws java.rmi.RemoteException;
    public com.agenda_crud.model.Agenda procuraAgendaPorId(int id) throws java.rmi.RemoteException;
    public void adicionarAgenda(com.agenda_crud.model.Agenda agenda) throws java.rmi.RemoteException;
    public void atualizarAgenda(com.agenda_crud.model.Agenda agenda) throws java.rmi.RemoteException;
    public void deletar(int id) throws java.rmi.RemoteException;
}
