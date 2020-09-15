<%-- 
    Document   : editarPelicula
    Created on : 9/09/2020, 09:58:42 AM
    Author     : Usuario
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="bootstrap/css/proyecto.css" rel="stylesheet" type="text/css">
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/jquery-3.4.1.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>Editar Pelicula</title>
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
                        <a href="indexSerieGenero.htm" class="nav-link">SerieGenero</a>
                    </li>
                    <li class="nav-item">
                        <a href="indexTemporada.htm" class="nav-link">Temporada</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- Fin Navbar -->








        <!-- Actualizar Datos -->
        <div class="container mt-5">
            <div class="card border-info">
                <div class="card-header bg-dark">
                    <h5 style="color: whitesmoke;">Editar Pelicula</h5>
                </div>
                <div class="card-body text-center">

        <form method="POST">
            <div class="imagen">
                <img src="${editPelicula[0].LinkImg}"/>		
            </div>
            <div class="contenedor">
                <label>Nombre</label>
                <input type="text" name="Nombre" class="form-control" value="${editPelicula[0].Nombre}">   
                <br>
                <label>Año</label>
                <input type="text" name="Ano" class="form-control" value="${editPelicula[0].Ano}">   
                <br>
                <label>Fecha de carga</label>
                <input type="text" name="FechaLanzamiento" class="form-control" value="${editPelicula[0].FechaLanzamiento}">   
                <br>
                <br>
                <label>link img</label>
                <input type="text" name="LinkImg" class="form-control" value="${editPelicula[0].LinkImg}">   
                <br>
                <label>Genero</label>  
                <select name="IdGenero" id="genero" class="form-control">
                    <c:forEach var="genero" items="${lsGeneros}">
                        <c:if test="${genero.id!=editPelicula[0].idGenero}">
                            <option value="${genero.id}" >${genero.Nombre}</option>                                     
                        </c:if>
                        <c:if test="${genero.id==editPelicula[0].idGenero}">
                            <option value="${genero.id}"  selected="">${genero.Nombre}</option>                                     
                        </c:if>
                    </c:forEach>                                    
                </select> 
                <input type="submit" value="Actualizar" class="btn btn-success">
            </div>
        </form>
                </div>
                <div class="card-footer text-muted bg-dark">
                    <a class="btn btn-outline-success" href="indexAnime.htm">Volver</a>
                </div>
            </div>
        </div>
        <!--Fin Actualizar Datos -->
    </body>
</html>

