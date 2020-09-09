<%-- 
    Document   : agregarPelicula
    Created on : 8/09/2020, 11:24:13 PM
    Author     : Usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/jquery-3.4.1.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>Agregar Pelicula</title>
    </head>
    <body>
        <form method="POST">
            <label>Nombre</label>
            <input type="text" name="Nombre" class="form-control">   
            <br>
            <label>Año</label>
            <input type="text" name="Ano" class="form-control">   
            <br>
            <label>CantidadTemporadas</label>
            <input type="text" name="FechaLanzamiento" class="form-control">   
            <br>
            <label>Genero</label>                        
            <select name="IdGenero" id="genero" class="form-control">
                <c:forEach var="genero" items="${lsGeneros}">
                    <option value="${genero.id}" >${genero.nombre}</option>   
                </c:forEach>
            </select>  
            <input type="submit" value="Agregar" class="btn btn-success">
        </form>
        <div class="card-footer text-muted bg-dark">
            <a class="btn btn-outline-success" href="indexAnime.htm">Volver</a>
        </div>
    </body>
</html>
