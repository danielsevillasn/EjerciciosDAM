<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import = "es.damut11.model.Departamento, java.util.List, java.util.ArrayList" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Departamentos</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css"/>
    </head>
    <body>
        <h1>DEPARTAMENTOS</h1>
        
            <ul>
                <%
                    List<Departamento> departamentos = (List<Departamento>) request.getAttribute("departamentos");
                    for (Departamento d:departamentos)
                    {
                        %>
                    <li class="group">
                        <ul>
                            <li class="detail">Número de Departamento: <%= d.getNumDpto() %></li>
                            <li class="detail">Nombre de Departamento: <%= d.getNombre() %></li>
                            <li class="detail">Ubicación de Departamento: <%= d.getUbicacion() %></li>
                        </ul>
                    </li>
                    <%
                    }
                %>
            </ul>
        </li>
        <a href="index.jsp">Volver al inicio</a>
    </body>
</html>