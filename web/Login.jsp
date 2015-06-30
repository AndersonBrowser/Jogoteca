<%-- 
    Document   : Login
    Created on : 30/06/2015, 08:00:35
    Author     : fic
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form1" method="post" action="logar.jsp">
            <fieldset>
                <legend>Tela de Login:</legend>    
                <table>
                    <tr><td>Login:</td>
                        <td><input type="text" name="login"/></td></tr>
                    <tr><td>Senha:</td>
                        <td><input type="password" name="senha"/></td></tr>
                    <tr><td><input type="submit" value="Enviar"/></td>
                        <td><input type="reset" value="Limpar"/></td></tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
