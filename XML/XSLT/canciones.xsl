<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <!--El
    atributo match sirve para indicar dónde aplicar la plantilla-->
    <xsl:template match="/"> <!--“/”
        define el documento entero-->
        <html>
            <body>
                <h1>Mis Canciones favoritas</h1>
<!--Tabla con foreach-->
                <table style="border: 1px solid blue;">
                    <tr style="background-color:lightblue;">
                        <th style="text-align:left">Título</th>
                        <th style="text-align:left">Artista</th>
                        <th style="text-align:left">Disco</th>
                    </tr>
                    <xsl:for-each select="MisCancionesPreferidas/archivo"> <!--<xsl:for
                        each select=“expresión-XPath”>-->
                        
                        <tr>
                            <td>
                                <!--Permite
                                extraer el valor de un elemento XML y añadirlo en el archivo de
                                salida-->
                                <xsl:value-of select="canción" /> <!--<xsl:value-of
                                select=“ExpresiónXPath”>-->
                            </td>
                            <td>
                                <xsl:value-of select="artista" />
                            </td>
                            <td>
                                <xsl:value-of select="disco" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
<!--Tabla con sort-->
                <table style="border: 1px solid blue;">
                    <tr style="background-color:lightblue;">
                        <th style="text-align:left">Título</th>
                        <th style="text-align:left">Artista</th>
                        <th style="text-align:left">Disco</th>
                    </tr>
                    <xsl:for-each select="MisCancionesPreferidas/archivo"> <!--<xsl:for
                        each select=“expresión-XPath”>-->
                    <xsl:sort select="canción" /> <!--Ordena
                        por cancion-->
                        <tr>
                            <td>
                                <!--Permite
                                extraer el valor de un elemento XML y añadirlo en el archivo de
                                salida-->
                                <xsl:value-of select="canción" /> <!--<xsl:value-of
                                select=“ExpresiónXPath”>-->
                            </td>
                            <td>
                                <xsl:value-of select="artista" />
                            </td>
                            <td>
                                <xsl:value-of select="disco" />
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
<!--Tabla con if-->
                <table style="border: 1px solid blue;">
                    <tr style="background-color:lightblue;">
                        <th style="text-align:left">Título</th>
                        <th style="text-align:left">Artista</th>
                        <th style="text-align:left">Disco</th>
                    </tr>
                    <xsl:for-each select="MisCancionesPreferidas/archivo"> <!--<xsl:for
                        each select=“expresión-XPath”>-->
                    <xsl:if
                            test="artista='Megadeth'">
                            <tr>
                                <td>
                                    <!--Permite
                                    extraer el valor de un elemento XML y añadirlo en el archivo de
                                    salida-->
                                    <xsl:value-of select="canción" /> <!--<xsl:value-of
                                    select=“ExpresiónXPath”>-->
                                </td>
                                <td>
                                    <xsl:value-of select="artista" />
                                </td>
                                <td>
                                    <xsl:value-of select="disco" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
<!--Tabla con choose-->
                <table style="border: 1px solid blue;">
                    <tr style="background-color:lightblue;">
                        <th style="text-align:left">Artista</th>
                        <th style="text-align:left">Título</th>
                        <th style="text-align:left">Disco</th>
                    </tr>
                    <xsl:for-each select="MisCancionesPreferidas/archivo"> <!--<xsl:for
                    each select=“expresión-XPath”>-->
                        <xsl:choose>
                            <xsl:when test="artista='Megadeth'">
                                <tr>
                                    <td>MeGaDeTH</td>
                                    <td>
                                        <xsl:value-of select="canción" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="disco" />
                                    </td>
                                </tr>
                            </xsl:when>
                            <xsl:when test="artista='Metallica'">
                                <tr>
                                    <td>MeTaLLiCa</td>
                                    <td>
                                        <xsl:value-of select="canción" />
                                    </td>
                                    <td>
                                        <xsl:value-of select="disco" />
                                    </td>
                                </tr>
                            </xsl:when>
                        </xsl:choose>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>