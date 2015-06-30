<%-- 
    Document   : Cadastro
    Created on : 30/06/2015, 08:22:16
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
    <fieldset>
                <legend>Tela de Cadastro:</legend>    
                <table>
                    <tr><td>Nome:</td>
                        <td><input type="text" name="nome"/></td></tr>
                     <tr><td>Telefone:</td>
                        <td><input type="text" name="telefone"/></td></tr>
                    <tr><td>Usuário:</td>
                        <td><input type="text" name="usuario"/></td></tr>
                    <tr><td>Senha:</td>
                        <td><input type="password" name="senha"/></td></tr>
                    <tr><td><input type="submit" value="Enviar"/></td>
                        <td><input type="reset" value="Limpar"/></td></tr>
                </table>
            </fieldset>
    </body>
</html>
