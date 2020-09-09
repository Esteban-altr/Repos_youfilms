<%-- 
    Document   : indexPelicula
    Created on : 8/09/2020, 11:41:38 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/jquery-3.4.1.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-light regDepto" href=".htm">Nuevo registro</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover"> 
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Año</th>
                                <th>Fecha de carga</th>
                                <th>Genero</th>
                            </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="Pelicula" items="${lsPelicula}">
                            <tr>
                                <td>${Pelicula.nombre}</td>
                                <td>${Pelicula.Año}</td>
                                <td>${Pelicula.FechaLanzamiento}</td>
                                <td>${Pelicula.nomGenero}</td>
                                <td>
                                    <a href="editarPelicula.htm?id=${Pelicula.id}" class="btn btn-outline-success">Editar</a>
                                    <a onclick="return confirm('¿Estas Seguro?');" href="deletePelicula.htm?id=${Pelicula.id}" class="btn btn-outline-danger">Eliminar</a>                                    
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>  
        <div class="contenido">

        </div>   
    </body>
</body>
</html>
