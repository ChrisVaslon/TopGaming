<%-- 
    Document   : action
    Created on : 23 janv. 2021, 09:24:26
    Author     : Djouela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Categories</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
 
        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
 
    </head> 
    <body>

        <c:import url="/menu-main" />

        <!-- content -->
 
        <div class="container">
 
            <h1>Sport </h1>                            
            <div class="row">

                <c:forEach items="${requestScope.categories}" var="jeu">
 
                    <div class="col-lg-4 ">
                        <div class="card mb-3"  > 

                            <a href='jeu?id=<c:out value="${jeu.id}"/>'> <img class="card-img-top w-100 h-100" src='images/jeux-accueil/<c:out value="${jeu.image}" />' alt='couverture <c:out value="${jeu.nom}" />'></a>
                            <div class="card-body">
                                <h6 class="card-title"><a href='jeu?id=<c:out value="${jeu.id}"/>'><c:out value="${jeu.nom}" /></a></h6>

                                <p class="card-text text-dark">Prix HT : <fmt:formatNumber value="${jeu.prixHT}" minFractionDigits="2" maxFractionDigits="2"/> €</p>



                                <p class="text-dark">Taux TVA : <c:out value="${jeu.tva.montant}"/> </p>



                                <p class="text-dark">Prix TTC : <fmt:formatNumber value="${jeu.prixTTC}" minFractionDigits="2" maxFractionDigits="2"/> €</p> 
                                <a class="btn btn-outline-primary"
                                   href='panier?operation=ajouter&id=<c:out value="${jeu.id}"/>'>Ajouter au panier</a>
 

                            </div>
                        </div> 
                    </div>
                </c:forEach>
            </div>
        </div>








        <!-- Site footer -->
        <c:import url="WEB-INF/menus/menus-footer.jsp" />





        <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
        <script src="js/swipper.js" type="text/javascript"></script>

    </body>
</html>

