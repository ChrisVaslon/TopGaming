<%-- 
    Document   : details_catalogue
    Created on : 19 janv. 2021, 18:44:29
    Author     : Ousseynou
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"> 


        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">




        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>

        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Détails Du Jeu</title>
    </head> 
    <body>


        <c:import url="/menu-main" />
        <div class="container">
            <h1>Détails Du Jeu !</h1>

            <c:if test="${empty requestScope.jeu}">
                <p> Jeu introuvable </p>
            </c:if>
            <c:if test="${not empty requestScope.jeu}">
                <div class="row">
                    <div class="col-lg-6 d-flex justify-content-between">
                        <img  src='images/jeux-accueil/<c:out value="${requestScope.jeu.image}" />' 
                              alt='couverture <c:out value="${requestScope.jeu.nom}" />'>

                        <div class="col-lg-6">
                            <p> titre : <c:out value="${requestScope.jeu.nom}" /> </p>

                            <p> PrixHT : <c:out value="${requestScope.jeu.prixHT}" /> </p>

                            <p> PrixTTC : <c:out value="${requestScope.jeu.prixTTC}" /> </p>

                            <a class="btn btn-outline-primary"
                               href='panier?operation=ajouter&id=<c:out value="${jeu.id}"/>'>Ajouter au panier</a>



                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <p> Resumé : <c:out value="${requestScope.jeu.description}" /> </p>

                        </div>
                            
                            <div class="col-lg-12">
                                <p>Evaluation du jeu</p> 
                    

                        </div>
                    </div>
                </div>

            </c:if>

            <div class="row">

                <div class="col-lg-12">
                    <form>
                        <div class="form-floating mb-3">
                            <textarea class="form-control h-100 text-dark" id='contenu-form'
                                      placeholder="Indiquez votre commentaire ici"></textarea>
                            <label for="contenu-form">Votre commentaire</label>
                        </div>
                        <button class="btn btn-primary btn-soumission">Soumettre commentaire</button>
                    </form>
                </div>

            </div>
        </div>
        <!-- Site footer -->
        <c:import url="WEB-INF/menus/menus-footer.jsp" />









        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
    </body>
</html>