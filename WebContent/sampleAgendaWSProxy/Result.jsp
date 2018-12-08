<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAgendaWSProxyid" scope="session" class="com.agenda_crud.webservice.AgendaWSProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAgendaWSProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAgendaWSProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAgendaWSProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.agenda_crud.webservice.AgendaWS getAgendaWS10mtemp = sampleAgendaWSProxyid.getAgendaWS();
if(getAgendaWS10mtemp == null){
%>
<%=getAgendaWS10mtemp %>
<%
}else{
        if(getAgendaWS10mtemp!= null){
        String tempreturnp11 = getAgendaWS10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.Object[] listarTodosAgenda13mtemp = sampleAgendaWSProxyid.listarTodosAgenda();
if(listarTodosAgenda13mtemp == null){
%>
<%=listarTodosAgenda13mtemp %>
<%
}else{
        String tempreturnp14 = null;
        if(listarTodosAgenda13mtemp != null){
        java.util.List listreturnp14= java.util.Arrays.asList(listarTodosAgenda13mtemp);
        tempreturnp14 = listreturnp14.toString();
        }
        %>
        <%=tempreturnp14%>
        <%
}
break;
case 16:
        gotMethod = true;
        String id_1id=  request.getParameter("id27");
        int id_1idTemp  = Integer.parseInt(id_1id);
        com.agenda_crud.model.Agenda procuraAgendaPorId16mtemp = sampleAgendaWSProxyid.procuraAgendaPorId(id_1idTemp);
if(procuraAgendaPorId16mtemp == null){
%>
<%=procuraAgendaPorId16mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">telefone:</TD>
<TD>
<%
if(procuraAgendaPorId16mtemp != null){
java.lang.String typetelefone19 = procuraAgendaPorId16mtemp.getTelefone();
        String tempResulttelefone19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetelefone19));
        %>
        <%= tempResulttelefone19 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nome:</TD>
<TD>
<%
if(procuraAgendaPorId16mtemp != null){
java.lang.String typenome21 = procuraAgendaPorId16mtemp.getNome();
        String tempResultnome21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenome21));
        %>
        <%= tempResultnome21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(procuraAgendaPorId16mtemp != null){
java.lang.String typeemail23 = procuraAgendaPorId16mtemp.getEmail();
        String tempResultemail23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail23));
        %>
        <%= tempResultemail23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(procuraAgendaPorId16mtemp != null){
java.lang.Integer typeid25 = procuraAgendaPorId16mtemp.getId();
        String tempResultid25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid25));
        %>
        <%= tempResultid25 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 29:
        gotMethod = true;
        String telefone_3id=  request.getParameter("telefone34");
            java.lang.String telefone_3idTemp = null;
        if(!telefone_3id.equals("")){
         telefone_3idTemp  = telefone_3id;
        }
        String nome_4id=  request.getParameter("nome36");
            java.lang.String nome_4idTemp = null;
        if(!nome_4id.equals("")){
         nome_4idTemp  = nome_4id;
        }
        String email_5id=  request.getParameter("email38");
            java.lang.String email_5idTemp = null;
        if(!email_5id.equals("")){
         email_5idTemp  = email_5id;
        }
        String id_6id=  request.getParameter("id40");
            java.lang.Integer id_6idTemp = null;
        if(!id_6id.equals("")){
         id_6idTemp  = java.lang.Integer.valueOf(id_6id);
        }
        %>
        <jsp:useBean id="com1agenda_crud1model1Agenda_2id" scope="session" class="com.agenda_crud.model.Agenda" />
        <%
        com1agenda_crud1model1Agenda_2id.setTelefone(telefone_3idTemp);
        com1agenda_crud1model1Agenda_2id.setNome(nome_4idTemp);
        com1agenda_crud1model1Agenda_2id.setEmail(email_5idTemp);
        com1agenda_crud1model1Agenda_2id.setId(id_6idTemp);
        sampleAgendaWSProxyid.adicionarAgenda(com1agenda_crud1model1Agenda_2id);
break;
case 42:
        gotMethod = true;
        String telefone_8id=  request.getParameter("telefone47");
            java.lang.String telefone_8idTemp = null;
        if(!telefone_8id.equals("")){
         telefone_8idTemp  = telefone_8id;
        }
        String nome_9id=  request.getParameter("nome49");
            java.lang.String nome_9idTemp = null;
        if(!nome_9id.equals("")){
         nome_9idTemp  = nome_9id;
        }
        String email_10id=  request.getParameter("email51");
            java.lang.String email_10idTemp = null;
        if(!email_10id.equals("")){
         email_10idTemp  = email_10id;
        }
        String id_11id=  request.getParameter("id53");
            java.lang.Integer id_11idTemp = null;
        if(!id_11id.equals("")){
         id_11idTemp  = java.lang.Integer.valueOf(id_11id);
        }
        %>
        <jsp:useBean id="com1agenda_crud1model1Agenda_7id" scope="session" class="com.agenda_crud.model.Agenda" />
        <%
        com1agenda_crud1model1Agenda_7id.setTelefone(telefone_8idTemp);
        com1agenda_crud1model1Agenda_7id.setNome(nome_9idTemp);
        com1agenda_crud1model1Agenda_7id.setEmail(email_10idTemp);
        com1agenda_crud1model1Agenda_7id.setId(id_11idTemp);
        sampleAgendaWSProxyid.atualizarAgenda(com1agenda_crud1model1Agenda_7id);
break;
case 55:
        gotMethod = true;
        String id_12id=  request.getParameter("id58");
        int id_12idTemp  = Integer.parseInt(id_12id);
        sampleAgendaWSProxyid.deletar(id_12idTemp);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>