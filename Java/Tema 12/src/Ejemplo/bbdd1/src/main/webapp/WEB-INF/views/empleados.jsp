<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import = "java.util.ArrayList, java.util.List, es.damut11.model.Empleado" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Empleados</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css"/>
    </head>
    <body>
        <h1>EMPLEADOS</h1>
        
            <ul>
            <% 
                List<Empleado> empleados = (List<Empleado>) request.getAttribute("empleados");
                for (Empleado e:empleados)
                {
            %>
            <li class="group">
                <ul>
                    <li class="detail">Número de empleado: <%= e.getNumEmple() %></li>
                    <li class="detail">Número de departamento: <%= e.getNumDpto() %></li>
                    <li class="detail">Nombre de empleado: <%= e.getNombre() %></li>
                    <li class="detail">Dirección de empleado: <%= e.getDireccion() %></li>
                </ul>
            </li>
                <%
                }
            %>
            </ul>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>