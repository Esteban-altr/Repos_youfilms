<%-- 
    Document   : indexCapitulo
    Created on : 9/09/2020, 08:01:28 PM
    Author     : Usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/jquery-3.4.1.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>Lista Capitulo</title>
    </head>
    <body>
         <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a href="index.htm" class="nav-link">INICIO <span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item">
                        <a href="indexAnime.htm" class="nav-link">Anime</a>
                    </li>
                    <li class="nav-item">
                        <a href="indexCapitulo.htm" class="nav-link">Capitulo</a>
                    </li>
                    
                    <li class="nav-item">
                        <a href="indexGenero.htm" class="nav-link">Genero</a>
                    </li>
                    <li class="nav-item">
                        <a href="indexPelicula.htm" class="nav-link">Pelicula</a>
                    </li>
                    <li class="nav-item">
                        <a href="indexPelisGenero.htm" class="nav-link">PelisGenero</a>
                    </li>
                    <li class="nav-item">
                        <a href="indexSerie.htm" class="nav-link">Serie</a>
                    </li>
                    <li class="nav-item">
                        <a href="indexSerieGenero.htm" class="nav-link">Serie Genero</a>
                    </li>
                    <li class="nav-item">
                        <a href="indexTemporada.htm" class="nav-link">Temporada</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- Fin Navbar -->








        <!-- Mostrar Datos -->
        <div class="container mt-5">
            <div class="card  border-info">
                <div class="card-header bg-dark">
                    <a class="btn btn-info regDepto" href="agregarCapitulo.htm">Nueva Capitulo</a>
                </div>
                <div class="card-body text-center">
                  
                    <table class="table table-hover table-responsive-md table-responsive-sm table-responsive-lg">
                        <thead class="bg-secondary">
                            <tr>                               
                                <th style="color: whitesmoke;">Numero del Capitulo</th>                               
                                <th style="color: whitesmoke;">Nombre</th>                               
                                <th style="color: whitesmoke;">Temporada</th>    
                                <th style="color: whitesmoke;">Actualizar</th>     
                                <th style="color: whitesmoke;">Eliminar</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach var="Capitulo" items="${lsCapitulo}">
                                <tr>
                                <td>${Capitulo.NumeroCapitulo}</td>
                                <td>${Capitulo.Nombre}</td>
                                <td>${Capitulo.NomTemporada}</td>
                                <td>
                                    <a href="editarCapitulo.htm?id=${Capitulo.id}" class="btn btn-outline-success">Editar</a>
                                    <a onclick="return confirm('¿Estas Seguro?');" href="deletePelicula.htm?id=${Capitulo.id}" class="btn btn-outline-danger">Eliminar</a>                                    
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="card-footer text-muted bg-dark">
                    <a class="btn btn-outline-success" href="index.htm">Volver</a>
                </div>
            </div>
        </div>
        <!--Fin Mostrar Datos -->
    </body>
</html>