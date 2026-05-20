<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import = "java.util.List, es.damut12.model.Producto" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Ver Productos</title>
        <link rel="stylesheet" type="text/css" href="css/estilos.css"/>
    </head>
    <body>
        <h1>INFORMACIÓN PRODUCTOS A LA VENTA</h1>
        <h2><a href="index.jsp">Volver a la página de inicio</a></h2>
        <!--Recojo la información que me llega del servlet-->
        <ul>
        <%
            List<Producto> productos = (List<Producto>) request.getAttribute("productos");
            if (productos != null && !productos.isEmpty())
            {
                for (Producto p:productos)
                {
                %>
        
            <li>Producto:<%= p.getNombre() %>
                <ul>
                    <li>Código: <%= p.getCodigo() %></li>
                    <li>Precio: <%= p.getPrecio() %></li>
                    <li>Código Fabricante: <%= p.getCodFabricante() %></li>
                </ul>
            </li>
            <%
            }
        }
        %>
        </ul>
    </body>
</html>