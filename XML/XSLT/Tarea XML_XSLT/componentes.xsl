<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <!--El atributo match sirve para indicar dónde aplicar la plantilla-->
    <xsl:template match="/"> <!--“/” define el documento entero-->
        <html>
            <body>
                <h1 style ="color: green">Catalogo de hardware</h1>
                <table style="border: 5px solid green;">
                    <tr style="background-color:lightblue;">
                        <th style="text-align:left">ID</th>
                        <th style="text-align:left">Tipo</th>
                        <th style="text-align:left">Marca</th>
                        <th style="text-align:left">Modelo</th>
                        <th style="text-align:left">Especificaciones</th>
                    </tr>
                    <xsl:for-each select="hardwareCatalog/item"> <!--<xsl:foreach select=“expresión-XPath”>-->
                        <xsl:sort select="type" order="ascending"/>
                        
                        <tr style="background-color:lightgreen;">
                            <td style="background-color:lightblue;">
                                <!--Permite extraer el valor de un elemento XML y añadirlo en el archivo de
                                salida-->
                                <xsl:value-of select="id" />
                            </td>
                            <td>
                                <xsl:value-of select="type" />
                            </td>
                            <td>
                                <xsl:value-of select="brand" />
                            </td>
                            <td>
                                <xsl:value-of select="model" />
                            </td>
                            <td>
                                <xsl:value-of select="specifications" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>

                <h2 style ="color: gray">Procesadores</h2>
                <table style="border: 5px solid gray;">
                    <tr style="background-color:gray;">
                        <th style="text-align:left">ID</th>
                        <th style="text-align:left">Tipo</th>
                        <th style="text-align:left">Marca</th>
                        <th style="text-align:left">Modelo</th>
                        <th style="text-align:left">Especificaciones</th>
                    </tr>
                    <xsl:for-each select="hardwareCatalog/item"> <!--<xsl:foreach select=“expresión-XPath”>-->
                        <xsl:if test="type='Processor'">
                            <tr style="background-color:lightgreen;">
                                <td style="background-color:gray;">
                                    <!--Permite extraer el valor de un elemento XML y añadirlo en el archivo de
                                    salida-->
                                    <xsl:value-of select="id" />
                                </td>
                                <td>
                                    <xsl:value-of select="type" />
                                </td>
                                <td>
                                    <xsl:value-of select="brand" />
                                </td>
                                <td>
                                    <xsl:value-of select="model" />
                                </td>
                                <td>
                                    <xsl:value-of select="specifications" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
                <h2 style ="color: gray">RAM</h2>
                <table style="border: 5px solid gray;">
                    <tr style="background-color:gray;">
                        <th style="text-align:left">ID</th>
                        <th style="text-align:left">Tipo</th>
                        <th style="text-align:left">Marca</th>
                        <th style="text-align:left">Modelo</th>
                        <th style="text-align:left">Especificaciones</th>
                    </tr>
                    <xsl:for-each select="hardwareCatalog/item"> <!--<xsl:foreach select=“expresión-XPath”>-->
                        <xsl:if test="type='RAM'">
                            <tr style="background-color:lightgreen;">
                                <td style="background-color:gray;">
                                    <!--Permite extraer el valor de un elemento XML y añadirlo en el archivo de
                                    salida-->
                                    <xsl:value-of select="id" />
                                </td>
                                <td>
                                    <xsl:value-of select="type" />
                                </td>
                                <td>
                                    <xsl:value-of select="brand" />
                                </td>
                                <td>
                                    <xsl:value-of select="model" />
                                </td>
                                <td>
                                    <xsl:value-of select="specifications" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>

                <h2 style ="color: gray">Graphics Card</h2>
                <table style="border: 5px solid gray;">
                    <tr style="background-color:gray;">
                        <th style="text-align:left">ID</th>
                        <th style="text-align:left">Tipo</th>
                        <th style="text-align:left">Marca</th>
                        <th style="text-align:left">Modelo</th>
                        <th style="text-align:left">Especificaciones</th>
                    </tr>
                    <xsl:for-each select="hardwareCatalog/item"> <!--<xsl:foreach select=“expresión-XPath”>-->
                        <xsl:if test="type='Graphics Card'">
                            <tr style="background-color:lightgreen;">
                                <td style="background-color:gray;">
                                    <!--Permite extraer el valor de un elemento XML y añadirlo en el archivo de
                                    salida-->
                                    <xsl:value-of select="id" />
                                </td>
                                <td>
                                    <xsl:value-of select="type" />
                                </td>
                                <td>
                                    <xsl:value-of select="brand" />
                                </td>
                                <td>
                                    <xsl:value-of select="model" />
                                </td>
                                <td>
                                    <xsl:value-of select="specifications" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
                
                <h2 style ="color: gray">Hard Drive</h2>
                <table style="border: 5px solid gray;">
                    <tr style="background-color:gray;">
                        <th style="text-align:left">ID</th>
                        <th style="text-align:left">Tipo</th>
                        <th style="text-align:left">Marca</th>
                        <th style="text-align:left">Modelo</th>
                        <th style="text-align:left">Especificaciones</th>
                    </tr>
                    <xsl:for-each select="hardwareCatalog/item"> <!--<xsl:foreach select=“expresión-XPath”>-->
                        <xsl:if test="type='Hard Drive'">
                            <tr style="background-color:lightgreen;">
                                <td style="background-color:gray;">
                                    <!--Permite extraer el valor de un elemento XML y añadirlo en el archivo de
                                    salida-->
                                    <xsl:value-of select="id" />
                                </td>
                                <td>
                                    <xsl:value-of select="type" />
                                </td>
                                <td>
                                    <xsl:value-of select="brand" />
                                </td>
                                <td>
                                    <xsl:value-of select="model" />
                                </td>
                                <td>
                                    <xsl:value-of select="specifications" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>

                <h2 style ="color: gray">Motherboard</h2>
                <table style="border: 5px solid gray;">
                    <tr style="background-color:gray;">
                        <th style="text-align:left">ID</th>
                        <th style="text-align:left">Tipo</th>
                        <th style="text-align:left">Marca</th>
                        <th style="text-align:left">Modelo</th>
                        <th style="text-align:left">Especificaciones</th>
                    </tr>
                    <xsl:for-each select="hardwareCatalog/item"> <!--<xsl:foreach select=“expresión-XPath”>-->
                        <xsl:if test="type='Motherboard'">
                            <tr style="background-color:lightgreen;">
                                <td style="background-color:gray;">
                                    <!--Permite extraer el valor de un elemento XML y añadirlo en el archivo de
                                    salida-->
                                    <xsl:value-of select="id" />
                                </td>
                                <td>
                                    <xsl:value-of select="type" />
                                </td>
                                <td>
                                    <xsl:value-of select="brand" />
                                </td>
                                <td>
                                    <xsl:value-of select="model" />
                                </td>
                                <td>
                                    <xsl:value-of select="specifications" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>

                <h2 style="color: blue">Productos Intel</h2>
                <table style="border: 5px solid blue;">
                    <tr style="background-color:cyan;">
                        <th>Modelo</th>
                        <th>Especificaciones</th>
                    </tr>
                    <xsl:for-each select="hardwareCatalog/item[brand='Intel']">
                        <tr>
                            <td><xsl:value-of select="model"/></td>
                            <td><xsl:value-of select="specifications"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <h2 style="color: blue">Productos diferenciados por id</h2>
                <table style="border: 5px solid blue;">
                    <xsl:for-each select="hardwareCatalog/item">
                        <tr>
                            <xsl:attribute name="style">
                                <xsl:choose>
                                    <xsl:when test="id &gt; 5">background-color: #ffeb3b;</xsl:when>
                                    <xsl:otherwise>background-color: lightgreen;</xsl:otherwise>
                                </xsl:choose>
                            </xsl:attribute>
                            
                            <td><xsl:value-of select="id"/></td>
                            <td><xsl:value-of select="model"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>