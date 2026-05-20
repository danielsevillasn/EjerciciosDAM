<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/estilos.css"/>
    </head>
    <body>
        <h1>GESTIÓN DE PRODUCTOS DE LA TIENDA</h1>
        <h3>Selección la gestión que quieras realizar</h3>
        <fieldset>
            <form action="hello-servlet" method="post">
                <input type="hidden" name="accion" value="ver"/>
                <input type="submit" value="Ver Productos"/>
            </form>
        </fieldset>
        <fieldset>
            <form action="hello-servlet" method="post">
                <input type="hidden" name="accion" value="insertar"/>
                <label for="nombre">Nombre producto:</label>
                <input type="text" id="nombre" name="nombre" required/>
                <label for="precio">Precio producto:</label>
                <input type="number" id="precio" name="precio" required/>
                <label for="codFabricante">Código Fabricante:</label>
                <input type="number" id="codFabricante" name="codFabricante" required/>
                <input type="submit" value="Insertar Producto"/>
            </form>
        </fieldset>
        <fieldset>
            <form action="hello-servlet" method="post">
                <input type="hidden" name="accion" value="cambiarPrecio"/>
                <label for="nombre">Nombre producto:</label>
                <input type="text" id="nombre" name="nombre" required/>
                <label for="precio">Precio producto:</label>
                <input type="number" id="precio" name="precio" required/>
                <input type="submit" value="Cambiar Precio"/>
            </form>
        </fieldset>
        <fieldset>
            <form action="hello-servlet" method="post">
                <input type="hidden" name="accion" value="eliminar"/>
                <label for="nombre">Nombre producto:</label>
                <input type="text" id="nombre" name="nombre" required/>
                <input type="submit" value="eliminar"/>
            </form>
        </fieldset>
        
    </body>
</html>