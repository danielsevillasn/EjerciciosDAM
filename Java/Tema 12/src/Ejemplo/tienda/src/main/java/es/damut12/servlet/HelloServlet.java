/*
 * Copyright 2020 Diego Silva <diego.silva at apuntesdejava.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.damut12.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import es.damut12.model.Producto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    //creo una colección para guardar todos los productos
    List<Producto> productos = new ArrayList<>();
    String message;


    @Override
    public void init() {}

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        //cojo lo que me llega de index.jsp
        String accion = request.getParameter("accion");
        switch(accion)
        {
            case "ver":
            {
                verProductos();
                //envío a la vista para mostrarlo
                request.setAttribute("productos", productos);
                request.getRequestDispatcher("/WEB-INF/views/verProductos.jsp").forward(request, response);
                break;
            }
            case "insertar":
            {
                //cojo los valores que se quieren insertar
                String nombre = request.getParameter("nombre");
                double precio = Double.parseDouble(request.getParameter("precio"));
                int codigoF = Integer.parseInt(request.getParameter("codFabricante"));
                insertarProducto(nombre, precio, codigoF);
                //envío el mensaje a la vista 
                request.setAttribute("mensaje", message);
                request.getRequestDispatcher("/WEB-INF/views/resultadoOperacion.jsp").forward(request, response);
                break;
            }
            case "cambiarPrecio":
            {
                //cojo los datos
                String nombre = request.getParameter("nombre");
                double precio = Double.parseDouble(request.getParameter("precio"));
                cambiarPrecio(nombre, precio);
                //envío la información a la vista
                request.setAttribute("mensaje", message);
                request.getRequestDispatcher("/WEB-INF/views/resultadoOperacion.jsp").forward(request, response);
                break;
            }
            case "eliminar":
            {
                //cojo los datos
                String nombre = request.getParameter("nombre");
                eliminarProducto(nombre);
               //envío la información a la vista
               request.setAttribute("mensaje", message);
               request.getRequestDispatcher("/WEB-INF/views/resultadoOperacion.jsp").forward(request, response);
                break;
            }
        }   
    }

    public void verProductos() throws ServletException
    {
        productos.clear();
        System.out.println("Entro en verProductos");
        //conexión con la base de datos 
        try
        {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Conexión con la BD hecha.");

            //ubicación de la base de datos
            String url = "jdbc:sqlite:E:/Avellaneda24-25/Modulos/Programacion/UT12/BBDD/tienda.db";
            //consulta que quiero hacer a la base de datos
            String consulta = "SELECT * from productos";

            //conexión con la base de datos try-with-resources
            try (Connection con = DriverManager.getConnection(url);
                PreparedStatement sentencia = con.prepareStatement(consulta))
            {
                //ejecuto la consulta y guardo en un ResultSet
                ResultSet rs = sentencia.executeQuery();        
                
                //recorro ResultSet y guardo todos los productos
                while(rs.next())
                {
                    int codigo = rs.getInt("codigo");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    int codigoF = rs.getInt("codigo_fabricante");
                    Producto prod = new Producto(codigo, nombre, precio, codigoF);
                    productos.add(prod);
                }
                System.out.println("Tamaño de productos: " + productos.size());
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                throw new ServletException("Error al conectar con la base de datos", e);
            }
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void insertarProducto(String nombre, double precio, int codFabricante)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");

            //url a la base de datos
            String url = "jdbc:sqlite:E:/Avellaneda24-25/Modulos/Programacion/UT12/BBDD/tienda.db";
            //operación a realizar a la base de datos
            String consulta = "INSERT INTO PRODUCTOS (NOMBRE, PRECIO, CODIGO_FABRICANTE) VALUES (?, ?, ?)";

            //conexión con try with resources
            try (Connection con = DriverManager.getConnection(url);
                PreparedStatement instruccion = con.prepareStatement(consulta))
            {
                //configuramos los valores de la consulta
                instruccion.setString(1,nombre);
                instruccion.setDouble(2, precio);
                instruccion.setInt(3,codFabricante);
                //ejecutamos la sentencia
                int resultado = instruccion.executeUpdate();

                //si devuelve 1 o 2 es que se ha ejecutado sin problemas
                if (resultado > 0)
                {
                    message = "La inserción del producto " + nombre + ", se ha realizado correctamente.";
                }
                else
                {
                    message = "Ha habido algún problema y no ha podido realizarse la inserción.";
                    message += "Revise los datos";
                }
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                message = e.getMessage();
            }
            } 
            catch(ClassNotFoundException e)
            {
                System.out.println(e.getMessage());
            }

        

    }

    public void cambiarPrecio(String nombre, double precio)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:E:/Avellaneda24-25/Modulos/Programacion/UT12/BBDD/tienda.db";

            //consulta para obtener el código del producto a modificar
            String consultaCodigo = "SELECT CODIGO FROM PRODUCTOS WHERE NOMBRE = ?";
            
            //consulta para actualizar el producto si se ha encontrado
            String consultaActualizar = "UPDATE PRODUCTOS SET PRECIO = ? WHERE CODIGO = ?";

            //creo la conexión para obtener el código del producto
            try (Connection con = DriverManager.getConnection(url);
                PreparedStatement ps = con.prepareStatement(consultaCodigo))
            {
                //le paso el parámetro
                ps.setString(1, nombre);

                //ejecuto
                ResultSet rs = ps.executeQuery();
                
                //compruebo si tengo resultado
                if (rs.next())
                {
                    int codigoP = rs.getInt("codigo");

                    //ejecuto para actualizar
                    PreparedStatement instruccion = con.prepareStatement(consultaActualizar);
                    instruccion.setDouble(1, precio);
                    instruccion.setInt(2, codigoP);
                    //ejecuto actualización
                    int resultado = instruccion.executeUpdate();
                    //cierro el recurso porque este no lo he abierto con try with resources
                    instruccion.close();

                    //compruebo si se ha ejecutado bien
                    if (resultado > 0)
                    {
                        message = "El producto " + nombre + " ha actualizado su precio a " + precio;
                    }
                    else
                    {
                        message = "No se ha podido actualizar el procuto " + nombre + " al precio " + precio;
                    }
                }
                else 
                {
                    message = "El producto " + nombre + " no se encuentra en la base de datos.";
                }
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                message = e.getMessage();
            }

        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void eliminarProducto(String nombre)
    {
        try
        {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:E:/Avellaneda24-25/Modulos/Programacion/UT12/BBDD/tienda.db";

            //busco el código del producto a eliminar
            String consultaCod = "SELECT CODIGO FROM PRODUCTOS WHERE NOMBRE = ?";
            
            //consulta para eliminar
            String consulta = "DELETE FROM PRODUCTOS WHERE CODIGO = ?";

            //CREO LA CONEXIÓN
            try(Connection con = DriverManager.getConnection(url);
                PreparedStatement ps = con.prepareStatement(consultaCod))
            {
                ps.setString(1, nombre);
                ResultSet rs = ps.executeQuery();
                if (rs.next())
                {
                    int codigo = rs.getInt("codigo");
                    //realizo la consulta de eliminación, ha encontrado el código
                    PreparedStatement instruccion = con.prepareStatement(consulta);
                    //ejecuto para actualizar
                    instruccion.setInt(1, codigo);
                    //ejecuto actualización
                    int resultado = instruccion.executeUpdate();
                    //cierro el recurso porque este no lo he abierto con try with resources
                    instruccion.close();
                    
                    //compruebo el resultado
                    if (resultado > 0)
                    {
                        message = "El producto " + nombre + " se ha eliminado correctamente de la base de datos.";
                    }
                    else
                    {
                        message = "El producto " + nombre + " no se ha podido eliminar de la base de datos.";
                    }
                }
                else
                {
                    message = "El producto " + nombre + " no se encuentra en la base de datos.";
                }
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
                message = e.getMessage();
            }

        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "HOLA" + "</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {
    }
}