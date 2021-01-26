<%-- 
    Document   : test
    Created on : 18 janv. 2021, 10:19:47
    Author     : thula
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <link
            rel="stylesheet"
            href="https://unpkg.com/swiper/swiper-bundle.min.css"
            />
        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

        <!-- <link href="css/style.css" rel="stylesheet" type="text/css"/> -->
        <title>Accueil</title>
    </head> 
    <body>

        <c:import url="/menu-main" />

        <div class="input-group w-50 m-auto pt-5">
            <input type="search" placeholder="Recherche" aria-describedby="button-addon5" class="form-control">
            <div class="input-group-append">
                <button id="button-addon5" type="submit" class="btn btn-dark">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                    <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
                    </svg>
                </button>
            </div>
        </div>

        <div class="swiper-container container my-5" >
            <div class="swiper-wrapper">
                <c:forEach items="${requestScope.jeu}" var="jeu">
                    <div class="swiper-slide div-slide">
                        <a href='jeu?id=<c:out value="${jeu.id}"/>'>                            
                         <img class="d-block h-100 w-100" src='images/slide-accueil/<c:out value="${jeu.image}" />' alt='<c:out value="${jeu.nom}" />'>
                        
                        </a>                       
                    </div>
                </c:forEach>

            </div>

        </div>       


        <div class="container ">
            <c:forEach items="${requestScope.categories}" var="jeu">
                <div class="card mb-4" style="min-width:18rem; max-width:18rem;">
                    <a href='vers-jeu?id=<c:out value="${jeu.id}"/>'> <img class="card-img-top" src='images/jeux-accueil/<c:out value="${jeu.image}" />' alt='couverture <c:out value="${jeu.nom}" />'></a>
                    <div class="card-body">
                        <h1 class="h3"><a href='vers-jeu?id=<c:out value="${jeu.id}"/>'><c:out value="${jeu.nom}" /></a></h1>

                        <p class="card-text">Prix HT : <fmt:formatNumber value="${jeu.prixHT}" minFractionDigits="2" maxFractionDigits="2"/> £</p>



                        <p>Taux TVA : <c:out value="${jeu.tva.montant}"/> </p>



                        <p class="prixttc">Prix TTC : <fmt:formatNumber value="${jeu.prixTTC}" minFractionDigits="2" maxFractionDigits="2"/> £</p> 
                        <a href='panier?operation=ajouter&id=<c:out value="${jeu.id}"/>'>Ajouter au panier</a>

                    </div>
                </div>
            </c:forEach>





        </div> 






        <!-- Site footer -->
        <c:import url="WEB-INF/menus/menus-footer.jsp" />





        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="js/swipper.js" type="text/javascript"></script>

    </body>
</html>