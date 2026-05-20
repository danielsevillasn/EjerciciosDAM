<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css"/>
    </head>
    <body>
        <h1>EMPLEADOS - DEPARTAMENTOS</h1>
        <form action = "hello-servlet" method = "post">
            <input type="hidden" name = "action" value = "empleados"/>
            <input type = "submit" value = "Ver Empleados"/>
        </form>
        <form action = "hello-servlet" method = "post">
            <input type="hidden" name = "action" value = "departamentos"/>
            <input type = "submit" value = "Ver Departamentos"/>
        </form>
        
    </body>
</html>