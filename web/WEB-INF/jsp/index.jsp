<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">

        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/jquery-3.4.1.js" type="text/javascript"></script>
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <title>Welcome to Spring Web MVC project</title>
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


    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100" src="img/dark.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="img/n.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="img/sao.jpg" alt="Third slide">
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</body>
</html>
