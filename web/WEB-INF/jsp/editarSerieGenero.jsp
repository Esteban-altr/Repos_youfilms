<%-- 
    Document   : editarSerieGenero
    Created on : 07-sep-2020, 17:53:14
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
                    <h5 style="color: whitesmoke;">Editar SerieGenero</h5>
                </div>
                <div class="card-body text-center">                    
                   <form method="POST">
                        <br>
                        
                        <label>Serie</label>
                        <select name="IdSerie" id="serie" class="form-control">
                            <c:forEach var="serie" items="${lsSeries}">
                                <c:if test="${serie.id!=editSerieGenero[0].idSerie}">
                                    <option value="${serie.id}" >${temporada.nombre}</option>                                     
                                </c:if>
                                <c:if test="${serie.id==editSerieGenero[0].idSerie}">
                                    <option value="${serie.id}"  selected="true">${serie.nombre}</option>                                     
                                </c:if>
                            </c:forEach>                                    
                        </select> 
                        <br>
                        <label>Genero</label>  
                        <select name="IdGenero" id="genero" class="form-control">
                            <c:forEach var="genero" items="${lsGeneros}">
                                <c:if test="${genero.id!=editSerieGenero[0].idGenero}">
                                    <option value="${genero.id}" >${genero.Nombre}</option>                                     
                                </c:if>
                                <c:if test="${genero.id==editSerieGenero[0].idGenero}">
                                    <option value="${genero.id}"  selected="true">${genero.Nombre}</option>                                     
                                </c:if>
                            </c:forEach>                                    
                        </select> 
                        <br>
                        <input type="submit" value="Actualizar" class="btn btn-success">

                    </form>
                </div>
                <div class="card-footer text-muted bg-dark">
                    <a class="btn btn-outline-success" href="indexSerieGenero.htm">Volver</a>
                </div>
            </div>
        </div>
        <!--Fin Actualizar Datos -->
    </body>
</html>
