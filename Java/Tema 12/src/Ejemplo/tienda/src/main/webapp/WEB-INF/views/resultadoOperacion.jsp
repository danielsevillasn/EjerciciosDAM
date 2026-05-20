<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Inserción</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css"/>
    </head>
    <body>
        <h1>RESULTADO DE LA OPERACIÓN</h1>
        <h2><a href="index.jsp">Volver a la página de inicio</a></h2>
        <!--RECUPERO LOS DATOS QUE ME MANDA EL SERVLET-->
        <%
            String mensaje = (String) request.getAttribute("mensaje");
            if (mensaje == null) {
                mensaje = "El mensaje no llegó al JSP. Revise el Servlet.";
            }
        %>
        <p><%= mensaje %></p>
    </body>
</html>