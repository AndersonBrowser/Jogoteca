<%-- 
    Document   : Cadastrar
    Created on : 30/06/2015, 18:43:14
    Author     : ander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Usuario" %>
<%@page import="java.util.*" %>	

<jsp:useBean id="u" class="Seguranca.Util" scope="page" />
<jsp:useBean id="usuario" class="Modelo.Usuario" scope="request" />

<jsp:useBean id="dao" class="DAO.DAOUsuario" scope="request" />

<jsp:setProperty name="usuario" property="*"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
try{
usuario.setSenha(u.md5(usuario.getSenha()));
dao.inserir(usuario);
out.println("<h3>Cadastro realizado com sucesso!.</h3>");
}catch (Exception e){
	out.println("<h3>Erro inesperado.</h3>");	
}
%>
<a href="Login.jsp">Clique aqui para se logar</a>
    </body>
</html>
