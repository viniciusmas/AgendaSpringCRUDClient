package com.agenda_crud.webservice;

public class AgendaWSProxy implements com.agenda_crud.webservice.AgendaWS {
  private String _endpoint = null;
  private com.agenda_crud.webservice.AgendaWS agendaWS = null;
  
  public AgendaWSProxy() {
    _initAgendaWSProxy();
  }
  
  public AgendaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgendaWSProxy();
  }
  
  private void _initAgendaWSProxy() {
    try {
      agendaWS = (new com.agenda_crud.webservice.AgendaWSServiceLocator()).getAgendaWS();
      if (agendaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agendaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agendaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agendaWS != null)
      ((javax.xml.rpc.Stub)agendaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.agenda_crud.webservice.AgendaWS getAgendaWS() {
    if (agendaWS == null)
      _initAgendaWSProxy();
    return agendaWS;
  }
  
  public java.lang.Object[] listarTodosAgenda() throws java.rmi.RemoteException{
    if (agendaWS == null)
      _initAgendaWSProxy();
    return agendaWS.listarTodosAgenda();
  }
  
  public com.agenda_crud.model.Agenda procuraAgendaPorId(int id) throws java.rmi.RemoteException{
    if (agendaWS == null)
      _initAgendaWSProxy();
    return agendaWS.procuraAgendaPorId(id);
  }
  
  public void adicionarAgenda(com.agenda_crud.model.Agenda agenda) throws java.rmi.RemoteException{
    if (agendaWS == null)
      _initAgendaWSProxy();
    agendaWS.adicionarAgenda(agenda);
  }
  
  public void atualizarAgenda(com.agenda_crud.model.Agenda agenda) throws java.rmi.RemoteException{
    if (agendaWS == null)
      _initAgendaWSProxy();
    agendaWS.atualizarAgenda(agenda);
  }
  
  public void deletar(int id) throws java.rmi.RemoteException{
    if (agendaWS == null)
      _initAgendaWSProxy();
    agendaWS.deletar(id);
  }
  
  
}