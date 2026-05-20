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
package es.damut11.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.damut11.model.Departamento;
import es.damut11.model.Empleado;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    @Override
    public void init() {}

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {}

    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    throws IOException, ServletException
    {
        try {
            //para obligar a coger el driver
            Class.forName("org.sqlite.JDBC");

            //conexión con la base de datos
            //hago con try with resources para ahorrarme el cierre de recursos
            String url = "jdbc:sqlite:E:/Avellaneda24-25/Modulos/Programacion/UT12/BBDD/prueba.db";
                                    
            String sqlEmple = "SELECT * FROM empleados";
            String sqlDepar = "SELECT * FROM departamentos";
            try(Connection con = DriverManager.getConnection(url);
            Statement sentencia = con.createStatement())
            {
                ResultSet rs;
                //cojo los datos
                String accion = request.getParameter("action");
                //veo qué opción se ha elegido
                switch (accion) 
                {
                    
                    case "empleados":
                    {
                        System.out.println("CASE EMPLEADOS");
                        rs = sentencia.executeQuery(sqlEmple);
                        List<Empleado> empleados = new ArrayList<>();
                        while (rs.next())
                        {
                            int numEmple = rs.getInt("empNo");
                            String nombre = rs.getString("nombre");
                            String apellidos = rs.getString("apellidos");
                            String direccion = rs.getString("direccion");
                            int numDpto = rs.getInt("dptoNo");
                            Empleado emple = new Empleado(numEmple, numDpto, nombre, apellidos, direccion);
                            empleados.add(emple);
                        }
                        System.out.println("Número de empleados recuperados: " + empleados.size());
                        request.setAttribute("empleados", empleados);
                        request.getRequestDispatcher("/WEB-INF/views/empleados.jsp").forward(request, response);
                        break;
                    }
                    case "departamentos":
                    {
                        System.out.println("CASE DEPARTAMENTOS");
                        rs = sentencia.executeQuery(sqlDepar);
                        List<Departamento> departamentos = new ArrayList<>();

                        while (rs.next())
                        {
                            int numDpto = rs.getInt("dptoNo");
                            String nombre = rs.getString("nombre");
                            String ubicacion = rs.getString("ubicacion");

                            Departamento departamento = new Departamento(numDpto, nombre, ubicacion);
                            departamentos.add(departamento);
                        }
                        request.setAttribute("departamentos", departamentos);
                        request.getRequestDispatcher("/WEB-INF/views/departamentos.jsp").forward(request, response);
                        break;
                    }
                    default: 
                    {
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                }
            }
            catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }

        } catch (ClassNotFoundException e) {
            throw new ServletException("No se pudo cargar el driver de SQLite", e);
        }
        

    }

    @Override
    public void destroy() {
    }
}