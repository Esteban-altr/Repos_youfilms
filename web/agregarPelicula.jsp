<%-- 
    Document   : agregarPelicula
    Created on : 7/09/2020, 11:33:40 AM
    Author     : Usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST">
            <label>Nombre</label>
            <input type="text" name="nombre" class="form-control" value="${editarPelicula[0].Nombre}">
            <label>Año</label>
            <input type="text" name="numAno" class="form-control" value="${editarPelicula[0].ano}">
            <label>Fecha de carga</label>
            <input type="text" name="FechaLanzamiento" class="form-control" value="${editarPelicula[0].FechaLanzamiento}">
            <label>Genero</label>  
            <select name="IdGenero" id="genero" class="form-control">
                <c:forEach var="genero" items="${lsGeneros}">
                    <option value="${genero.id}" >${genero.nombre}</option>   
                </c:forEach>
            </select>  
            <input type="submit" value="Agregar" class="btn btn-sucess">
            <a href="index.htm">Regresar</a>
        </form>
    </body>
</html>
