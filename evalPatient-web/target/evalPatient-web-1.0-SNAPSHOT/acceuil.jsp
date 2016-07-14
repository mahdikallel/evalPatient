<%@page import="com.csys.evalpatient.generic.WS"%>
<%@page import="com.csys.evalpatient.generic.MyConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Test Connexion</h1>
        <%
           // MyConnection cnx = new MyConnection();
           // if (cnx.getConnection() == null) {
          //      out.print("null");
          //  } else {
                WS webServ = new WS();
                out.print("Port "+ webServ.getWSDLPort());

           // }
        %>
    </body>
</html>
