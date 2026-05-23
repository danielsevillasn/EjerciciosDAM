<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8" />
                <title>Panel - <xsl:value-of select="centroDeportivo/@nombre" /></title>
                <link rel="stylesheet" type="text/css" href="estilos.css" />
            </head>
            <body>
                <div class="container">

                    <header>
                        <h1>Centro Deportivo: <xsl:value-of select="centroDeportivo/@nombre" /></h1>
                    </header>

                    <h2>Catálogo General de Actividades</h2>
                    <table>
                        <tr>
                            <th>Actividad</th>
                            <th>Nivel</th>
                            <th>Monitor</th>
                            <th>Teléfono</th>
                            <th>Horario</th>
                            <th>Duración</th>
                            <th>Plazas Disp.</th>
                            <th>Precio Mensual</th>
                        </tr>

                        <!--For each que recorre todos los valores de todas las actividades del centro deportivo-->
                        <xsl:for-each select="centroDeportivo/actividad">
                            <!--Sort que ordena por nombre actividad-->
                            <xsl:sort select="nombre" />
                            <!--Condicional que mira si el nivel es inicial para imponer las primeras filas de la tabla-->
                            <xsl:if test="@nivel='inicial'">
                                <!--Desglose de las filas sacando el valor del xml, los @ sirven para sacar los atributos, todo se hace por referencia absoluta-->
                                <tr>
                                    <td>
                                        <strong>
                                            <xsl:value-of select="nombre" />
                                        </strong>
                                    </td>
                                    <td>
                                        <xsl:value-of select="@nivel" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="monitor/nombreMonitor" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="monitor/telefono" />
                                    </td>
                                    <td><xsl:value-of select="horario/dia" /> a las <xsl:value-of select="horario/horaInicio" /></td>
                                    <td><xsl:value-of select="horario/duracionMinutos" /> min</td>
                                    <td>
                                        <xsl:value-of select="inscripcion/plazasDisponibles" />
                                    </td>
                                    <td><xsl:value-of select="inscripcion/precioMensual" />€</td>
                                </tr>
                            </xsl:if>
                        </xsl:for-each>

                        <!--For each que recorre todos los valores de todas las actividades del centro deportivo-->
                        <xsl:for-each select="centroDeportivo/actividad">
                            <!--Sort que ordena por nombre actividad-->
                            <xsl:sort select="nombre" />
                            <!--Condicional que mira si el nivel es medio para imponer las primeras filas de la tabla-->
                            <xsl:if test="@nivel='medio'">
                                <!--Desglose de las filas sacando el valor del xml, los @ sirven para sacar los atributos, todo se hace por referencia absoluta-->
                                <tr>
                                    <td>
                                        <strong>
                                            <xsl:value-of select="nombre" />
                                        </strong>
                                    </td>
                                    <td>
                                        <xsl:value-of select="@nivel" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="monitor/nombreMonitor" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="monitor/telefono" />
                                    </td>
                                    <td><xsl:value-of select="horario/dia" /> a las <xsl:value-of
                                            select="horario/horaInicio" /></td>
                                    <td><xsl:value-of select="horario/duracionMinutos" /> min</td>
                                    <td>
                                        <xsl:value-of select="inscripcion/plazasDisponibles" />
                                    </td>
                                    <td><xsl:value-of select="inscripcion/precioMensual" />€</td>
                                </tr>
                            </xsl:if>
                        </xsl:for-each>

                        <!--For each que recorre todos los valores de todas las actividades del centro deportivo-->
                        <xsl:for-each select="centroDeportivo/actividad">
                            <!--Sort que ordena por nombre actividad-->
                            <xsl:sort select="nombre" />
                            <!--Condicional que mira si el nivel es avanzado para imponer las primeras filas de la tabla-->
                            <xsl:if test="@nivel='avanzado'">
                                <!--Desglose de las filas sacando el valor del xml, los @ sirven para sacar los atributos, todo se hace por referencia absoluta-->
                                <tr>
                                    <td>
                                        <strong>
                                            <xsl:value-of select="nombre" />
                                        </strong>
                                    </td>
                                    <td>
                                        <xsl:value-of select="@nivel" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="monitor/nombreMonitor" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="monitor/telefono" />
                                    </td>
                                    <td><xsl:value-of select="horario/dia" /> a las <xsl:value-of
                                            select="horario/horaInicio" /></td>
                                    <td><xsl:value-of select="horario/duracionMinutos" /> min</td>
                                    <td>
                                        <xsl:value-of select="inscripcion/plazasDisponibles" />
                                    </td>
                                    <td><xsl:value-of select="inscripcion/precioMensual" />€</td>
                                </tr>
                            </xsl:if>
                        </xsl:for-each>

                    </table>

                    <h2>Clases Disponibles para Inscripción Inmediata</h2>
                    <div class="grid-destacados">
                        <!--For each que recorre todos los valores de todas las actividades del centro deportivo que tengan el atributo plazoInscripcion en abierto, también se podria haber hecho con un if, pero he preferido hacerlo asi para demostrar que se como funciona el Xpath-->
                        <xsl:for-each select="centroDeportivo/actividad[@plazoInscripcion='abierto']">
                            <div class="card">
                                <!--Desglose de las filas sacando el valor del xml, los @ sirven para sacar los atributos, todo se hace por referencia absoluta-->
                                <h3>
                                    <xsl:value-of select="nombre" />
                                </h3>
                                <p>
                                    <strong>Nivel: </strong>
                                    <xsl:value-of select="@nivel" />
                                </p>
                                <p>
                                    <strong>Dia: </strong>
                                    <xsl:value-of select="horario/dia" />
                                </p>
                                <p>
                                    <strong>Hora inicio: </strong>
                                    <xsl:value-of select="horario/horaInicio" />
                                </p>
                                <p><strong>Plazas Libres: </strong> <xsl:value-of
                                        select="inscripcion/plazasDisponibles" /> vacantes</p>
                                <span class="badge-precio"><xsl:value-of
                                        select="inscripcion/precioMensual" /> €/mes</span>
                            </div>
                        </xsl:for-each>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>