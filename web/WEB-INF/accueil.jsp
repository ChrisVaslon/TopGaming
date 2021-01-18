<%-- 
    Document   : test
    Created on : 18 janv. 2021, 10:19:47
    Author     : thula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Accueil</title>
    </head>
    <body>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
            <!-- Links -->
            <ul class="navbar-nav">

                <li class="nav-item">
                    <a class="nav-link" href="#">Accueil</a>
                </li>
                <!-- Dropdown -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                        Categorie
                    </a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Aventure</a>
                        <a class="dropdown-item" href="#">Rpg</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Nous Contacter</a>
                </li>


            </ul>

            <ul class="navbar-nav ml-auto" >
                <li class="nav-item">

                    <a class="nav-link" href="#"><i class="fas fa-shopping-cart"></i> Panier</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-user"></i> Inscription</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-sign-in-alt"></i> Connexion</a>
                </li>
            </ul>

        </nav>


        <div class="input-group w-50 m-auto pt-5">
            <input type="search" placeholder="Recherche" aria-describedby="button-addon5" class="form-control">
            <div class="input-group-append">
                <button id="button-addon5" type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>
            </div>
        </div>

        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-50 m-auto" src="images/amongus.jpg" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-50 m-auto" src="images/mine.jpg" alt="Second slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-50 m-auto" src="images/acval.jpg" alt="Third slide">
                </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only" >Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>

        <div class="container ">
            <div class="row">
                <div class="col-12 col-sm-6 col-md-4 my-3">
                    <div class="card h-100">
                        <img class="card-img-top" src="images/amongus.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Among us</h5>
                            <p class="card-text">3.99€</p>
                            <a href="#" class="btn btn-primary">Acheter</a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-6 col-md-4 my-3">
                    <div class="card h-100">
                        <img class="card-img-top" src="images/mine.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Minecraft</h5>
                            <p class="card-text">16.99€</p>
                            <a href="#" class="btn btn-primary">Acheter</a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-6 col-md-4 my-3">
                    <div class="card h-100">
                        <img class="card-img-top" src="images/acval.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Assassin's reed valhalla</h5>
                            <p class="card-text">59.99€</p>
                            <a href="#" class="btn btn-primary">Acheter</a>
                        </div>
                    </div>   
                </div>
           
                <div class="col-12 col-sm-6 col-md-4 my-3">
                    <div class="card h-100">
                        <img class="card-img-top" src="images/amongus.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Among us</h5>
                            <p class="card-text">3.99€</p>
                            <a href="#" class="btn btn-primary">Acheter</a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-6 col-md-4 my-3">
                    <div class="card h-100">
                        <img class="card-img-top" src="images/mine.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Minecraft</h5>
                            <p class="card-text">16.99€</p>
                            <a href="#" class="btn btn-primary">Acheter</a>
                        </div>
                    </div>
                </div>
                <div class="col-12 col-sm-6 col-md-4 my-3">
                    <div class="card h-100">
                        <img class="card-img-top" src="images/acval.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Assassin's reed valhalla</h5>
                            <p class="card-text">59.99€</p>
                            <a href="#" class="btn btn-primary">Acheter</a>
                        </div>
                    </div>   
                </div>
            </div>  
        </div> 




        

        <!-- Site footer -->
        <footer class="site-footer">
            <h1>Suivez-nous sur les réseaux sociaux</h1>
            <div class="icons">
                <a href="#"><i class="fab fa-facebook"></i></a>
                <a href="#"><i class="fab fa-twitter"></i></a>
                <a href="#"><i class="fab fa-linkedin"></i></a>
            </div>
            <p>Copyright @2021-projet_CDA</p>
        </footer>


        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
    </body>
</html>
