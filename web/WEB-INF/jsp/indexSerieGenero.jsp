<%-- 
    Document   : indexSerieGenero
    Created on : 07-sep-2020, 17:43:58
    Author     : User
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
        <title>JSP Page</title>
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
                        <a href="indexDetalleTemporada.htm" class="nav-link">DetalleTemporada</a>
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
                        <a href="indexSerieGenero.htm" class="nav-link">SerieGenero</a>
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
                    <a class="btn btn-info regDepto" href="agregarSerieGenero.htm">Nuevo registro</a>
                </div>
                <div class="card-body text-center">
                  
                    <table class="table table-hover table-responsive-md table-responsive-sm table-responsive-lg">
                        <thead class="bg-secondary">
                            <tr>                               
                                <th style="color: whitesmoke;">Serie</th>                               
                                <th style="color: whitesmoke;">Genero</th>        
                                <th style="color: whitesmoke;">Actualizar</th>     
                                <th style="color: whitesmoke;">Eliminar</th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach var="seriegenero" items="${lsSerieGenero}">
                                <tr>                               
                                    <td>${seriegenero.nomSerie}</td>                                   
                                    <td>${seriegenero.nomGenero}</td>   
                                    <td>
                                        <a href="editarSerieGenero.htm?id=${seriegenero.id}" class="btn btn-success">Editar</a>
                                    </td>
                                    <td>
                                        <a onclick="return confirm('¿Esta seguro?');" href="deleteSerieGenero.htm?id=${seriegenero.id}" class="btn btn-dark">Eliminar</a>
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
