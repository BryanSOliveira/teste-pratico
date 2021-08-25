<%@ page import="model.ConteinerJavaBeans" %>
<%@ page import="java.util.ArrayList" %>

<%
	ArrayList<ConteinerJavaBeans> lista = (ArrayList<ConteinerJavaBeans>) request.getAttribute("conteineres");
%>

<%@ include file="header.jsp" %>

<h1>Contêineres</h1>

<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nome Cliente</th>
      <th scope="col">Número Contêiner</th>
      <th scope="col">Tipo</th>
      <th scope="col">Status</th>
      <th scope="col">Categoria</th>
      <th scope="col">Opções</th>
    </tr>
  </thead>
  <tbody>
    
    <%
    for(int i = 0; i < lista.size(); i++) {
    %>
    
    <tr>
    	<td><%= lista.get(i).getId_conteiner() %></td>
    	<td><%= lista.get(i).getNome_cliente() %></td>
    	<td><%= lista.get(i).getNumero_conteiner() %></td>
    	<td><%= lista.get(i).getTipo_conteiner() %></td>
    	<td><%= lista.get(i).getStatus_conteiner() %></td>
    	<td><%= lista.get(i).getCategoria_conteiner() %></td>
    	<td><a href="select-conteiner?id_conteiner=<%= lista.get(i).getId_conteiner() %>">Editar</a></td>
    </tr>
    
    <%
    }
    %>
      
  </tbody>
</table>

<%@ include file="footer.jsp" %>